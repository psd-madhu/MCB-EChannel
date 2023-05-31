package com.mcb.echannel.verification.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mcb.echannel.verification.model.CallBackInfo;
import com.mcb.echannel.verification.model.EventSource;
import com.mcb.echannel.verification.repository.EChannelVerificationRepository;

@Service
public class EChannelVerificationServiceImpl implements EChannelVerificationService{

	@Autowired
	private EChannelVerificationRepository eChannelVerificationRepository;
	
	@Override
	public EventSource addEChannel(EventSource eventSource) {
		eventSource.setCreatedOn(new Date());
		return eChannelVerificationRepository.save(eventSource);
	}

	@Override
	public List<EventSource> getEChannelList(List<String> businessKeys) {
		return eChannelVerificationRepository.findAll()
				.stream()
				.filter(e -> businessKeys.contains(e.getBusinessKey()))
				.collect(Collectors.toList());
	}
	
	@Override
	public EventSource getEChannel(String businessKeys) {
		return eChannelVerificationRepository.findById(businessKeys).get();		
	}
	
	@Override
	public EventSource updateEChannel(CallBackInfo callBckInfo, String businessKey) {
		Optional<EventSource> event = eChannelVerificationRepository.findById(businessKey);
		
		event.get().setOutcome(callBckInfo.getOutcome());
		event.get().setExtension(callBckInfo.getExtension());
		event.get().setContactPerson(callBckInfo.getContactPerson());
		event.get().setCustomerCalledOn(callBckInfo.getCustomerCalledOn());
		event.get().setComment(callBckInfo.getComment());
		event.get().setUpdatedBy(callBckInfo.getUpdatedBy());
		event.get().setUpdatedOn(new Date());
		event.get().setStatus(callBckInfo.getStatus());
			
		return eChannelVerificationRepository.save(event.get());
	}

	@Override
	public Map<String, Long> getCountByStatus() {
		return eChannelVerificationRepository.findAll()
				.stream()
				.collect(Collectors.groupingBy(EventSource::getStatus, Collectors.counting()));
	}

	@Override
	public List<EventSource> getAllEChannel() {
		return eChannelVerificationRepository.findAll();
	}

}

package com.mcb.echannel.verification.service;

import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mcb.echannel.verification.model.CallBackInfo;
import com.mcb.echannel.verification.model.EventSource;

@Service
public interface EChannelVerificationService {

	public EventSource addEChannel(EventSource eventSource);
	public List<EventSource> getAllEChannel();
	public EventSource getEChannel(String businessKeys);
	public List<EventSource> getEChannelList(List<String> businessKeys);
	public EventSource updateEChannel(CallBackInfo callBckInfo, String businessKey);
	public Map<String, Long> getCountByStatus();
}

package com.mcb.echannel.verification.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcb.echannel.verification.model.CallBackInfo;
import com.mcb.echannel.verification.model.EventSource;
import com.mcb.echannel.verification.service.EChannelVerificationService;

@RestController
@RequestMapping("/echannel")
@CrossOrigin(origins = "http://localhost:4200")
public class EChannelVerificationController {
	
	@Autowired
	private EChannelVerificationService eChannelVerificationService;
	
	@PostMapping("/create")
	public EventSource addEChannel(@RequestBody EventSource eventSource) {
		return eChannelVerificationService.addEChannel(eventSource);
	}
	
//	@GetMapping("/get/{businessKey}")
//	public List<EventSource> getEChannel(@PathVariable List<String> businessKey) {
//		return eChannelVerificationService.getEChannelList(businessKey);
//	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/get/{businessKey}")
	public EventSource getEChannel(@PathVariable String businessKey) {
		return eChannelVerificationService.getEChannel(businessKey);
	}
	
	@GetMapping("/list")
	public List<EventSource> getAllEChannel() {
		return eChannelVerificationService.getAllEChannel();
	}
	
	@PatchMapping("/update/{businessKey}")
	public EventSource updateEChannel(@RequestBody CallBackInfo callBckInfo, @PathVariable String businessKey) {
		return eChannelVerificationService.updateEChannel(callBckInfo, businessKey);
	}
	
	@GetMapping("/dataByStatus")
	public Map<String, Long> getCountByStatus() {
		return eChannelVerificationService.getCountByStatus();
	}

}

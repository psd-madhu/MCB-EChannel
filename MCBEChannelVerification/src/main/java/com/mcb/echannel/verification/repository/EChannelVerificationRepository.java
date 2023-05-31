package com.mcb.echannel.verification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcb.echannel.verification.model.EventSource;

public interface EChannelVerificationRepository extends JpaRepository<EventSource, String>{

}

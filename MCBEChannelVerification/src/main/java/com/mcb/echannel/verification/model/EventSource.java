package com.mcb.echannel.verification.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventSource {
	
	@Id
	private String businessKey;
	private String priority;
	private String sourceBU;
	private String dcpReference;
	private String accountName;
	private String transactionCurrency;
	private double transactionAmount;
	private String lockedBy;
	private String debitAccountNumber;
	private String accountCurrency;
	private String beneficiaryName;
	private String custInfoMkr;
	private String accountInfoMkr;
	private String outcome;
	private String extension;
	private String contactPerson;
	private String CustomerCalledOn;
	private String comment;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	private String status;
	
	

}

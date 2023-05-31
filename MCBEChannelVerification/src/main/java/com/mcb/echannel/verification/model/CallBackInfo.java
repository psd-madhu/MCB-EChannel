package com.mcb.echannel.verification.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CallBackInfo {
	
	private String outcome;
	private String extension;
	private String contactPerson;
	private String customerCalledOn;
	private String comment;
	private String updatedBy;
	private Date updatedOn;
	private String status;

}

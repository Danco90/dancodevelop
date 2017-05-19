package com.daniele.switchyard.v1.module.utilities.prototype.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;


/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/17/2017
 * @time 05:02
 * @version 0.2
 * 
 */
public class BaseDto<T> implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	public static enum CallStatus {OK,KO}
	
	@JsonProperty("messageStatus")
	private String messageStatus;
	
	@JsonProperty("eventDate")
	private Date eventDate;
	
	@JsonProperty("callStatus")
	private CallStatus callStatus;
	
	@JsonProperty("response")
	private T message;

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public CallStatus getCallStatus() {
		return callStatus;
	}

	public void setCallStatus(CallStatus callStatus) {
		this.callStatus = callStatus;
	}

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	
	
	
}

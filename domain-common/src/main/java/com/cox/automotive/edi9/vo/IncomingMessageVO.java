package com.cox.automotive.edi9.vo;

public class IncomingMessageVO implements Comparable<IncomingMessageVO>{

	private String messageId;
	private String message;
	private String messageType;
	private String entityId;
	private long auctionId;
	private int serialNumber;
	private int status;
	private String ignoredReason;
	private String processedOn;
	private String createdOn;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public long getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(long auctionId) {
		this.auctionId = auctionId;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getIgnoredReason() {
		return ignoredReason;
	}
	public void setIgnoredReason(String ignoredReason) {
		this.ignoredReason = ignoredReason;
	}
	public String getProcessedOn() {
		return processedOn;
	}
	public void setProcessedOn(String processedOn) {
		this.processedOn = processedOn;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	@Override
	 public int compareTo(IncomingMessageVO anotherInstance) {
	        return this.serialNumber - anotherInstance.serialNumber;
	    }

}

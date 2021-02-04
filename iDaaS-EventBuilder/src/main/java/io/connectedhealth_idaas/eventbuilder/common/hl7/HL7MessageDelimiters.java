package io.connectedhealth_idaas.eventbuilder.common.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * Designed for data attributes used for message parsing
 */
public class HL7MessageDelimiters {
	String msgSegmentDelimiter;
	String msgComponentDelimiter;
	String msgFieldRepeaterDelimiter;
	String msgFieldDelimiter;
	String msgSubComponentDelimiter;
	 
	 
	public String getMsgSegmentDelimiter() {
		return msgSegmentDelimiter;
	}
	public void setMsgSegmentDelimiter(String msgSegmentDelimiter) {
		this.msgSegmentDelimiter = msgSegmentDelimiter;
	}
	public String getMsgComponentDelimiter() {
		return msgComponentDelimiter;
	}
	public void setMsgComponentDelimiter(String msgComponentDelimiter) {
		this.msgComponentDelimiter = msgComponentDelimiter;
	}
	public String getMsgFieldRepeaterDelimiter() {
		return msgFieldRepeaterDelimiter;
	}
	public void setMsgFieldRepeaterDelimiter(String msgFieldRepeaterDelimiter) {
		this.msgFieldRepeaterDelimiter = msgFieldRepeaterDelimiter;
	}
	public String getMsgSubComponentDelimiter() {
		return msgSubComponentDelimiter;
	}
	public void setMsgSubComponentDelimiter(String msgSubComponentDelimiter) {
		this.msgSubComponentDelimiter = msgSubComponentDelimiter;
	}
	public String getMsgFieldDelimiter() {
		return msgFieldDelimiter;
	}
	public void setMsgFieldDelimiter(String msgFieldDelimiter) {
		this.msgFieldDelimiter = msgFieldDelimiter;
	}

	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}

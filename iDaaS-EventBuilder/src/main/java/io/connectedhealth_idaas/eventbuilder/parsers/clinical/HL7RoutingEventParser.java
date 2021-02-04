/**
 * 
 */
package io.connectedhealth_idaas.eventbuilder.parsers.clinical;

import io.connectedhealth_idaas.eventbuilder.common.hl7.HL7SegmentConstants;
import io.connectedhealth_idaas.eventbuilder.events.platform.RoutingEvent;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alan Scott
 *
 */
public class HL7RoutingEventParser {

	private static final Logger LOG = LoggerFactory.getLogger(HL7RoutingEventParser.class);

	public HL7RoutingEventParser() {

	}

	public RoutingEvent buildRoutingEvent(String body) {
		RoutingEvent routingEvent = new RoutingEvent();

		// Delimiters
		String fieldDelimiter;
		String componentDelimiter;
		String subComponentsDelimiter;
		String fieldRepeaterDelimiter;
		String escapeDelimiter;
		// MSH Segment Details
		String[] mshSegmentDetails;
		// Variables used within Parsing
		String uMessageID = null;
		String messageDateTme = null;
		/*
		 * Parse Message and build events
		 */
		String[] messageSegments = body.split(HL7SegmentConstants.DEFAULT_SEGMENT_DELIMITER);
		for (String segmentData : messageSegments) {
			if (segmentData.substring(0, 3).equals("MSH")) {
				// Parse MSH and Populating Parsing Variables
				fieldDelimiter = segmentData.substring(3, 4);
				componentDelimiter = segmentData.substring(4, 5);
				fieldRepeaterDelimiter = segmentData.substring(6,7);
				escapeDelimiter = segmentData.substring(7,8);
				// Spilt MSH Segment
				String msgSegment = segmentData;
				String[] segmentDetails = segmentData.split("["+fieldDelimiter+"]",0);
				LOG.debug("Segment Count {}", segmentDetails.length);
				// Splitting Routing Data
				String messageTypeData = segmentDetails[8].toString();
				//String[] messageTypeDetails = messageTypeData.split("["+componentDelimiter+"]");
				// Splitting MessageTime
				String messageDateTime = segmentDetails[6].toString();
				String messageSendingDate = messageDateTime.substring(0,8);
				String messageSendingHour = messageDateTime.toString().substring(8,10);
				String messageSendingTime = messageDateTime.toString().substring(8,messageDateTime.length());
				// Create UMID ID
				String messageUMID = segmentDetails[3].toString()+"_"+segmentDetails[2].toString()+"_"+
						messageTypeData.substring(0,3)+"_"+ segmentDetails[9].toString();
				// Populate into Routing Event
				routingEvent.setSendingApp(segmentDetails[2].toString());
				routingEvent.setFacilityId(segmentDetails[3].toString());
				routingEvent.setIndustryStd("HL7v2");
				routingEvent.setMessageDateTime(segmentDetails[6].toString());
				routingEvent.setMessageDate(messageSendingDate);
				routingEvent.setMessageHour(messageSendingHour);
				routingEvent.setMessageTime(messageSendingTime);
				routingEvent.setMessageType(messageTypeData.substring(0,3));
				routingEvent.setMessageEvent(messageTypeData.substring(4,7));
				routingEvent.setMessageId(segmentDetails[9].toString());
				routingEvent.setUniqueMessageId(messageUMID);
				routingEvent.setMessageVersion(segmentDetails[11].toString());
				routingEvent.setMessageData(body);
			}
			// end of for loop
		}

		return routingEvent;
	}

	public String toString()
	{
		return ReflectionToStringBuilder.toString(this);
	}
}

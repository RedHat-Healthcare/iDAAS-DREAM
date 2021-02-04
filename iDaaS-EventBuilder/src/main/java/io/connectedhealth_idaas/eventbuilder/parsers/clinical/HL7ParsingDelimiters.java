/**
 * 
 */
package io.connectedhealth_idaas.eventbuilder.parsers.clinical;

import io.connectedhealth_idaas.eventbuilder.common.hl7.HL7MessageDelimiters;

/**
 * @author Alan Scott 
 * 
 * 	Designed for being able to support HL7 Parsing attributes 
 *
 */
public class HL7ParsingDelimiters {

	public static HL7MessageDelimiters buildDelimiters(String segmentData)
	{
		HL7MessageDelimiters hl7Delimiters = new HL7MessageDelimiters();

		return hl7Delimiters;
	}
}

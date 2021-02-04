package io.connectedhealth_idaas.eventbuilder.parsers.financial;

import io.connectedhealth_idaas.eventbuilder.events.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.parsers.financial.SegmentConstants;

public class EDIClaimspPrser {

    public String[] returnEDISegments(String msgBody) {
        String[] ediSegments;
        ediSegments= msgBody.split(SegmentConstants.DEFAULT_SEGMENT_DELIMITER);
        return ediSegments;
    }

    public String[] returnEDISegmentFields(String msgSegment) {
        String[] ediSegmentField;
        ediSegmentField= msgSegment.split(SegmentConstants.DEFAULT_FIELD_DELIMITER);
        return ediSegmentField;
    }

}

/*
 * Copyright 2019 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package io.connectedhealth_idaas.eventbuilder.events.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TransactionEvent {

  private String sendingApp;
  private String facilityId;
  private String messageDate;
  private String messageTime;
  private String messageHour;
  private String messageType;
  private String messageEvent;
  private String industryStandardName;
  private String messageId;
  private String uniqueMessageId;
  private String messageVersion;
  private String messageData;
  private String platformModule;
  private String processingComponent;
  private String processingState;
  private String processingStatus;
  private String industryStd;

  public String getSendingApp() {
    return sendingApp;
  }

  public void setSendingApp(String sendingApp) {
    this.sendingApp = sendingApp;
  }

  public String getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(String facilityId) {
    this.facilityId = facilityId;
  }

  public String getMessageDate() {
	return messageDate;
}

public void setMessageDate(String messageDate) {
	this.messageDate = messageDate;
}

public String getMessageTime() {
	return messageTime;
}

public void setMessageTime(String messageTime) {
	this.messageTime = messageTime;
}

public String getMessageHour() {
	return messageHour;
}

public void setMessageHour(String messageHour) {
	this.messageHour = messageHour;
}

public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public String getMessageEvent() {
    return messageEvent;
  }

  public void setMessageEvent(String messageEvent) {
    this.messageEvent = messageEvent;
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getIndustryStandardName() {
    return industryStandardName;
  }

  public void setIndustryStandardName(String industryStandardName) {
    this.industryStandardName = industryStandardName;
  }

  public String getUniqueMessageId() {
    return uniqueMessageId;
  }

  public void setUniqueMessageId(String uniqueMessageId) {
    this.uniqueMessageId = uniqueMessageId;
  }

  public String getMessageVersion() {
    return messageVersion;
  }

  public void setMessageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
  }

  public String getMessageData() {
    return messageData;
  }

  public void setMessageData(String messageData) {
    this.messageData = messageData;
  }

  public String getPlatformModule() {
    return platformModule;
  }

  public void setPlatformModule(String platformModule) {
    this.platformModule = platformModule;
  }

  public String getProcessingComponent() {
    return processingComponent;
  }

  public void setProcessingComponent(String processingComponent) {
    this.processingComponent = processingComponent;
  }

  public String getProcessingState() {
    return processingState;
  }

  public void setProcessingState(String processingState) {
    this.processingState = processingState;
  }

  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

public String getIndustryStd() {
	return industryStd;
}

public void setIndustryStd(String industryStd) {
	this.industryStd = industryStd;
}

//toString 
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}
}

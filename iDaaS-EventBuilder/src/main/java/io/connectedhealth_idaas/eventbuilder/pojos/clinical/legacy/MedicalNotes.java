package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * Meant to provide an object to work with that represent Medical Notes
 *
 */
public class MedicalNotes {
	
	  private String commentSetID;
	  private String commentSource;
	  private String commentDetail;
	  private String commentType;
	  
	  public String getCommentSetID() {
		return commentSetID;
	}
	public void setCommentSetID(String commentSetID) {
		this.commentSetID = commentSetID;
	}
	public String getCommentSource() {
		return commentSource;
	}
	public void setCommentSource(String commentSource) {
		this.commentSource = commentSource;
	}
	public String getCommentDetail() {
		return commentDetail;
	}
	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}
	public String getCommentType() {
		return commentType;
	}
	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}

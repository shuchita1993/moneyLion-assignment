package com.moneylion.exercise.assignment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_FEATURE")
public class UserFeatureMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "EMAIL_ID")
	private String userId;

	@Column(name = "FEATURE_NAME")
	private String featureName;

	@Column(name = "FEATURE_ON_OFF")
	private Boolean featureOnOff;

	public UserFeatureMap() {
		super();
	}

	/**
	 * @param id
	 * @param userId
	 * @param featureName
	 * @param featureOnOff
	 */
	public UserFeatureMap(String id, String userId, String featureName, Boolean featureOnOff) {
		super();
		this.id = id;
		this.userId = userId;
		this.featureName = featureName;
		this.featureOnOff = featureOnOff;
	}



	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the featureName
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * @param featureName the featureName to set
	 */
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	/**
	 * @return the featureOnOff
	 */
	public Boolean getFeatureOnOff() {
		return featureOnOff;
	}

	/**
	 * @param featureOnOff the featureOnOff to set
	 */
	public void setFeatureOnOff(Boolean featureOnOff) {
		this.featureOnOff = featureOnOff;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


}

package com.moneylion.exercise.assignment.dto;

public class FeatureDtoRequest{

	private String userId;
	private String featureName;
	private Boolean featureOnOff;

	public FeatureDtoRequest() {

	}

	public FeatureDtoRequest(String userId, String featureName, Boolean featureOnOff) {
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


}

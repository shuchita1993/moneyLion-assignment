package com.moneylion.exercise.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneylion.exercise.assignment.dao.FeatureRepository;
import com.moneylion.exercise.assignment.dto.FeatureDtoRequest;
import com.moneylion.exercise.assignment.dto.FeatureDtoResponse;
import com.moneylion.exercise.assignment.model.UserFeatureMap;

@Service
public class FeatureService {

	@Autowired
	FeatureRepository repositry;

	public boolean addFeature(FeatureDtoRequest dto){

		UserFeatureMap entity= new UserFeatureMap();
		entity.setId(String.valueOf(System.nanoTime()));
		entity.setFeatureName(dto.getFeatureName());
		entity.setFeatureOnOff(dto.getFeatureOnOff());
		entity.setUserId(dto.getUserId());
		if(repositry.save(entity) != null) {
			return true;
		}else {
			return false;
		}
	}

	public FeatureDtoResponse checkForAccess(FeatureDtoRequest dto){

		UserFeatureMap entity= new UserFeatureMap();
		FeatureDtoResponse response = new FeatureDtoResponse();
		entity.setUserId(dto.getUserId());
		entity.setFeatureName(dto.getFeatureName());

		entity = repositry.findByEmailFeatureName(dto.getFeatureName(), dto.getUserId());
		response.setCanAccess(entity.getFeatureOnOff());
		return response;

	}
}

package com.moneylion.exercise.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moneylion.exercise.assignment.dto.FeatureDtoRequest;
import com.moneylion.exercise.assignment.dto.FeatureDtoResponse;
import com.moneylion.exercise.assignment.service.FeatureService;


@RestController
public class FeatureController {

	@Autowired
	private FeatureService featureService;

	@GetMapping("/feature/{email}/{featureName}")
	public FeatureDtoResponse getFeatureAccess(@PathVariable("email") String email,
			@PathVariable("featureName") String featureName) {
		FeatureDtoRequest dto=new FeatureDtoRequest();
		dto.setFeatureName(featureName);
		dto.setUserId(email);
		FeatureDtoResponse response =featureService.checkForAccess(dto);
		return response;
	}

	@PostMapping("/feature")
	public ResponseEntity<String> addFeature(@RequestBody FeatureDtoRequest requestUserDetails) {

		try {
			boolean isSave =  featureService.addFeature(requestUserDetails);

			if(isSave) {
				return ResponseEntity.status(HttpStatus.OK).body("Feature added");
			}else {
				return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body("Feature not added");
			}
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body("Feature not added");
		}
	}
}

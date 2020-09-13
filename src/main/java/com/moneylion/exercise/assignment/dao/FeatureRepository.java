package com.moneylion.exercise.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.moneylion.exercise.assignment.model.UserFeatureMap;

@Repository
public interface FeatureRepository extends JpaRepository<UserFeatureMap, Long> {
	
	public final static String GET_FEATURE_ON_OFF = "SELECT l FROM UserFeatureMap l WHERE l.featureName = :featureName and l.userId= :email";

	@Query(GET_FEATURE_ON_OFF)
	UserFeatureMap findByEmailFeatureName(@Param("featureName") String featureName,
			@Param("email") String email);

}

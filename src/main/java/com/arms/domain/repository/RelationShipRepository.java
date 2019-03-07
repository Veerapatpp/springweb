package com.arms.domain.repository;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arms.domain.entity.RelationShip;
@Repository
public interface RelationShipRepository extends JpaRepository<RelationShip, Integer> {

	List<RelationShip> findAllByFollowerId(int followerId);
	List<RelationShip> findAllByUserId(int userId);
}

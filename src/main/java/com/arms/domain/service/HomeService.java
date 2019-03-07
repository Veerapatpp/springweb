package com.arms.domain.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.arms.domain.entity.Micropost;
import com.arms.domain.entity.RelationShip;
import com.arms.domain.repository.RelationShipRepository;

@Service
public class HomeService extends AppService {
	public List<Integer> getMyMicropost(int userId) {
		List<Micropost> micropostList = micropostRepository.findAllByUserId(userId);
		List<Integer> micropostIdList = new ArrayList<>();
		for (Micropost micropost : micropostList) {
			micropostIdList.add(micropost.getId());
		}
		return micropostIdList;
	}

	public Page<Micropost> findAllByIdList(List<Integer> micropostIdList, Pageable pageable) {
		return micropostRepository.findByIdInOrderByUpdatedDesc(micropostIdList, pageable);
	}
	
}
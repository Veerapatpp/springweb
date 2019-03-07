package com.arms.domain.repository;



import java.util.Collection;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arms.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findOneByEmail(String email);
	Page<User> findByIdInOrderByUpdatedDesc(Collection id, Pageable pageable);
}

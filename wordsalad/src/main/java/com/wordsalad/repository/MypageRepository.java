package com.wordsalad.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wordsalad.entity.UserInfo;

public interface MypageRepository extends JpaRepository<UserInfo, String> {
	 
//	Optional<User> findByNickName(String nickname);
}

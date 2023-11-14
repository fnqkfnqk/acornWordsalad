package com.wordsalad.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wordsalad.dto.loginDto;
import com.wordsalad.entity.UserInfo;
import com.wordsalad.repository.loginRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class loginService {

	private final loginRepository loginrepository;
	
	public Optional<UserInfo> loginCheck(loginDto logindto) {
		
		return loginrepository.findByIdAndPw(logindto.getId(), logindto.getPw());
		
	}
	
}

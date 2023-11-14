package com.wordsalad.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wordsalad.dto.registUserDto;
import com.wordsalad.entity.UserInfo;
import com.wordsalad.repository.registUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class registUserService {

	private final registUserRepository registuserrepositoty;

//	회원가입 시 시간 저장 데이터
//	SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:sss");
	SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd");
	Date time = new Date();
	String localTime = format.format(time);

	public void registUser(registUserDto registuserdto) {
		
		UserInfo userinfo = new UserInfo();
		
		registuserdto.setSTATE("user");
		registuserdto.setREGISTDATE(localTime);
		
		userinfo.setId(registuserdto.getId());
		userinfo.setPw(registuserdto.getPw());
		userinfo.setNickname(registuserdto.getNickName());
		userinfo.setTeleNum(registuserdto.getTeleNum());
		userinfo.setCmtCount(0);
		userinfo.setPostCount(0);
		userinfo.setState(registuserdto.getSTATE());
		userinfo.setRegistDate(registuserdto.getREGISTDATE());
	
		registuserrepositoty.save(userinfo);
	}
}

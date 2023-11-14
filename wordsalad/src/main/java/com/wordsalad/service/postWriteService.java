package com.wordsalad.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wordsalad.dto.postWriteDto;
import com.wordsalad.entity.Postinfo;
import com.wordsalad.entity.UserInfo;
import com.wordsalad.repository.postWriteRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class postWriteService {

	private final postWriteRepository postwriterepository;
	
	SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
	Date time = new Date();
	String localTime = format.format(time);
	
	public void postwrite(postWriteDto postwritedto, HttpServletRequest req) {
		
		Postinfo postinfo = new Postinfo();
		UserInfo userinfo = new UserInfo();
		
		String category = "";
		String name = req.getSession().getAttribute("id").toString();
		String state = req.getSession().getAttribute("state").toString();
		
		userinfo.setId(name);
		
		postinfo.setPostnumber(100);
		postinfo.setPosttitle(postwritedto.getPOSTTITLE());
		postinfo.setPostcontents(postwritedto.getPOSTCONTENTS());
		postinfo.setUserinfo(userinfo);
		postinfo.setPostdate(localTime);
		postinfo.setPostlike(0);
		postinfo.setPosthate(0);
		
		if (state.equals("user")) {
			category = "normal";
		}
		else if(state.equals("admin")) {
			category = "notice";
		}
		postinfo.setCategory(category);
		
		postwriterepository.save(postinfo);
	}
	
}

package com.wordsalad.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordsalad.dto.postWriteDto;
import com.wordsalad.entity.UserInfo;
import com.wordsalad.service.postWriteService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class postWriteController {
	
	private final postWriteService postwriteservice;
	
	@GetMapping("/postwrite")
	public String postform(){
		return "postWrite";
	}
	
	
	@PostMapping("/postwrite")
	public String postwrite(@RequestParam("title") String posttitle, @RequestParam("content") String postcontents, HttpServletRequest req) {
		
		System.out.println(posttitle);
		System.out.println(postcontents);
		
		postWriteDto postwritedto = new postWriteDto();
		
		postwritedto.setPOSTTITLE(posttitle);
		postwritedto.setPOSTCONTENTS(postcontents);
		
		postwriteservice.postwrite(postwritedto, req);
		
		return "redirect:/main";
	}
}

package com.wordsalad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordsalad.dto.registUserDto;
import com.wordsalad.service.registUserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class registUserController {
	
	
	private final registUserService rergistuserservice;
	
	@GetMapping("/regist")
	public String registForm(@ModelAttribute registUserDto rud) {
		
		return "registUser";
	}
	
	@PostMapping("/regist")
	public String registUser(@RequestParam("id") String id, @RequestParam("nickName") String nickName,
								@RequestParam("pw") String pw, @RequestParam("teleNum") String teleNum) {
		
		registUserDto registUser = new registUserDto();
		
		registUser.setId(id);
		registUser.setPw(pw);
		registUser.setNickName(nickName);
		registUser.setTeleNum(teleNum);
		
		rergistuserservice.registUser(registUser);
		
		return "redirect:/main";
	}

}

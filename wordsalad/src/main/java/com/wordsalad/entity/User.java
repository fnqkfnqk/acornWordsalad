package com.wordsalad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="userinfo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	
	@Id
	private String id;
	private String pw;
	private String tel;
	private String nickname;
	private int postcount;
	private int commentcount;
	private String state;
	private String registdate;
	
}

// findbyid(string id) return User타입
// user.setpw(컨트롤러에서 받아오는 값)
// user.settel(컨트롤러에서 받아오는 값)
// user.setnickname(컨트롤러에서 받아오는 값)
// user.setstate(컨트롤러에서 받아오는 값)

// mypagerepository.save(user)

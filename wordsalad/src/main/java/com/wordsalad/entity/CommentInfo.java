//package com.wordsalad.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Table(name= "COMMENTINFO")
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor 
//@NoArgsConstructor
//public class CommentInfo {
//	@Id
//	@Column(name="comment_seq")
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int commentId;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name= "postnumber")
//	private Postinfo postinfo;
//	
//	private String commentcontent;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="nickname")
//	// CommentInfo 테이블의 컬럼commentwriter과 외래키관계인 userinfo 테이블의 컬럼nickname의 이름이 다름.
//	private UserInfo userinfo;
//	
//	private String postdate;
//	private int postlike;
//	private int posthate;
//	
//	
//}

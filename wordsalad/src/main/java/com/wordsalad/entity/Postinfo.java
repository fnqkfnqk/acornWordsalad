package com.wordsalad.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "POSTINFO")
@Getter
@Setter
@ToString
//@DynamicInsert  : 부분업데이트하게 해줌
@AllArgsConstructor 
@NoArgsConstructor
public class Postinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postnumber")
	@SequenceGenerator(name = "postnumber", sequenceName = "postnumber", allocationSize = 1)
	private int postnumber;
	
	private String posttitle;
	private String postcontents;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "id")
	private UserInfo userinfo;
	
	private String postdate;
	private int postlike;
	private int posthate;
	private String category;

//	@OneToMany(mappedBy = "postinfo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//	private List<CommentInfo> commentInfo = new ArrayList<CommentInfo>();
	
}
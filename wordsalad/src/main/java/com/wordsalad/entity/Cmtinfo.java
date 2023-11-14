package com.wordsalad.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "COMMENTINFO")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cmtinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
	@SequenceGenerator(name = "comment_seq", sequenceName = "comment_seq", allocationSize = 1)
	private int COMMENT_SEQ;
	private int POSTNUMBER;
	private String COMMENTCONTENTS;
	private String ID;
	private String COMMENTDATE;
	@Builder.Default 
	private int COMMENTLIKE = 0;
	@Builder.Default 
	private int COMMENTHATE = 0;

}

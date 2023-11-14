package com.wordsalad.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class postWriteDto {
	
	private String POSTTITLE;
	private String POSTCONTENTS;
	private String POSTWRITER;
	private String POSTDATE;

}

package com.wordsalad.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wordsalad.dto.PostListDto;
import com.wordsalad.entity.Postinfo;
import com.wordsalad.repository.PostLIstRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class PostListService {
	
	private final PostLIstRepository postListRepository;
	
	public Page<PostListDto> findBycategory(String category, Pageable pageable) {
	
		Page<Postinfo> postList = postListRepository.findByCategory(category, pageable);
		
		List<PostListDto> postListDto = new ArrayList<PostListDto>();
		
		for(Postinfo posts:postList) {
			PostListDto post = new PostListDto(
												posts.getPostnumber(),
												posts.getPosttitle(),
												posts.getPostcontents(),
												posts.getUserinfo().getId(),
												posts.getPostdate(),
												posts.getPostlike(),
												posts.getPosthate(),
												posts.getCategory());
			postListDto.add(post);
		}
		return new PageImpl<PostListDto>(postListDto, pageable, postList.getTotalElements());
	}
}

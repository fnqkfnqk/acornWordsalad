package com.wordsalad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wordsalad.entity.Postinfo;

@Repository
public interface postWriteRepository extends JpaRepository<Postinfo, Integer> {

}

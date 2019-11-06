package com.sathish.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.quiz.domain.AnswerDAO;

public interface AnswerRepository extends JpaRepository<AnswerDAO, Integer> {

}

package com.sathish.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.quiz.domain.QuizDAO;

public interface QuizRepository extends JpaRepository<QuizDAO, Integer> {

}

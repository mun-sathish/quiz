package com.sathish.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.quiz.domain.QuestionDAO;

public interface QuestionRepository extends JpaRepository<QuestionDAO, Integer> {

}

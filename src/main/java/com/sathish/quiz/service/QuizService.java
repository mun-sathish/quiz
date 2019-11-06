package com.sathish.quiz.service;

import java.util.List;

import com.sathish.quiz.domain.EmployeeDAO;
import com.sathish.quiz.domain.QuizDAO;

public interface QuizService {
	
	public List<EmployeeDAO> getAllEmployees();
	public EmployeeDAO getEmployee(String username);
	public EmployeeDAO createEmployee(EmployeeDAO employee);
	
	
//	public List<QuizDAO> getAllQuiz();
//	public QuizDAO getQuiz(int id);
//	public QuizDAO createQuiz(QuizDAO quiz);
//	public QuizDAO updateQuiz(QuizDAO quiz);
//	public void deleteQuiz(QuizDAO quiz);
}

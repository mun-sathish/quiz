package com.sathish.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.quiz.domain.EmployeeDAO;
import com.sathish.quiz.repository.EmployeeRepository;
import com.sathish.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<EmployeeDAO> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeDAO getEmployee(String username) {
		return employeeRepository.findOne(username);
	}

	@Override
	public EmployeeDAO createEmployee(EmployeeDAO employee) {
		employee.init();
		return employeeRepository.save(employee);
	}
}

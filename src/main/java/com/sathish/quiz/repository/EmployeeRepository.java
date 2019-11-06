package com.sathish.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.quiz.domain.EmployeeDAO;

public interface EmployeeRepository extends JpaRepository<EmployeeDAO, String> {

}

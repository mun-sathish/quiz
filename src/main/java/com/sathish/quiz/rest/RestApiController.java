package com.sathish.quiz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;
import com.sathish.quiz.domain.EmployeeDAO;
import com.sathish.quiz.domain.LoginPostRequestDto;
import com.sathish.quiz.service.QuizService;

@RestController
public class RestApiController {

	@Autowired
	QuizService quizService;
	
	Gson gson = new Gson();
	
	public final static String LOGIN_URL = "https://singularity.yodlee.com/singularity/v1/user/login";

	/**
	 * EMPLOYEE (GET / CREATE)
	 * */
	@RequestMapping(method = RequestMethod.POST, path = "/employee")
	public ResponseEntity<EmployeeDAO> createEmployee(@RequestBody EmployeeDAO employee, UriComponentsBuilder builder) {
		quizService.createEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/employee/{username}").buildAndExpand(employee.getUsername()).toUri());
		return new ResponseEntity<EmployeeDAO>(employee, headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/employee/{username}")
	public ResponseEntity<EmployeeDAO> getEmployee(@PathVariable String username) {
		return new ResponseEntity<>(quizService.getEmployee(username), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/employee")
	public ResponseEntity<List<EmployeeDAO>> getEmployees() {
		return new ResponseEntity<>(quizService.getAllEmployees(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/login")
	public String history() {
		RestTemplate restTemplate = new RestTemplate();
		LoginPostRequestDto loginPostRequestDto = new LoginPostRequestDto();
		loginPostRequestDto.setUsername("sdustakar");
		loginPostRequestDto.setPassword("T)tftp0y");
		String res =  restTemplate.postForObject(LOGIN_URL, loginPostRequestDto, String.class);
		System.out.println("SATHISH: " + res);
		return res;
	}	
	
	
	
	
}

package com.sathish.quiz.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeDAO {
	
	@Id
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String role;
	private Date lastLogin;
	private Date rowCreated;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<QuizDAO> quizes;

	
	public void init() {
		this.lastLogin = new Date();
		this.rowCreated = new Date();
		this.quizes = new ArrayList<>();
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getRowCreated() {
		return rowCreated;
	}

	public void setRowCreated(Date rowCreated) {
		this.rowCreated = rowCreated;
	}

	public List<QuizDAO> getQuizes() {
		return quizes;
	}

	public void setQuizes(List<QuizDAO> quizes) {
		this.quizes = quizes;
	}
}

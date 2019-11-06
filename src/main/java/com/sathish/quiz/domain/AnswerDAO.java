package com.sathish.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class AnswerDAO {

	@Id
	@GeneratedValue
	private int answerId;
	private String answer;
	private int questionId;
	private int username;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	
}

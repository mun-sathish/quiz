package com.sathish.quiz.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class QuizDAO {
	
	@Id
	@GeneratedValue
	private int quizId;
	private String title;
	private Date scheduledOn;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<QuestionDAO> questions;
	
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getScheduledOn() {
		return scheduledOn;
	}
	public void setScheduledOn(Date scheduledOn) {
		this.scheduledOn = scheduledOn;
	}
	public List<QuestionDAO> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionDAO> questions) {
		this.questions = questions;
	}
	

}

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
@Table(name = "question")
public class QuestionDAO {

	@Id
	@GeneratedValue
	private int questionId;
	private String question;
	private String type;
	private String options;
	private Date rowCreated;
	private Date rowLastUpdated;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AnswerDAO> answers;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public Date getRowCreated() {
		return rowCreated;
	}
	public void setRowCreated(Date rowCreated) {
		this.rowCreated = rowCreated;
	}
	public Date getRowLastUpdated() {
		return rowLastUpdated;
	}
	public void setRowLastUpdated(Date rowLastUpdated) {
		this.rowLastUpdated = rowLastUpdated;
	}
	public List<AnswerDAO> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerDAO> answers) {
		this.answers = answers;
	}

}

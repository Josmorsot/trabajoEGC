package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Survey extends DomainEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 749544364605664829L;
	//Attributes
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	
	public Survey() {
		super();
	}
	
	//Methods
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	//Relationships
	private Census census;
	private List<Question>questions;
	
	public Census getCensus(){
		return census;
	}
	public void setCensus(Census c){
		this.census=c;
	}
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public void addQuestion(Question q){
		q.setSurvey(this);
		questions.add(q);
	}
	public void removeQuestion(Question q){
		questions.remove(q);
	}
	
}

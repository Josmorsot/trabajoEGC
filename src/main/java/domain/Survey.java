package domain;

import java.util.Date;
import java.util.List;

public class Survey extends DomainEntity{
	
	//Attributes
	private String name;
	private String description;
	private Date inicio;
	private Date fin;
	
	public Survey() {
		super();
	}
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
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

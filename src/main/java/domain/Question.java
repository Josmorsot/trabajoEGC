package domain;

import java.util.ArrayList;
import java.util.List;

public class Question{
	
	//Attributes
	private String text;
	private List<String> options;
	
	public Question(){
		text="";
		options=new ArrayList<String>();
	}
	//Methods
	public Question(Survey s){
		text="";
		options=new ArrayList<String>();
	}
	public String getText(){
		return text;
	}
	public List<String> getOptions(){
		return options;
	}
	public void setText(String text){
		this.text=text;
	}
	public void setOptions(List<String> options){
		this.options=options;
	}
	
	//RelationShips
	private Survey survey;

	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
		
}

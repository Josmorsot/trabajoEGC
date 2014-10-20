package domain;

import java.util.List;

public class Question{
	
	//Attributes
	private String text;
	private List<String> options;
	
	//Methods
	
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
}

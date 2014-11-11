package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
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
	@NotBlank
	@Length(min=5, max=10, message="The field must be between 5 and 10 characters")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@DateTimeFormat(pattern="yyyy/MM/dd")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@DateTimeFormat(pattern="yyyy/MM/dd")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	//Relationships
	private Census census;
	private List<Question>questions;
	private String usernameCreator;
	
	public String getUsernameCreator() {
		return usernameCreator;
	}

	public void setUsernameCreator(String usernameCreator) {
		this.usernameCreator = usernameCreator;
	}

	@OneToOne()
	public Census getCensus(){
		return census;
	}
	public void setCensus(Census c){
		this.census=c;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@NotEmpty
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public void addQuestion(Question q){
		questions.add(q);
	}
	public void removeQuestion(Question q){
		questions.remove(q);
	}

	@Override
	public String toString() {
		return "Survey [title=" + title + ", description=" + description
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", census=" + census + ", questions=" + questions + "]";
	}
	
	
	
}

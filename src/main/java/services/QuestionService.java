package services;

import org.springframework.util.Assert;

import repositories.QuestionRepository;
import domain.Question;
import domain.Survey;

public class QuestionService {

	//Repository
	private QuestionRepository questionRepository;

	//Methods
	public Question create(){
		Question o = new Question();
		return o;
	}
	
	public void save(Question o,Survey s){
			Assert.notNull(o);
			
			o.setSurvey(s);
			questionRepository.save(o);
	}
}

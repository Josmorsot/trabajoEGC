package services;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.QuestionRepository;
import domain.Question;
import domain.Survey;

public class QuestionService {

	//Services
		private QuestionRepository questionRepository;
		
		public void save(Question o,Survey s){
			Assert.notNull(o);
			
			o.setSurvey(s);
			questionRepository.save(o);
		}
	}

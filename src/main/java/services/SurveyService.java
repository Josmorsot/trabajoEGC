package services;

import org.springframework.util.Assert;

import repositories.SurveyRepository;
import domain.Census;
import domain.Question;
import domain.Survey;

public class SurveyService {

	//Repositories
	private SurveyRepository surveyRepository;
	
	//Services
	private QuestionService questionService;
	
	public void save(Survey s){
		String cookie = ""; //COOKIE DE LA CONEXIÓN
		Assert.notNull(s);
		Assert.isTrue(isAuthenticated(cookie));
		
		for (Question o:s.getQuestions()){
			questionService.save(o,s);
		}
		surveyRepository.save(s);
	}
	
	//Método de interacción con el subsistema de Creacion de Censos
	public void addCensus(Survey s, Census c){
		Assert.notNull(c);
		Assert.notNull(s);
		
		Assert.isTrue(s.getCensus()==null);
		s.setCensus(c);
		surveyRepository.save(s);
		
	}
}

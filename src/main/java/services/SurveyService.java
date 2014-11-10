package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.SurveyRepository;
import domain.Census;
import domain.Survey;
@Service
public class SurveyService {

	//Repositories
	@Autowired
	private SurveyRepository surveyRepository;
	
	//Services
	@Autowired
	private QuestionService questionService;
	
	//Methods
	public Survey create(){
		String cookie = ""; //COOKIE DE LA CONEXIÓN
//		Assert.isTrue(isAuthenticated(cookie));
		
		Survey s = new Survey();
		return s;
	}
	@Transactional
	public void save(Survey s){
		String cookie = ""; //COOKIE DE LA CONEXIÓN
		Assert.notNull(s);
//		Assert.isTrue(isAuthenticated(cookie));
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

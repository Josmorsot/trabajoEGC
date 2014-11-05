package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.SurveyService;
import domain.Survey;

@RestController
@RequestMapping("/vote")
public class SurveyController {

	//Services
	private SurveyService surveyService;
	
	//Methods
	@RequestMapping("/save")
	public String save(Survey s){
		String res = "Operaci�n realizada satisfactoriamente.";
		try{
			surveyService.save(s);
		}catch(Exception e){
			res = "Operaci�n no realizada.";
		}
		return res;
	}
	
}

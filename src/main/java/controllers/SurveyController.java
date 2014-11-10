package controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
		String res = "Operación realizada satisfactoriamente.";
		try{
			surveyService.save(s);
		}catch(Exception e){
			res = "Operación no realizada.";
		}
		return res;
	}
	
	@RequestMapping(value="/test1", method=RequestMethod.POST, headers="Content-Type=application/json")
	public @ResponseBody void prueba(@RequestBody String s) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		Survey s1 = mapper.readValue(s,Survey.class); 
		System.out.println(s1.getQuestions().iterator().next().getText());
		System.out.println(s);
	}
	
}

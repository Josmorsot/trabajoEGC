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
	public @ResponseBody Survey save(@RequestBody String surveyJson) throws JsonParseException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Survey s = mapper.readValue(surveyJson,Survey.class);
		surveyService.save(s);
		System.out.println(s);
		return s;
	}
	
}

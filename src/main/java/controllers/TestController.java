package controllers;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Question;
import domain.Survey;

@RestController
@RequestMapping("/vote")
public class TestController {
	
	
	
	@RequestMapping("/test")
	public Survey test(){
		Survey s = new Survey();
		s.setDescription("Votaci�n generica");
		s.setInicio(new Date(System.currentTimeMillis()));
		s.setFin(new Date(System.currentTimeMillis()));
		s.setName("Votaci�n 1");
		List<Question> lq = new LinkedList<Question>();
		Question q = new Question();
		List<String> l = new LinkedList<String>();
		l.add("Si");
		l.add("No");
		q.setText("jejej");
		q.setOptions(l);
		lq.add(q);
		s.setQuestions(lq);
		return s;
	}

}

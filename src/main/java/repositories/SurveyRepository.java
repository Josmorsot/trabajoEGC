package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Survey;

public interface SurveyRepository extends JpaRepository<Survey,Integer>{
	
}
package com.example.empolyee.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.empolyee.entity.Empolyee;
import com.example.empolyee.repository.EmpolyeeRepository;


@Service
public class EmpolyeeService {
	
	 private static final Logger logger = LoggerFactory.getLogger(EmpolyeeService.class);
	 
	@Autowired
	private EmpolyeeRepository  empolyeeRepository;

	public Empolyee saveEmpolyee(Empolyee empolyee) {
		logger.info(" EmpolyeeService saveEmpolyee Start");
		return empolyeeRepository.save(empolyee);
	}

	public Empolyee saveOrUpdate(Empolyee empolyee) {
		logger.info(" EmpolyeeService saveOrUpdate Start");
		return empolyeeRepository.save(empolyee);
	}
	
	public Empolyee findEmpolyeeById(Long id) {
		logger.info(" EmpolyeeService findEmpolyeeById Start");
		return empolyeeRepository.findByEmpolyeeId(id);
		
	}

	

}

package com.example.empolyee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.empolyee.entity.Empolyee;
import com.example.empolyee.service.EmpolyeeService;


@RestController
@RequestMapping("/empolyee")
public class EmpolyeeController {
	 private static final Logger logger = LoggerFactory.getLogger(EmpolyeeController.class);
	 
	@Autowired
	private EmpolyeeService  departmentService;
	
	
	@PostMapping("/")
	public Empolyee saveEmpolyee(@RequestBody Empolyee empolyee) {
		logger.info(" EmpolyeeController saveEmpolyee Start");
		return departmentService.saveEmpolyee(empolyee);

	}
	
	@PutMapping("/")
	public Empolyee updateEmpolyee(@RequestBody Empolyee empolyee) {
		logger.info(" EmpolyeeController updateEmpolyee Start");
		return departmentService.saveOrUpdate(empolyee);
		
	}
	 
	@GetMapping("/{id}")
	public Empolyee findDepartmentById(@PathVariable("id") Long id) {
		logger.info("EmpolyeeController findDepartmentById Start");
		return departmentService.findEmpolyeeById(id);
	}

}
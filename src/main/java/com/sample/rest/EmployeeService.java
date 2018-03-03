package com.sample.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {
	
	@RequestMapping(value="/{employeeId}", method = RequestMethod.GET)
	@ResponseBody
	public Employee getEmployee(@PathVariable Integer employeeId){
		return new Employee(1, "Ram");
	}
}

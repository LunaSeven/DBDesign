package com.mju.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mju.app.dao.EmployeeDao;
import com.mju.app.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployee(int id) {
		return this.employeeDao.getEmployee(id);
	}
}
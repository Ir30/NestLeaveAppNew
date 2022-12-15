package com.example.NestDigitalApp.dao;

import com.example.NestDigitalApp.model.EmployeeLog;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeLogDao extends CrudRepository<EmployeeLog,Integer> {
}

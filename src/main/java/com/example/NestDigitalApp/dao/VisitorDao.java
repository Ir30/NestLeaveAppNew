package com.example.NestDigitalApp.dao;

import com.example.NestDigitalApp.model.VisitorLog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VisitorDao extends CrudRepository<VisitorLog,Integer> {

    @Query(value = "SELECT `id`, `date`, `entry_time`, `exit_time`, `name` FROM `visitor_log` WHERE `date` = :date",nativeQuery = true)
    public List<VisitorLog> fetchVisitorBydate(@Param("date")String date);

}

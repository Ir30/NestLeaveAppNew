package com.example.NestDigitalApp.controller;

import com.example.NestDigitalApp.dao.EmployeeLogDao;
import com.example.NestDigitalApp.dao.SecurityDao;
import com.example.NestDigitalApp.dao.VisitorDao;
import com.example.NestDigitalApp.model.EmployeeLog;
import com.example.NestDigitalApp.model.Security;
import com.example.NestDigitalApp.model.VisitorLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class SecurityController {
    @Autowired
    private SecurityDao sdao;

    @PostMapping(path = "/securityLogin", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> SecurityLogin(@RequestBody Security sc){
        HashMap<String, String> hashMap = new HashMap<>();
        List<Security> scDetails = sdao.SecurityLoginDetails(sc.getUsername(),sc.getPassword());
        if(scDetails.size() == 0){
            hashMap.put("status","failed");
        }else{
            hashMap.put("status","success");
            hashMap.put("userInfo",String.valueOf(scDetails.get(0).getId()));
        }
        return hashMap;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityProfile", consumes = "application/json", produces = "application/json")
    public List<Security> getSecurityProfile(@RequestBody Security sc){
        System.out.println(sc.getId());
        return (List<Security>) sdao.GetSecurityProfile(sc.getId());
    }


    @Autowired
    private VisitorDao vdao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/visitor_log",consumes = "application/json",produces = "application/json")
    public String visitor_log(@RequestBody VisitorLog v){

        vdao.save(v);

        return "{\"status\":\"success\"}";

    }


    @Autowired
    private EmployeeLogDao eldao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employee_log",consumes = "application/json",produces = "application/json")
    public String emp_log(@RequestBody EmployeeLog el){

        eldao.save(el);

        return "{\"status\":\"success\"}";

    }







}

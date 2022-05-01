package com.example.demo.service;

import com.example.demo.repository.AppFlowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepo appFlowRepo;
    public String message(){
        return appFlowRepo.message();
    }
}

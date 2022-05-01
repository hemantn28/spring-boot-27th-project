package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepo {

    public String message(){
        return "response from repository";
    }
}

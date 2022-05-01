package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DBService {

    @Autowired
    CityRepository repository;

    public String add( City city){
       repository.save(city);
        return "city added to DB successfully";


    }
}

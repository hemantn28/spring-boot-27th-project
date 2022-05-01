package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityDBController {

    @Autowired
    DBService service;

    @RequestMapping(value = "add_cities_db",method = RequestMethod.POST)
    public String add(@RequestBody City city){

        return service.add(city);


    }

}

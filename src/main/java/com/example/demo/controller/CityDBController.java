package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityDBController {

    @Autowired
    DBService service;

    @RequestMapping(value = "add_cities_db",method = RequestMethod.POST)
    public String add(@RequestBody City city){

        return service.add(city);
    }
    //Get


    @RequestMapping(value = "get_cities_db",method = RequestMethod.GET)
    public List<City> getAll(){
        return service.getAll();

    }

    //Update

    @RequestMapping(value = "update_cities_db/{name}/{state}/{population}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @PathVariable String state, @PathVariable int population, @PathVariable Integer id){
        service.update("Kochi","Kerala",635241,89 );
        return "cities updated in DB successfully";
    }

    //Delete


    @RequestMapping(value = "delete_cities_db/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        service.delete(91);
        return "cities deleted in DB successfully";

    }


}

package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {


    //Create
    @Autowired
    CityRepository cityRepository;
    @RequestMapping(value = "add_city_db",method = RequestMethod.POST)
    public String add(@RequestBody City city){
        cityRepository.save(city);
        return "city added to DB successfully";


    }

    //get

    @RequestMapping(value = "get_city_db",method = RequestMethod.GET)
    public List<City> getAll(){
        return cityRepository.findAll();

    }


    //Update

    @RequestMapping(value = "update_city_db/{name}/{state}/{population}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name,@PathVariable String state,@PathVariable int population,@PathVariable Integer id){
        City city=cityRepository.getById(id);
        city.setName("Kochi");
        city.setState("Kerala");
        city.setPopulation(635241);
        cityRepository.save(city);
        return "city updated in DB successfully";
    }

    //


   // Delete

    @RequestMapping(value = "delete_city_db/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        cityRepository.deleteById(id);
        return "city deleted in DB successfully";

    }
}

package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DBService {

    @Autowired
    CityRepository repository;

    public String add( City city){
       repository.save(city);
        return "city added to DB successfully";
    }

    public List<City> getAll(){
        return repository.findAll();

    }


    public String update(@PathVariable String name, @PathVariable String state, @PathVariable int population, @PathVariable Integer id){
        City city=repository.getById(id);
        city.setName("Kochi");
        city.setState("Kerala");
        city.setPopulation(635241);
        repository.save(city);
        return "city updated in DB successfully";
    }


    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "city deleted in DB successfully";

    }
}

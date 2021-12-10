package com.example.TravelPlanning.service;

import com.example.TravelPlanning.entity.City;
import com.example.TravelPlanning.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository repository;

    /**
     * Method to post row data to database.
     * @param city
     * @author Harsh Mehta
     * @version 1.0
     */
    public City saveCity(City city){
        return repository.save(city);
    }

    /**
     * Method to retrieve all the data from table.
     * @author Harsh Mehta
     * @version 1.0
     */
    public List<City> getAllData(){
        return repository.findAll();
    }

    /**
     * Method to retrieve list of cities from table.
     ** @author Harsh Mehta
     * @version 1.0
     */
    public List<String> getCityList(){
        return repository.getListOfCities();
    }

    /**
     * Method to retrieve data based on passed city name.
     * @param name
     * @author Harsh Mehta
     * @version 1.0
     */
    public City getCityByName(String name){
        return repository.findByName(name);
    }
}

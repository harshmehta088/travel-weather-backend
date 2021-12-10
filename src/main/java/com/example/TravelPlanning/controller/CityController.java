package com.example.TravelPlanning.controller;

import com.example.TravelPlanning.entity.City;
import com.example.TravelPlanning.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CityController {
    @Autowired
    private CityService service;

    /**
     * Controller method to add new city, written for experimental purpose but works fine,
     * haven't used in the api call.
     * @author Harsh Mehta
     * @param city
     * @version 1.0
     */
    @PostMapping("/addcity")
    public City addCity(@RequestBody City city){
        return service.saveCity(city);
    }

    /**
     * Controller method to retrieve all the data from table, written for experimental purpose but works fine,
     * haven't used in the api call.
     * @author Harsh
     * @version 1.0
     */
    @GetMapping("/alldata")
    public List<City> findAllData(){
        return service.getAllData();
    }

    /**
     * Controller method to retrieve description for a particular city.
     * @param name
     * @author Harsh
     * @version 1.0
     */
    @GetMapping("/city/{name}")
    public City findCityByName(@PathVariable String name){
        return service.getCityByName(name);
    }

    /**
     * Controller method to retrieve list of all the cities from database.
     * @author Harsh
     * @version 1.0
     */
    @GetMapping("/listofcities")
    public List<String> getCityList(){
        return service.getCityList();
    }
}

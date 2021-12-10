package com.example.TravelPlanning.repository;

import com.example.TravelPlanning.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

    /**
     * Query to retrive data for a particular city.
     * @param name
     * @return data for passed value
     * @author Harsh Mehta
     * @version 1.0
     */
    City findByName(String name);

    /**
     * query to retrieve list of cities from database
     * @return list of cities
     * @author Harsh Mehta
     * @version 1.0
     */
    @Query(value = "SELECT name FROM city", nativeQuery = true)
    List<String> getListOfCities();
}

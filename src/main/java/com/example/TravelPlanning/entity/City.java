package com.example.TravelPlanning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is a class that generates City table.
 * @author Harsh Mehta
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
}

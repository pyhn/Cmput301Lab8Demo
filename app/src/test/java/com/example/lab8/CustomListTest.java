package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * add city to list
     * get size of list
     * delete city from list
     * check if current size matches initial size - 1
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize - 1);
    }

    /**
     * add city to list
     * check if city is in list
     */
    @Test
    public void testHasCity() {
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testGetCount() {
        list = MockCityList();
        Assert.assertEquals(1, list.getCount());
        City city = new City("Regina", "Saskatchewan");
        list.add(city);
        Assert.assertEquals(2, list.getCount());
        
    }
}

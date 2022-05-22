package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTests {
    @Test
    void testAddNewOrder(){
        LocalDate date = LocalDate.of(2021, 4, 24);
        Order order = new Order(152.50,date,"TestBuyer123");
        Shop shop = new Shop();

        shop.addNewOrder(order);

        assertFalse(shop.getOrders().isEmpty());
        assertTrue(shop.getOrders().contains(order));
    }

    @Test
    void testListOfOrdersFromTwoDate(){
        LocalDate date = LocalDate.of(2021, 4, 24);
        Order order = new Order(152.50,date,"TestBuyer123");
        LocalDate date2 = LocalDate.of(2022, 1, 10);
        Order order2 = new Order(652.50,date2,"TestBuyer456");
        Shop shop = new Shop();

        shop.addNewOrder(order);
        shop.addNewOrder(order2);

        ArrayList<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order);


        LocalDate dateTest1 = LocalDate.of(2021, 3, 24);
        LocalDate dateTest2 = LocalDate.of(2021, 5, 24);

        assertEquals(expectedOrders,shop.listOrdersFromTwoDate(dateTest1,dateTest2));
        assertFalse(shop.listOrdersFromTwoDate(dateTest1,dateTest2).contains(order2));
    }

    @Test
    void testListOfOrdersFromValuesRange(){
        LocalDate date = LocalDate.of(2021, 4, 24);
        Order order = new Order(152.50,date,"TestBuyer123");
        LocalDate date2 = LocalDate.of(2022, 1, 10);
        Order order2 = new Order(652.50,date2,"TestBuyer456");
        Shop shop = new Shop();

        shop.addNewOrder(order);
        shop.addNewOrder(order2);

        ArrayList<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order);
        expectedOrders.add(order2);


        assertEquals(expectedOrders,shop.listOrdersFromValuesRange(100,1000));
        assertTrue(shop.listOrdersFromValuesRange(100,150).isEmpty());
    }

    @Test
    void testNumberOfOrders(){
        LocalDate date = LocalDate.of(2021, 4, 24);
        Order order = new Order(152.50,date,"TestBuyer123");
        LocalDate date2 = LocalDate.of(2022, 1, 10);
        Order order2 = new Order(652.50,date2,"TestBuyer456");
        Shop shop = new Shop();

        shop.addNewOrder(order);
        shop.addNewOrder(order2);

        assertEquals(2,shop.getSizeOrders());
    }

    @Test
    void testSumOfValuesOrders(){
        LocalDate date = LocalDate.of(2021, 4, 24);
        Order order = new Order(152.50,date,"TestBuyer123");
        LocalDate date2 = LocalDate.of(2022, 1, 10);
        Order order2 = new Order(652.50,date2,"TestBuyer456");
        Shop shop = new Shop();

        shop.addNewOrder(order);
        shop.addNewOrder(order2);

        double expectedSum = 152.50 + 652.50;

        assertEquals(expectedSum,shop.sumOfAllOrdersValue());
    }
}

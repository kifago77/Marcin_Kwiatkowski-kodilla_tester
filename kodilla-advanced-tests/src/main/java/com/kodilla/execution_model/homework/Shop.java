package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public void addNewOrder(Order o) {
        orders.add(o);
    }

    public ArrayList<Order> listOrdersFromTwoDate(LocalDate dateFrom, LocalDate dateTo) {
        ArrayList<Order> resultOrders = new ArrayList<>();

        for (Order order : orders) {
            if (order.getLocalDate().isAfter(dateFrom) && order.getLocalDate().isBefore(dateTo)) {
                resultOrders.add(order);
            }
        }

        return resultOrders;
    }

    public ArrayList<Order> listOrdersFromValuesRange(double minValue, double maxValue) {
        ArrayList<Order> resultOrders = new ArrayList<>();

        for (Order order : orders) {
            if (order.getValue() >= minValue && order.getValue() <= maxValue) {
                resultOrders.add(order);
            }
        }

        return resultOrders;
    }

    public int getSizeOrders(){
        return orders.size();
    }

    public double sumOfAllOrdersValue(){
        double sum =0;

        for (Order order : orders) {
            sum+=order.getValue();
        }
        return sum;
    }
}

package com.mikdrums.utils;

import com.mikdrums.customer.Customer;

import java.util.List;
import java.util.stream.Collectors;

public  class Utils {


   public static List<Customer> filterCustomersByAge(int age, List<Customer> customers){
        return customers.stream().filter(customer -> customer.getAge()<age)
                .collect(Collectors.toList());
    }
    public static void printList(List<Customer> customerList){
       customerList.forEach(System.out::println);
    }
}

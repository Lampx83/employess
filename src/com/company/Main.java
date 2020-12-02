package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Employee nv1 = new Employee(1, LocalDate.of(1989, 7, 2), "David", "Pham", Gender.M, LocalDate.now());
        Employee nv2 = new Employee(2, LocalDate.of(1989, 11, 2), "Peter", "Nguyen", Gender.M, LocalDate.now());
        Employee nv3 = new Employee(3, LocalDate.of(1900, 12, 2), "Jenifer", "Pham", Gender.F, LocalDate.now());


        employees.add(nv1);
        employees.add(nv2);
        employees.add(nv3);


        Collections.sort(employees);

        System.out.println(employees);

    }
}

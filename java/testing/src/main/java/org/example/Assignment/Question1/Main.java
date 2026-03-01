package org.example.Assignment.Question2;

import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> noCar = CarRepository.getOwners().stream().filter(o -> o.getCars() == null).map(Owner::getName).collect(Collectors.toList());
        System.out.println("Owners having no cars:");
        noCar.forEach(System.out::println);


        System.out.println("Number of cars:");

        Map<String, Integer> ownerCarCount = CarRepository.getOwners().stream().collect(Collectors.toMap(Owner::getName, o -> (o.getCars() == null) ? 0 : o.getCars().size()));

        ownerCarCount.forEach((name, count) -> System.out.println(name + "  " + count));

        List<Car> ownedCars = CarRepository.getOwners().stream().filter(o -> o.getCars() != null).flatMap(o -> o.getCars().stream()).collect(Collectors.toList());

        List<Car> CarsWithNoOwner = CarRepository.getCars().stream().filter(car -> !ownedCars.contains(car)).toList();

        System.out.println("cars with no owner");
        CarsWithNoOwner.forEach(System.out::println);
    }
}
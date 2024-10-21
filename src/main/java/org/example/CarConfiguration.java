package org.example;

import org.example.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        // TODO: Create and configure different cars using the Builder pattern

//        Car car1 = new Car....
//        System.out.println(car1);
    	Car car1 = new Car.Builder("V6","CVT","Leather","Black",true,true,true).build();
    	Car car2 = new Car.Builder("V8","DSG","Leather","Red",true,true,true).build();
    	Car car3 = new Car.Builder("V12","CVT","Textile","White",false,true,true).build();
    	System.out.println(car1);
    	System.out.println(car2);
    	System.out.println(car3);
    }
}

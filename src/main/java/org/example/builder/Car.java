package org.example.builder;

// TODO implement logic
public class Car {
    private String engine;
    private String transmission;
    private String interior;
    private String color;
    private boolean hasSunroof;
    private boolean hasGPS;
    private boolean hasSafetyPackage;

    private Car(Builder builder) {
    	this.engine = builder.engine;
    	this.transmission = builder.transmission;
    	this.interior = builder.interior;
    	this.color = builder.color;
    	this.hasSunroof = builder.hasSunroof;
    	this.hasGPS = builder.hasGPS;
    	this.hasSafetyPackage = builder.hasSafetyPackage;
    }

    @Override
    public String toString() {
        return "Car has: engine: " + engine + " transmission: " + transmission + " interior: "+ interior + " color: " + color + " sunroof:" + hasSunroof + " gps: " + hasGPS + " safety package: " + hasSafetyPackage;
    }

    public static class Builder {
        private String engine;
        private String transmission;
        private String interior;
        private String color;
        private boolean hasSunroof;
        private boolean hasGPS;
        private boolean hasSafetyPackage;
        
        public Builder(String engine, String transmission, String interior, String color, boolean hasSunroof, boolean hasGPS, boolean hasSafetyPackage) {
        	this.engine = engine;
        	this.transmission = transmission;
        	this.interior = interior;
        	this.color = color;
        	this.hasSunroof = hasSunroof;
        	this.hasGPS = hasGPS;
        	this.hasSafetyPackage = hasSafetyPackage;
        }
        
        public Car build() {
            return new Car(this);
        }
    }
}

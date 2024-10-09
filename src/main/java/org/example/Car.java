package org.example;

public class Car {
    private String tuition;
    private String brand;
    private String model;

    public Car(String tuition, String brand, String model) {
        this.tuition = tuition;
        this.brand = brand;
        this.model = model;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString() {
        return "Car{" + "tuition = " + tuition + ", brand = " + brand + ", model = " + model + '}';

    }
}

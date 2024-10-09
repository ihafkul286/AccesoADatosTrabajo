package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BBDD {
    public static void informationCharge() {
        List<Car> cars = new ArrayList<Car>();
        try (BufferedReader br = new BufferedReader(new FileReader("BBDDcoches.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                String tuition = data[0];
                String brand = data[1];
                String model = data[2];
                Car car = new Car(tuition, brand, model);
                cars.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveCars(List<Car> cars) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("BBDDcoches1.csv"))){
            for (int i = 0; i < cars.size(); i++) {
                bw.write(cars.get(i).toString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insertCar(List<Car> cars) {
        int position;
        String lineWord;
        for (Car car : cars) {
            System.out.println("Dime la matricula");
            lineWord = car.toString();
            System.out.println("Dime la marca del coche");

        }

    }

}

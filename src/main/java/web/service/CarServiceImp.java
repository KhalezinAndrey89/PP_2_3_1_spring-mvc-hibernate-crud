package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "car1", "color1", 1));
        cars.add(new Car(2, "car2", "color2", 2));
        cars.add(new Car(3, "car3", "color3", 3));
        cars.add(new Car(4, "car4", "color4", 4));
        cars.add(new Car(5, "car5", "color5", 5));
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
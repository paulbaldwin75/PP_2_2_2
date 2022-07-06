package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("LADA", 2190, 2019));
        carList.add(new Car("BMW", 520, 2021));
        carList.add(new Car("AUDI", 5, 2022));
        carList.add(new Car("LADA", 2111, 2004));
        carList.add(new Car("RENAULT", 4, 2016));
    }

    public static List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }

    }
}

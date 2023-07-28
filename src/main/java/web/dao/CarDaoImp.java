package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "black", 3));
        carList.add(new Car("Mercedes", "white", 1));
        carList.add(new Car("Nissan", "green", 2));
        carList.add(new Car("Lada", "red", 4));
        carList.add(new Car("BMW", "yellow", 3));
        return carList;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if (count >= 5){
            return getAllCars();
        }else if (count <= 0){
            return new ArrayList<Car>();
        }
        return getAllCars().stream().limit(count).toList();
    }
}

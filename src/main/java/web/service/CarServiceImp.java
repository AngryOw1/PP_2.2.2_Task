package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService{
    CarDao carDao = new CarDaoImp();
    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carDao.getSomeCars(count);
    }
}

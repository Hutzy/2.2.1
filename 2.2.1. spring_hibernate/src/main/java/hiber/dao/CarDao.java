package hiber.dao;

import hiber.model.User;

public interface CarDao {
    User getUserCar(String model, int series);
}

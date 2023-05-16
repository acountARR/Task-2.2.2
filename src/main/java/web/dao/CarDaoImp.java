package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", 1, "G12"));
        carList.add(new Car("Toyota", 2, "R12"));
        carList.add(new Car("Mazda", 3, "E23"));
        carList.add(new Car("Nissan", 4, "H09"));
        carList.add(new Car("Subaru", 5, "Y112"));
    }

    @Override
    public List<Car> getListCar(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

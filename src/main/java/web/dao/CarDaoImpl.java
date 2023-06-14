package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car(1974, "Moscvich", 412));
        list.add(new Car(1990, "Pontiac Firebird", 3));
        list.add(new Car(1993, "OKA", 1111));
        list.add(new Car(1994, "BMW", 7));
        list.add(new Car(1995, "VW Polo", 3));
    }

    @Override
    public List<Car> getCarList(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDao {

    private static int COUNT;
    private List<Cars> auto;
    private List<Cars> autoCar;

    {
        auto = new ArrayList<>();

        auto.add(new Cars(++COUNT, "Chevrolet", "Lacetti", 2009));
        auto.add(new Cars(++COUNT, "Toyota", "Camry", 2020));
        auto.add(new Cars(++COUNT, "Hyundai", "Creta", 2017));
        auto.add(new Cars(++COUNT, "BMW", "X7", 2021));
        auto.add(new Cars(++COUNT, "Mercedes", "Benz CLA", 2022));
        auto.add(new Cars(++COUNT, "CHERY", "TIGGO 8", 2020));
        auto.add(new Cars(++COUNT, "LADA", "Vesta", 2020));
    }

    public List<Cars> index() {
        return auto;
    }

    public List<Cars> indexCar(int count) {
        return auto.subList(0, count);
    }

    public Cars show(int id) {
        return auto.stream().filter(cars -> cars.getId() == id).findAny().orElse(null);
    }
}

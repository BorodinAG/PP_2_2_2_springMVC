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

    {
        auto = new ArrayList<>();

        auto.add(new Cars(++COUNT,"Chevrolet","Lacetti",2009));
        auto.add(new Cars(++COUNT,"Toyota","Camry",2020));
        auto.add(new Cars(++COUNT,"Hyundai","Creta",2017));
    }

    public List<Cars> index(){ return auto;}
}

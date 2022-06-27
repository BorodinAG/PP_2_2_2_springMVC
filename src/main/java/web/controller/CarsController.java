package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarsDao carsDao;

    @Autowired
    public CarsController(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @GetMapping()
    public String index(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {
        if (count >= 1 && count < 5) {
            model.addAttribute("auto", carsDao.indexCar(count));
            return "cars/index";
        } else {
            model.addAttribute("auto", carsDao.index());
            return "cars/index";
        }
    }

}


package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String index(Model model) {
        model.addAttribute("auto", carsDao.index());
        return "cars/index";
    }
}

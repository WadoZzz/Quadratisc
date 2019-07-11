package com.test.company.quadratic.web;

import com.test.company.quadratic.domain.Quadratic;
import com.test.company.quadratic.service.QuadraticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculate")
public class QuadraticController {

    private final QuadraticService quadraticService;

    @Autowired
    public QuadraticController(QuadraticService quadraticService) {
        this.quadraticService = quadraticService;
    }

    @GetMapping()
    public String loadQuadratic() {
        return "main_form";
    }

    @PostMapping("/quadratic-calculate")
    public String quadraticCalculate(@ModelAttribute("calculate") @RequestBody Quadratic quadratic, ModelMap map) {
        quadratic.setD((quadratic.getB() * quadratic.getB()) - (4 * quadratic.getA() * quadratic.getC()));

        if (quadratic.getD() < 0) {
            map.addAttribute("Уравнение не имеет решений");
        } else if (quadratic.getD() == 0) {
            quadratic.setX1((-quadratic.getB()) / (2 * quadratic.getA()));
            map.addAttribute("X", "Корни уравнения вычислить нельзя");
            return "error";

        } else {
            map.addAttribute("a", quadratic.getA());
            map.addAttribute("b", quadratic.getB());
            map.addAttribute("c", quadratic.getC());

            map.addAttribute("discriminant", "Дискриминант равен:  = " + quadratic.getD());
            map.addAttribute("D", "Дискриминант D > 0, следовательно уравнение имеет два действительных корня. ");
            quadratic.setX1((-quadratic.getB() + Math.sqrt(quadratic.getD())) / (2 * quadratic.getA()));
            quadratic.setX2((-quadratic.getB() - Math.sqrt(quadratic.getD())) / (2 * quadratic.getA()));
            if (quadratic.getX1() == quadratic.getX2()) {
                map.addAttribute("equals", "x1 = x2 " + quadratic.getX1());
            } else {
                map.addAttribute("X1", "x1 =  " + quadratic.getX1());
                map.addAttribute("X2", "x2 = " + quadratic.getX2());
            }
            quadraticService.saveEquation(quadratic);
            return "calc_view";
        }
        return "error";
    }
}
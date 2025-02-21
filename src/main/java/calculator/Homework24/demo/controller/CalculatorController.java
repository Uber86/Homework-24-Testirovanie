package calculator.Homework24.demo.controller;

import calculator.Homework24.demo.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;


@RestController
@RequestMapping ("/calculator")
public class CalculatorController {

    private static final Pattern PATTERN = Pattern.compile("[A-Za-z_]+");

    private CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }


    public void CalculatorService(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return  "<strong> Welcome </strong>";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null)
            throw new NumberFormatException("Требуется передать значения");
        return num1 + " + " + num2 + " = " + service.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null)
            throw new NumberFormatException("Требуется передать значения");
        return num1 + " - " + num2 + " = " + service.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null)
            throw new NumberFormatException("Требуется передать значения");
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null)
            throw new NumberFormatException();
        return num1 + " / " + num2 + " = " + service.divide(num1, num2);
    }

}

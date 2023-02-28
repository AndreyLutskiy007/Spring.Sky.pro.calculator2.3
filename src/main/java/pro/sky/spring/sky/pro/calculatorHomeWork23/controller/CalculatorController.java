package pro.sky.spring.sky.pro.calculatorHomeWork23.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.spring.sky.pro.calculatorHomeWork23.exceptions.DivisionByZeroException;
import pro.sky.spring.sky.pro.calculatorHomeWork23.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int res = calculatorService.plus(num1, num2);
        return num1 + "+" + num2 + "=" + res;

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int res = calculatorService.minus(num1, num2);
        return num1 + "-" + num2 + "=" + res;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int res = calculatorService.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + res;

    }

    @GetMapping(path = "/divide")
    public String answerDivideNumber(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        try {
            int res = calculatorService.divide(num1, num2);
            return num1 + "*" + num2 + "=" + res;
        } catch (DivisionByZeroException e) {
            return " на ноль делить нельзя";
        } catch (Exception e) {
            return "попробуйте другое действие";
        }
    }
}

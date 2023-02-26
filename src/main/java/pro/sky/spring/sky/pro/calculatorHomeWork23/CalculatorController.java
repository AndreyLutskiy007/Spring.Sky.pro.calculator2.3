package pro.sky.spring.sky.pro.calculatorHomeWork23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")
public class CalculatorController extends CalculatorService {
    CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }
    @GetMapping(path = "/plus")
    public String answerSummaNumber(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.answerSummaNumber(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String answerMinusNumber(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.answerMinusNumber(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String answerMultiplyNumber(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.answerMultiplyNumber(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String answerDivideNumber(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.answerDivideNumber(num1, num2);
    }
}

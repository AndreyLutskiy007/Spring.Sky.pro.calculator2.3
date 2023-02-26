package pro.sky.spring.sky.pro.calculatorHomeWork23;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String answerSummaNumber(int num1, int num2) {
        int res = num1 + num2;
        return num1 + "+" + num2 + "=" + res;

    }

    public String answerMinusNumber(int num1, int num2) {
        int res = num1 - num2;
        return num1 + "-" + num2 + "=" + res;
    }

    public String answerMultiplyNumber(int num1, int num2) {
        int res = num1 * num2;
        return num1 + "*" + num2 + "=" + res;
    }

    public String answerDivideNumber(int num1, int num2) {
        int res;
        if (num2 == 0) {
            return "Error: на ноль делить нельзя";
        } else {
            res = num1 / num2;
            return num1 + "/" + num2 + "=" + res;
        }
    }
}

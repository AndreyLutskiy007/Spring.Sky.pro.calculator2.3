package pro.sky.spring.sky.pro.calculatorHomeWork23;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        int num2 = 1;
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
    }
}

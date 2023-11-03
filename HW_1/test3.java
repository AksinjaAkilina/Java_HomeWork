public class test3 {
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 5;
            op = '.';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }    
}

class Calculator {
    public int calculate(char op, int a, int b) {
      // Введите свое решение ниже
        int result = 0;
        if (op == '+') {
            result = a + b;    
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else if (op == '/') {
            result = a / b;
        }
        else {
            System.out.println("Некорректный оператор: " + op);
        }
        return result;
    }
}

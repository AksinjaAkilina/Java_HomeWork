// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        boolean isPrime;
        for (int i = 1; i < 1000; i++) {
            isPrime = i == 1;
            for (int j = 2; j < 1000; j++) {
                if (i >= j && i % j == 0) {
                    if (j == i) {
                        isPrime = true;
                    }
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}
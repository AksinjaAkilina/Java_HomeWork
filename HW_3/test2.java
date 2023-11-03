// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:
// Integer[] arr - список целых чисел

package HW_3;

import java.util.Arrays;
import java.util.ArrayList;

public class test2 {
        public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}

class Answer {
    public void removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> removed = new ArrayList<>(Arrays.asList(arr));
      removed.removeIf(n -> (n % 2 == 0));
      System.out.println(removed);       
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

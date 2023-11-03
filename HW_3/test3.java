// Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:

// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

// Integer[] arr - список целых чисел

package HW_3;

import java.util.Arrays;
import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }    
}


class Answer {
    public void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(arr));
    result.sort(Integer::compareTo);
    int sum = 0;
    for (int i : result) {
        sum += i;
    }
    int averageCount = sum / result.size();
    System.out.println("Minimum is " + result.get(0));
    System.out.println("Maximum is " + result.get(result.size()-1));
    System.out.println("Average is = " + averageCount);
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

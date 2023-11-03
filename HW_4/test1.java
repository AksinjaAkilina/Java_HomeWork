// Пусть дан LinkedList с несколькими элементами.

// Напишите класс LLTasks с методом revert, который принимал бы на вход 
// LinkedList и возвращает “перевернутый” список.

package HW_4;

import java.util.LinkedList;

public class test1 {
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }    
}




class LLTasks {
    public LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> newLl = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            newLl.add(ll.get(i));
        }
        return newLl;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

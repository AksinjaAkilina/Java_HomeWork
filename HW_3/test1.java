package HW_3;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        final String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }    
}

class MergeSort {
    public int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        int len = a.length;
        if (len < 2) {
            return a;
        }
        int middle = len / 2;
        int[] start = new int[middle];
        int[] end = new int[len - middle];

        for (int i = 0; i < middle; i++) {
            start[i] = a[i];
        }
        for (int i = middle; i < len; i++) {
            end[i - middle] = a[i];
        }
        start = mergeSort(start);
        end = mergeSort(end);
        return merge(start, end);
    }

    public static int[] merge(int[] start, int[] end) {
        int left = start.length;
        int right = end.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (start[i] <= end[j]) {
                a[k++] = start[i++];
            }
            else {
                a[k++] = end[j++];
            }
        } 
        while (i < left) {
            a[k++] = start[i++];
        }
        while (j < right) {
            a[k++] = end[j++];
        }
        return a;
    }
}

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
//         int[] a;

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = new int[]{5, 1, 6, 2, 3, 4};
//         } else {
//             a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//         }

//         MergeSort answer = new MergeSort();
//         String itresume_res = Arrays.toString(answer.mergeSort(a));
//         System.out.println(itresume_res);
//     }
// }
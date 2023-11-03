// Необходимо разработать программу для сортировки массива 
// целых чисел с использованием сортировки кучей (Heap Sort). 
// Программа должна работать следующим образом:

// Принимать на вход массив целых чисел для сортировки. 
// Если массив не предоставлен, программа использует массив 
// по умолчанию.

// Сначала выводить исходный массив на экран.

// Затем применять сортировку кучей (Heap Sort) для сортировки
//  элементов массива в порядке возрастания.

// Выводить отсортированный массив на экран.

// Ваше решение должно содержать два основных метода: 
// buildTree, который строит сортирующее дерево на основе 
// массива, и heapSort, который выполняет собственно 
// сортировку кучей. Основная часть кода предоставлена вам.

// Программа должна быть способной сортировать массив, 
// даже если он состоит из отрицательных чисел и имеет 
// дубликаты.

package HW_5;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }    
}



class HeapSort {

    public static void maxHeapify(int[] tree, int sortLength, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < sortLength && tree[left] > tree[i]) {
            largest = left;
        }

        if (right < sortLength && tree[right] > tree[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;
            maxHeapify(tree, sortLength, largest);
        }       
    }


    public static void buildTree(int[] tree, int sortLength) {
           // Введите свое решение ниже
        // for (int i = sortLength / 2 - 1; i >= 0; i--) {
        //     int maxIndex;
        //     if (i * 2 + 2 <= sortLength - 1) {
        //         if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
        //         else maxIndex = i * 2 + 1;
        //     } else maxIndex = i * 2 + 1;
        //     if (tree[i] < tree[maxIndex]) {
        //         int temp = tree[i];
        //         tree[i] = tree[maxIndex];
        //         tree[maxIndex] = temp;
        //     }
        // }
        
        for (int i = sortLength / 2; i >= 0; i--) {
            maxHeapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        if (sortLength == 0) return;
        buildTree(sortArray, sortLength);
        int temp = sortArray[0];
        sortArray[0] = sortArray[sortLength - 1];
        sortArray[sortLength - 1] = temp;
        heapSort(sortArray, sortLength - 1);
        // buildTree(sortArray, sortLength);
        // for (int i = sortLength - 1; i > 0; i--) {
        //     int swap = sortArray[0];
        //     sortArray[0] = sortArray[i];
        //     sortArray[i] = swap;
        //     maxHeapify(sortArray, sortLength, i);
        // }
        
    }
}
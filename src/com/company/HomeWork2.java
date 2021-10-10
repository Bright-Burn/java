package com.company;

import java.util.Arrays;

public class HomeWork2 {
    int[] task1Arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] task2Arr = new int[8];
    int[] task3Arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int[][] task4Arr = new int[4][4];

    public void task1() {
        System.out.println("Задание 1");
        System.out.println("До замены: " + Arrays.toString(task1Arr));
        for (int i = 0; i <= task1Arr.length - 1; i++ ) {
            if(task1Arr[i] == 1)
                task1Arr[i] = 0;
            else task1Arr[i] = 1;
        }
        System.out.println("После замены: " + Arrays.toString(task1Arr));
    }
    public void task2(){
        for (int i = 0; i <= 7; i++) {
            task2Arr[i] = i * 3;
        }
        System.out.println("Результат выполнения задания 2: " + Arrays.toString(task2Arr));
    }
    public void task3() {
        System.out.println("Задание 3");
        System.out.println("До замены: " + Arrays.toString(task3Arr));
        for (int i = 0; i <= task3Arr.length - 1; i++) {
            if (task3Arr[i] < 6) {
              task3Arr[i] = task3Arr[i] * 3;
            }
        }
        System.out.println("После замены: " + Arrays.toString(task3Arr));
    }
    public void task4() {
        System.out.println("Задание 4");
        for (int i = 0; i <= task4Arr.length - 1; i++) {
            for (int j = 0; j <= task3Arr.length - 1; j++) {
                if(i == j)
                    task4Arr[i][j] = 1;
            }
            System.out.println(Arrays.toString( task4Arr[i]));
        }
    }
    public void task5() {
        int max = task3Arr[0];
        int min = task3Arr[0];
        for (int i = 0; i <= task3Arr.length - 1; i++) {
            if (max < task3Arr[i]) {
                max = task3Arr[i];
            }
            if(min > task3Arr[i]) {
                min = task3Arr[i];
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(task3Arr));
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
    public boolean task6(int[] arr) {
        boolean balanced = false;
        int arrSum = 0;
        int leftSum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arrSum = arrSum + arr[i];
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            leftSum = leftSum + arr[i];

            if (leftSum == (arrSum - leftSum)) {
                balanced = true;
                System.out.println("Баланс найден, индекс: " + i + " значение " + arr[i]);

            }
        }
        return balanced;
    }
}

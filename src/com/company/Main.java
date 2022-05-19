package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int current:arr){
            sum += current;
        }
        System.out.println("Summ: " + sum);

    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

        int a = 3;
        int[] array1 = new int [2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100_000 + 100_000);
        }
        System.out.print(array1);
        int max = array1[0];
        int min = array1[0];
        int avg = 0;

        for (int b = 0; b < array1.length; b++) {
            if (max < array1[b])
                min = array1[b];
            if (max > array1[b])
                min = array1[b];
            avg = avg + array1[b]/array1.length;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println("\n");

        float c =0;
        float[] array;
        for (float sumS: array){
            c += sumS;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=0; i<a.lenght; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.lenght;
        String name;

        for (int i=0; i<n/2; i++){
            name = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = name;
        }
        for (int i=0; i<a.lenght; i++) {
            System.out.print(a[i]);
        }


        

    }

    }


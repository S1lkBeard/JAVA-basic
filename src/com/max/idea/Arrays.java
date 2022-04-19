package com.max.idea;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 9};
        // использовать переменную это единственный способ, который я придумал для свапа значений массива
        int buffer = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = buffer;
        System.out.println(array[0]+array[array.length/2]);
    }
}

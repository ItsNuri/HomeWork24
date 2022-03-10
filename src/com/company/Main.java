package com.company;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,2);
        }
        System.out.println("Int array: " + Arrays.toString(array));
        System.out.print("Int array sorted: ");
        sort(array);
        System.out.println("________________________________");

        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array2.add(random.nextInt(0,2));
        }
        System.out.println("ArrayList: " + array2);
        System.out.print("ArrayList sorted: ");
        sort(array2);
        System.out.println("________________________________");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++){
            linkedList.push(random.nextInt(0, 2));
        }
        System.out.println("linkedList: "+linkedList);
        System.out.print("Linked list sorted: ");
        sort(linkedList);  //Overload метод 3.
        System.out.println("_________________________________________________");

    }
    public static void sort(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            Collections.sort(list);
        }
        System.out.println(list);

    }
    public static void sort(ArrayList<Integer> array) {
            ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);
    }

    public static void sort(LinkedList<Integer> array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            list.push(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);
    }

}

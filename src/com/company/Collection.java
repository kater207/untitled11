package com.company;

import java.util.Arrays;

public class Collection {
    String[] array = {"HELLO", "my", "dear", "friend", "my", "name", "is", "Kate", "and", "you"};

    public Collection(String[] array) {
        this.array = array;

    }

    int count = 0;

    public Collection() {
        String[] array = new String[]{};
    }

    public int getSize() {
        count = array.length;
        System.out.println(count);
        return count;
    }

    public boolean adddElement(int count) {
        String[] newArray;
        if (count > array.length + 1)
            return false;
        else {
            newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = "cat";
            System.out.println(Arrays.toString(newArray));
            count++;
        }
        return true;
    }


    public boolean deleting(int index) {
        if (index > array.length)
            return false;
        else {
            array[index] = array[array.length - 1];
            String[] newArray = new String[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            System.out.println(Arrays.toString(newArray));
        }
        return true;
    }

    public void get() {
        int index = -1;
        for (int i = 0; (i < array.length) && (index == -1); i++) {
            if (array[i] == "Kate") {
                index = i;
            }
        }
        System.out.println(array[index]);
    }

    public boolean contains() {
        String index = "HELLO";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index)
                System.out.println("Элемент существует");
        }
        return false;
    }

    public void findOfIndex() {
        int index = -1;
        for (int i = 0; (i < array.length) && (index == -1); i++) {
            if (array[i] == "Kate") {
                index = i;
            }
        }
        System.out.println(index);
    }

    public boolean equalse(String[] array1) {
        if (array1 != array)
            return false;
        else
            return true;

    }

    public void clear() {
        array = new String[array.length];
        System.out.println(Arrays.toString(array));
    }

}



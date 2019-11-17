package edx_javacore_2_module_1;

import java.util.ArrayList;

public class ArrayListExercise {

    public static void misteryArr(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                arr.add(arr.get(i));
            } else {
                arr.add(0, arr.get(i));
            }
        }
        System.out.println(arr);
    }

    public static ArrayList<String> removeEvenLength(ArrayList<String> arrListString) {
        int size = arrListString.size();
        for (int i = 0; i < size; i++) {
            if (arrListString.get(i).length() % 2 == 0) {
                arrListString.remove(i);
                size--;
                i--;
            }
        }
        return arrListString;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(4);
        misteryArr(list);

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("Ava");
        listStr.add("Avalon");
        listStr.add("Avanta");
        listStr.add("Aval");
        listStr.add("Avaxa");
        listStr.add("Avalange");
        System.out.println(listStr);
        removeEvenLength(listStr);
        System.out.println(listStr);
    }
}

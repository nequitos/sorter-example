package src.modules;


import java.util.List;



public class TreeSorter {

    TreeSorter(Integer size, String var) {
        int[] intArray = new int[size];
        for (int i = 0; i < var.length(); i++) {
            intArray[i] = Integer.parseInt(var.substring(i, i + 1));
        }
    }

    public void sort(List<Integer> list) {

    }
}

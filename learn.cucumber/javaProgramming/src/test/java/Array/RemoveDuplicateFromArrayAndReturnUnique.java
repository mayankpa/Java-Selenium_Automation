package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayAndReturnUnique {
//removeDuplicatefromArrayAndReturnUsingArrayListAndHashSet
public static void main(String[] args) {
    int[] intArr = {1, 2, 2, 5, 1, 6, 12, 7, 12, 12, 3, 8};
    int[] outArr = removeDuplicatefromArrayAndReturnUsingArrayListAndHashSet(intArr);
    System.out.println("Original array");
    for(int i : intArr){
        System.out.print(i+" ");
    }
    System.out.println("");
    System.out.println("after removal");
    for(int i : outArr){
        System.out.print(i+" ");
    }
}

    public static int[] removeDuplicatefromArrayAndReturnUsingArrayListAndHashSet(int[] input){
        // Adding array elements to a list
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i : input){
            tempList.add(i);
        }
        // creating a set using list
        Set<Integer> set = new HashSet<Integer>(tempList);
        Integer[] output = new Integer[set.size()];
        int[] arrOut = new int[output.length];
        set.toArray(output);
        int j =0;
        for(Integer i : output){
            arrOut[j++] = i;
        }
        return arrOut;
    }
    }



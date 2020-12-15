package Array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {

    @Test
    public void removeDuplicateFromArray(){
        int a [] = {1,1,2,2,3,3,4,4,5,5,5};
        //Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int[] b = removeDuplicateFromArrayFunction(a);
        System.out.println(Arrays.toString(b));
        int d[]={11,23,12,11,23};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        int e[]= removeDuplicateFromArrayFunction(d);
        System.out.println(Arrays.toString(e));


    }
    public static int[] removeDuplicateFromArrayFunction(int [] originalArray){
        int [] tempArray= new int [originalArray.length];
        int j=0;
        for (int i=0; i<originalArray.length-1;i++){
            int currentElement= originalArray[i];
            if(currentElement != originalArray[i+1]){
                tempArray[j++]=currentElement;
            }
        }
        tempArray[j++]=originalArray[originalArray.length-1];
        return tempArray;
    }
    @Test
    public void removeDuplicatePrintUnique(){
        int a [] = {1,1,2,2,3,3,4,4,5,5,5};
        System.out.println(Arrays.toString(a));
        int [] tempArray= new int[a.length];
        int j=0;
        for (int i=0; i<a.length-1;i++){
            int current=a[i];
            if(current != a[i+1]){
                tempArray[j++]= current;
            }
        }
        tempArray[j++]=a[a.length-1];
        System.out.println(Arrays.toString(tempArray));
    }
    @Test
    public void removeDuplicateFromArray1(){
        String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
        System.out.println(Arrays.toString(strArray1));

        for (int i = 0; i < strArray1.length-1; i++) {

            for (int j = i+1; j < strArray1.length; j++) {

                if( (strArray1[i].equals(strArray1[j])) && (i != j) ) {

                    System.out.println("Duplicates : "+strArray1[j]);

                }
            }
        }
    }

    @Test
    public void removeDuplicatefromArrayUsingLinkedHasSet(){
        Integer year [] ={1982,1984,1978,1982,1984};
        System.out.println((Arrays.toString(year)));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(year));
        System.out.println(linkedHashSet);

    }
    @Test
    public void removeDuplicatefromArrayUsingLinkedHasSet1(){
        String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
        System.out.println((Arrays.toString(strArray1)));
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(strArray1));
        System.out.println(linkedHashSet);

    }

    @Test
    public void removeDuplicateUsingJavaStreamAPIDistinctMethod(){
        int [] a= {1,2,1,2,3,4,0,4,3,5};
        int [] b= Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

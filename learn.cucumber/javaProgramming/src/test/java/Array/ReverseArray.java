package Array;

import org.testng.annotations.Test;

public class ReverseArray {
    @Test(priority = 0)
    public void reverseArray(){
        String [] house = {"BH1","BH2","BH3","BH4","BH5"};
        System.out.println(house.length);
        //Print array
        for(int i=0; i<house.length;i++){
            System.out.println(house[i]);
        }
        //Print Reverse Array
        for (int j=house.length-1;j>=0;j--){
            System.out.println(house[j]);
        }
    }
    @Test (priority = 1)
    public void reverseArray1(){
        String [] name={"Toom","Zoom","Loom","Doom"};

        int arraySize= name.length;
        for (int i= 0; i<arraySize;i++){
            System.out.println(name[i]);
        }
        System.out.println("===============*******================");
        for (int j=arraySize-1;j>=0;j--){
            System.out.println(name[j]);
        }
    }

    @Test(priority = 2)
    public void reverseArray2() {
        String name[] = new String[5];
        name[0]="Kim";
        name[1]="Jim";
        name[2]="Dim";
        int arraySize=name.length;
        for (int i=0;i<arraySize;i++){
            System.out.println(name[i]);
        }
        System.out.println("*************************");
        int age []={11,23,24,25,26};
        for (int i=age.length-1; i>=0;i--){
            System.out.println(age[i]);
        }
    }


}

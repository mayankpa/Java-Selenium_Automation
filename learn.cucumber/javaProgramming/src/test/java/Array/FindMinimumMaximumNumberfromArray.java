package Array;

import org.testng.annotations.Test;

public class FindMinimumMaximumNumberfromArray {

    @Test
    public void findMinimumNumberFromArray(){
        int [] number = {11,27,9,12,15};
        int min = number[0];
        for (int i=0; i<number.length;i++){
            if(number[i]<min){
                min= number[i];
            }

        }
        System.out.println(min);
    }

    @Test
    public void findMaximumNumberFromArray(){
        int num [] ={11,23,23,25,20};
        int max = num[0];
        for (int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);
    }

    @Test
    public void findMinimumMaximumNumberfromArray(){
        int number [] = {11,13,15,17,19,18};
        int  maximum =number[0];
        int  minimum = number[0];
        for (int i=0;i<number.length;i++){
            if(number[i] >maximum){
                maximum= number[i];
            }else if(number[i]< minimum){
                minimum= number[i];
            }
        }
        System.out.println("Maximum" + maximum);
        System.out.println("Minimum" + minimum);
    }
}

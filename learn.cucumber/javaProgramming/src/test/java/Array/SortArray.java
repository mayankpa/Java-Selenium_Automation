package Array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortArray {
    @Test(priority = 0)

    public void sortArray(){
        int [] age = {101,99,95,105,107,88};
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        String [] house = {"Ranch","Two Story","Condo","Three Story","Ground floor","Flat"};
        Arrays.sort(house);
        System.out.println(Arrays.toString(house));
    }
}

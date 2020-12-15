package Array;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.util.ArrayUtil;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveElementFromArrayAtGivenIndexNumber {

    @Test
    public void removeElementfromArray(){
        int [] number = {11,13,15,16,18,20};
        for (int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
       number= ArrayUtils.remove(number,3);
        System.out.println(Arrays.toString(number));

    }
}

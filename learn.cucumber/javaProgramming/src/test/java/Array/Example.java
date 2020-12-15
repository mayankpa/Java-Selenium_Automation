package Array;

import org.testng.annotations.Test;

public class Example {

    @Test
    public void testString(){
        String s= "Hello Java";
        char [] chars = s.toCharArray();
        int size = chars.length;
        for(int i= size-1;i>0;i--){
            System.out.println();
        }
    }


}

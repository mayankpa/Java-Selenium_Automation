package Array;

import org.testng.annotations.Test;

public class FindOddEvenNumberInArray {

    @Test
    public void findOddEvenNumber(){
        int number [] ={11,12,13,14,0};
        for(int i=0; i<number.length;i++){
            if(number[i] % 2 !=0){
                System.out.println("Odd" + number[i]);
            }else if (number[i] %2 ==0){
                System.out.println("Even" + number[i]);
            }else{
                System.out.println("zero number");
            }
        }
    }
}

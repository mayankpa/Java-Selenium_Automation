package String;

public class ReverseString {
    public static void main(String [] args){
        String input = "I am Mayank Patel";
        char [] letters= input.toCharArray();
        for (int i =letters.length -1; i>=0; i--){
            System.out.println(letters[i]);
        }

        StringBuilder input1= new StringBuilder();
        input1.append(input);
        input1=input1.reverse();
        System.out.println(input1);

    }
}

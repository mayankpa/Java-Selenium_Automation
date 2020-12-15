package String;

public class CheckTheStringIsPalindrome {
    public static void main(String [] args){
       System.out.println("Palnidrome meaning read number or text or word same backward and fordward");
       String str= "madamd";
       if(isPalindrome(str))
           System.out.println("yes");
       else
           System.out.println("no");

       CheckTheStringIsPalindrome s = new CheckTheStringIsPalindrome();
       s.compareString();
    }

    public static boolean isPalindrome(String str){
            int i=0;
            int j= str.length() -1;

            while (i<j){
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
    }

    public static void isNumberPalindrome(){
        int i= 1001;

    }

    public void compareString(){
        String str= "Madam";
        StringBuilder input1= new StringBuilder();
        input1.append(str);
        input1=input1.reverse();
        System.out.println(input1);
    }

}

package Interview;

public class NumberTestProgram {

        public static void main(String [] args){
            NumberTestProgram n = new NumberTestProgram();
            int x=n.getNum(1500);
            System.out.println(x);
            n.testNumber(101,100);
            n.testNumber(96,100);
            n.testNumber(-5,100);
        }
        public int getNum (int x){
         x=100;
         return x;
        }

        public void testNumber(int y, int z){
            int x;
            if (z<=y){
                x=z-y;
                System.out.println("Input Number :" +y);
                System.out.println("Output Number :" +z);
            } else if (z>=y){
                x= z-y;
                System.out.println("Input Number :" +y);
                System.out.println("Output Number :" +z);
            }
        }

}

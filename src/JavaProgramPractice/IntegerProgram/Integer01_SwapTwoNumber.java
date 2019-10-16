package JavaProgramPractice.IntegerProgram;

public class Integer01_SwapTwoNumber {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}

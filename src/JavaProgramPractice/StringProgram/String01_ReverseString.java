package JavaProgramPractice.StringProgram;

public class String01_ReverseString {
    public static void main(String[] args) {
        String str = "Java";

        for(int i = str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }

        ////reversed string using Stringbuffer
        //        String reverseStr = new StringBuffer(str).reverse().toString();
    }
}

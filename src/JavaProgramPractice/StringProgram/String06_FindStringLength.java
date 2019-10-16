package JavaProgramPractice.StringProgram;

public class String06_FindStringLength {
    public static void main(String[] args) {

        String str = "Selenium is Java";
        str.length();

         //1st way
        char[] c=str.toCharArray();
        System.out.println(c.length);

        //2nd way
        int i=str.lastIndexOf("");
        System.out.println(i);

    }
}

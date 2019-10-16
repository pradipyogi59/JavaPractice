package JavaProgramPractice.StringProgram;

public class String07_ReverseEachWord {
    public static void main(String[] args) {
        String str = "Make Selenium Easy";
        String[] strArray = str.split(" ");
        for(String s : strArray)
        {
            for(int i = s.length()-1; i >=0; i--)
                System.out.print(s.charAt(i));

            System.out.print(" ");
        }
    }
}

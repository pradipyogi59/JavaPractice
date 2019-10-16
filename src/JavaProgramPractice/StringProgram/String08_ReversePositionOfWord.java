package JavaProgramPractice.StringProgram;

public class String08_ReversePositionOfWord {
    public static void main(String[] args) {
        String str = "Make Selenium Easy";
        String[] strArray = str.split(" ");
        for(int i = strArray.length-1; i>=0; i-- )
        {
            System.out.print(strArray[i]);
        }
    }
}

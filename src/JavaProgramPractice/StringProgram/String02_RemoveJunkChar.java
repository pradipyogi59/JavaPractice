package JavaProgramPractice.StringProgram;

public class String02_RemoveJunkChar {
    public static void main(String[] args) {

        String str = "Abc%23#8,Ssd.";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}

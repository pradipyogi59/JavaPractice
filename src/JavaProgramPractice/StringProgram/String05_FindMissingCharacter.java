package JavaProgramPractice.StringProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String05_FindMissingCharacter {
    public static void main(String[] args) {

        String inputString = "Pradip is available until bcdefghijklmnopqrstABCDEFGHIJKLMNOP";
        inputString = inputString.replace(" ", "");

        String[] inputStringArray = inputString.split("");
        String[] allCharsArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        Set<String> inputSet = new HashSet<String>(Arrays.asList(inputStringArray));
        Set<String> allCharsSet = new HashSet<String>(Arrays.asList(allCharsArray));

        System.out.println("User input set is : " + inputSet);
        System.out.println("Alphabets set is : " + allCharsSet);

        // Intersection of above set
        allCharsSet.removeAll(inputSet);

        System.out.println("Missing Alphabets set is : " + allCharsSet);
    }
}

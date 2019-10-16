package JavaProgramPractice.StringProgram;

import java.util.HashSet;
import java.util.Set;

public class String04_RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str = "Make Selenium Easy";
        str = str.toUpperCase();
        char[] charArray = str.toCharArray();

        Set<Character> hs = new HashSet<>();
        for(Character c : charArray)
        {
            hs.add(c);
        }

        System.out.println(hs);

    }
}

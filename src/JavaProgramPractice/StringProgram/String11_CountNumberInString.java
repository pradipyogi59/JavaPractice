package JavaProgramPractice.StringProgram;

import java.util.HashMap;
import java.util.Set;

public class String11_CountNumberInString {
    public static void main(String args[])
    {

        String name="Hello java world";
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();

        char[] strArray=name.toCharArray();

        for (char c:strArray)
        {
            if (map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        Set<Character> charsInString = map.keySet();

        System.out.println("Duplicate Characters In "+map);
    }
    //Above program is a case sensitive i.e it treats ‘A’ and ‘a’ as two different characters. If you want your program not to be case sensitive, convert the input string to either lowercase or uppercase using toLowerCase() or toUpperCase() methods.
    //If you don’t want to count white spaces then remove white spaces from inputString using inputString.replaceAll("\\s+", "")

}

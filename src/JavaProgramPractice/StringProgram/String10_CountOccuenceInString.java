package JavaProgramPractice.StringProgram;

public class String10_CountOccuenceInString {
    public static void main(String[] args) {

        String input="Hello World";

        //counting occurrence of character with loop
                int charCount = 0;
                for(int i =0 ; i<input.length(); i++){
                    if(input.charAt(i) == 'a'){
                        charCount++;
                    }
                }
        //        for(char ch: input.toCharArray()){
        //            if(ch == 'a'){
        //                charCount++;
        //            }
        //        }
    }
}

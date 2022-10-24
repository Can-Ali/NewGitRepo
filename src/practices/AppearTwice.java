package practices;

import java.util.Arrays;

public class AppearTwice {


    public static void main(String[] args) {
        String sentence = "Java is very good language in automation, but java very has some probblems";
        String trg = "very";
        System.out.println(appearsTwice(trg, sentence));
    }

	public static boolean appearsTwice(String target, String sentence) {
        boolean b = false;
        int count = 0;
        String [] str = sentence.split(" ");
        System.out.println(Arrays.toString(str));
        for(int i = 0; i<str.length; i++) {
            if(str[i].toLowerCase().contains(target.toLowerCase())) {
                count++;

            }
            if(count==2) {
                b=true;
            }else {

             b= false;
            }
        }

        return b;

    }

}

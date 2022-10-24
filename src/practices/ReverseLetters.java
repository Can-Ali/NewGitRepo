package practices;

public class ReverseLetters {

    public static void main(String[] args) {

        String result = reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false

    }


    public static String reverseLetters(String word){
        char[] wordArr= word.toCharArray();
        String tempword=word.replaceAll("\\W", "");
        char [] temp= new char[tempword.length()];


                for(int i=temp.length-1;i>=0;i--) {
            temp[temp.length-1-i]=tempword.charAt(i);
        }
                for(int i=0,j=0;i<wordArr.length;i++) {
            if(Character.isAlphabetic(wordArr[i]))
                wordArr[i]=temp[j++];
        }

        word="";
                for(char each: wordArr)
        word+=each;
                return word;
    }



    //abf a
    //baf a
    //BSDb`nagsn s
}

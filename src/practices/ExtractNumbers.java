package practices;

public class ExtractNumbers {

    public static void main(String[] args) {

        String x="aa23aa34kh7";

//        x.replaceAll("a", "");
//        x=x.replaceAll("[^0123456789]","");

    //			System.out.println(x);

        System.out.println(extractNum(x));

}


//			public static String extractNum(String s) {
//				String result="";
//				for(int i=0; i<s.length();i++) {
//					if(s.charAt(i)>=48 && s.charAt(i)<=57)
//						result+=s.charAt(i);
//				}
//				return result;
//			}

    public static String extractNum(String s) {
        String result="";
        for(int i=0; i<s.length();i++) {
            if(Character.isDigit(s.charAt(i)))
                result+=s.charAt(i);
        }
        return result;

    }


}

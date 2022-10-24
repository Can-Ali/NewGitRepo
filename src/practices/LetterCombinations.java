package practices;

public class LetterCombinations {

    //Print letter combinations from 'z' to 'v'
    public static void main(String[] args) {

        for (char i = 'z'; i >= 'v'; i--) {
            for (char j = 'z'; j >= 'v'; j--) {
                System.out.print(i);
                System.out.println(j);
            }
        }
    }


}

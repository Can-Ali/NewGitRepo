package practices;

public class RemoveDublicates {

    //How to remove duplicate characters from String?
    public static void main(String[] args) {
        String name = "hhhhellloo";
        String newName = "";

        while (name.length() > 0) {
            String firstletter = name.substring(0, 1);
            if (name.substring(1).contains(firstletter)) {
                newName += firstletter;
                name = name.replace(firstletter, "");
            } else {
                newName += firstletter;
                name = name.replace(firstletter, "");
            }
        }

        System.out.println(newName);

    }
}

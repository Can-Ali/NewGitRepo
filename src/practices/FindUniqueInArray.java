package practices;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueInArray {

  public static void main(String[] args) {
    System.out.println("Hello World");

//        Faker faker = new Faker();
//        System.out.println(faker.name().firstName());
//        System.out.println(faker.name().lastName());
//
//        System.out.println(faker.chuckNorris().fact());

//        System.out.println(solution1("a@gmail.com"));

    int[] array ={4,3,4,7,9,9,11,5,6,7,3,5,6};
    System.out.println("Non group member is : " + solution(array));

    findUnique();

  }


//  public static boolean solution1(String S) {
//    // write your code in Java 8
//
//    boolean b = true;
//    String[] partions = S.split("@");
//    if(!S.contains("@")){
//      b = false;
//    }
//    if(partions[0].length()>0 && partions[1].contains(".")){
//      b=true;
//    }else{
//      b=false;
//    }
//
//    return b;
//  }



  /*
   *Finding unique integer in an array
   *
   */
  public static int solution(int[] A) {
    // write your code in Java 8
    int nonGroupMember=0;
    int count=0;
    for (int i=0; i<A.length; i++){
      int thisInt =A[i];
      for(int j=0; j<A.length; j++){
        if(thisInt==A[j]){
          count++;
        }
      }
      if(count==1){
        nonGroupMember = thisInt;
        System.out.println(thisInt);
      }
      count = 0;
    }
    return nonGroupMember;

  }


  public static void findUnique() {
    int[] Array1 = new int[]{1,1,2,2,5,6,6};
    int[] Array2 = new int[]{2,2,1,1,6,6};
    boolean contains = false;
    List<Integer> results = new ArrayList<Integer>();


    for (int i = 0; i < Array1.length; i++) {
      for (int j = 0; j < Array2.length; j++) {
        if (Array1[i] == Array2[j]) {
          contains = true;
          break;
        }
      }
      if (!contains) {
        System.out.println("Contains => " + contains);
        results.add(Array1[i]);
      }

      contains = false;
    }

    System.out.println(results);
  }

}

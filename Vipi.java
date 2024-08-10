
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




class Vipi {

  public static void main(String a[]) throws InterruptedException {

    // Map<String, Integer> students = new Hashtable<>();

    // students.put("Kev", 90);
    // students.put("Kodak", 80);
    // students.put("Durk", 70);
    // students.put("Future", 94);
    // students.put("Kev", 60);
    // System.out.println(students.get("Kev"));
    // // System.out.println(students.keySet());

    // for (String key : students.keySet()){
    //   System.out.println(key + ":"+ students.get(key));
    // }
    Comparator<Integer> com = new Comparator<Integer>() 
    {
     public int compare(Integer i, Integer j) {
      if (i%10 > j%10){
        return 1;
      }else {
        return -1;
      }
     }

    };




    List<Integer> nums = new ArrayList<>();
    nums.add(55);
    nums.add(91);
    nums.add(36);
    nums.add(74);
    Collections.sort(nums, com);
    System.out.println(nums);

  }

}

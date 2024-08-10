
import java.util.ArrayList;
import java.util.Collections;
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
    
    List<Integer> nums = new ArrayList<>();
    nums.add(5);
    nums.add(9);
    nums.add(3);
    nums.add(7);
    Collections.sort(nums);
System.out.println(nums);


  }

}

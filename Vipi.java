
import java.util.Hashtable;
import java.util.Map;




class Vipi {

  public static void main(String a[]) throws InterruptedException {

    Map<String, Integer> students = new Hashtable<>();

    students.put("Kev", 90);
    students.put("Kodak", 80);
    students.put("Durk", 70);
    students.put("Future", 94);
    students.put("Kev", 60);
    System.out.println(students.get("Kev"));
    // System.out.println(students.keySet());

    for (String key : students.keySet()){
      System.out.println(key + ":"+ students.get(key));
    }
    


  }

}

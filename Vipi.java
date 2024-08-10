

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class Student{

  int age;
  String name;
  
  public String toString() {
    return "Students [age=" + age + ", name=" + name + "]";
  }

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  
  
}



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



    List<Student> studs = new ArrayList<>();
    studs.add(new Student(25,"Mwima"));
    studs.add(new Student(22,"Kodak"));
    studs.add(new Student(24,"Jake"));
    studs.add(new Student(35, "Palmer"));
    
    for (Student s : studs) {
      System.out.println(s);
      
    }
  

  }

}

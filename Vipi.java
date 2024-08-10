

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student implements Comparable<Student>{

  int age;
  String name;
  
  public String toString() {
    return "Students [age=" + age + ", name=" + name + "]";
  }

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(Student that) {
    
    if (this.age> that.age){
        return 1;
      }else {
        return -1;
      }
    
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
    Comparator<Student> com = new Comparator<Student>() 
    {
     public int compare(Student i, Student j) {
      if (i.age> j.age){
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
    
    // Collections.sort(studs, com);
    Collections.sort(studs);

    for (Student s : studs) {
      System.out.println(s);
      
    }
  

  }

}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    //single parameter constructor
    public Student(String name) {
        this.name = name;
    }

    //non-parametized contsructor
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
    
    
}

class MethodRefEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Martin", "Luther", "King", "Junior");

        List<Student> students = new ArrayList<>();

        // for (String name : names) {
        //     students.add(new Student(name));
        // }

        students = names.stream().map(name -> new Student(name)).toList();
        System.out.println(students);

        // List<String> Unames = names.stream().map(name -> name.toUpperCase()).toList();
        // List<String> Unames = names.stream()
        // .map(String::toUpperCase)
        //         .toList();

        // Unames.forEach(i -> System.out.println(i));
        // Unames.forEach(System.out::println);

        // System.out.println(Unames);
    }
    
}

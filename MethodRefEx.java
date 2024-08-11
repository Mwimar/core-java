
import java.util.Arrays;
import java.util.List;

class MethodRefEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Martin", "Luther", "King", "Junior");
        // List<String> Unames = names.stream().map(name -> name.toUpperCase()).toList();
        List<String> Unames = names.stream()
        .map(String::toUpperCase)
                .toList();
        
        Unames.forEach(i -> System.out.println(i));


        // System.out.println(Unames);
    }
    
}

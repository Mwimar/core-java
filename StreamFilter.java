
import java.util.Arrays;
import java.util.List;

public class StreamFilter {




  public static void main(String[] args) {
    
    List<String> names = Arrays.asList("Eenie", "Meenie", "Miney", "Mee");

    String name = names.stream()
        .filter(str -> str.contains("o"))
    .findFirst().orElse("Not found");
    System.out.println(name);
   
   
  
  


    
}

    
}

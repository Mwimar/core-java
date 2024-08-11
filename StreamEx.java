
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


class StreamEx {
  public static void main(String[] args) {
    
    List<String> names = Arrays.asList("Eenie", "Meenie", "Miney", "Mee");

    Optional<String> name = names.stream().filter(str -> str.contains("o")).findFirst();
    System.out.println(name.get());
   
  }
  


    
}

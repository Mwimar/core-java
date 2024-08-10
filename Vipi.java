
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;





  




class Vipi {

  public static void main(String a[]) throws InterruptedException {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
    
    Stream<Integer> s1 = nums.stream();
    s1.forEach(n -> System.out.println(n));
    
  
    

  }

}

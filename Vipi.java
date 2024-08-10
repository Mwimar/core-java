
import java.util.Arrays;
import java.util.List;





  




class Vipi {

  public static void main(String a[]) throws InterruptedException {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
    
    // Stream<Integer> s1 = nums.stream();
    // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
    // Stream<Integer> s3 = s2.map(n -> n * 3);

    int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c,e) -> c+e);

        System.out.println(result);

    // s3.forEach(n -> System.out.println(n));
    

    
    
  
    

  }

}

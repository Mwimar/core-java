
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;





  




class Vipi {

  public static void main(String a[]) throws InterruptedException {

    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
    // for (int i = 0; i < nums.size(); i++) {
    //   System.out.println(nums.get(i));
    // }

    //     for (int n : nums) {
    //   System.out.println(n);
    // }

    Consumer<Integer> con = n -> System.out.println(n);
  
    
    nums.forEach(con);
    // nums.forEach(n ->System.out.println(n));

    int sum = 0;
    for (int n : nums) {

      if (n % 2 == 0) {
        n = n * 2;
        sum = sum + n;
      }

    }

    // System.out.println(sum);

  }

}

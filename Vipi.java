
import java.util.Arrays;
import java.util.List;





  




class Vipi {

  public static void main(String a[]) throws InterruptedException {

    List<Integer> nums =  Arrays.asList(4, 5, 7, 3, 2,6);
    int sum = 0;
    for (int n : nums) {

      if (n % 2 == 0) {
        n = n * 2;
        sum = sum + n;
      }
     
    }
    
    System.out.println(sum);


  }

}


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;





class Vipi {

  public static void main(String a[]) throws InterruptedException {

    List<Integer> nums = new ArrayList<Integer>();
    nums.add(7);
    nums.add(2);
    nums.add(5);
    nums.add(9);

    System.out.println(nums.get(3));

        for (int n : nums) {
      System.out.println(n);
    }
//     for (Object n : nums) {
//       int num = (Integer) n;
//   System.out.println(n);
// }
  }

}

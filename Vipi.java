
import java.util.ArrayList;
import java.util.Collection;





class Vipi {

  public static void main(String a[]) throws InterruptedException {

    Collection nums = new ArrayList();
    nums.add(7);
    nums.add(2);
    nums.add(5);
    nums.add(9);

    System.out.println(nums);

    //     for (int n : nums) {
    //   System.out.println(n);
    // }
    for (Object n : nums) {
      int num = (Integer) n;
  System.out.println(n);
}
  }

}

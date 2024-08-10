
import java.util.ArrayList;
import java.util.Collection;





class Vipi {

  public static void main(String a[]) throws InterruptedException {
    
    Collection<Integer> nums = new ArrayList<Integer>();
    nums.add(7);
    nums.add(2);
    nums.add(5);
    nums.add(9);

    System.out.println(nums);

    for (int n : nums) {
  System.out.println(n);
}
  }

}

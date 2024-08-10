
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;





class Vipi {

  public static void main(String a[]) throws InterruptedException {

    Collection<Integer> nums = new TreeSet<Integer>();
    nums.add(78);
    nums.add(23);
    nums.add(52);
    nums.add(97);
    // System.out.println(nums);

    Iterator<Integer> values = nums.iterator();
    while (values.hasNext()) {
      
      System.out.println(values.next());
    }
    

    //     for (int n : nums) {
    //   System.out.println(n);
    // }
//     for (Object n : nums) {
//       int num = (Integer) n;
//   System.out.println(n);
// }
  }

}

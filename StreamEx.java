
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class StreamEx {
  public static void main(String[] args) {
    

    int size = 10000;
    
    List<Integer> nums = new ArrayList<>(10000);
  
    Random ran = new Random();
  
    
    for(int i = 1; i<=10000; i++)
    {
      nums.add(ran.nextInt(100));
    }
    System.out.println(nums);
    
  }
  

    
}

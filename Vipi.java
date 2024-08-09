
import java.util.Scanner;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;


class Vipi {
 

  public static void main(String a[]) {
    // A obj = (x, y) -> x + y;

    // int result = obj.add(6, 3);
    // System.out.println(result);

    //   int x = 20;
    //   int y = 0;

    //   try {
    //     y = 18 / x;
    //     if (y == 0) {
    //       throw new MyException("Cannot divide by zero");//throwing exception to catch
    //      }

    //   } catch (MyException e) {

    //     y = 18 / 1;
    //     System.out.println("Default Output" + e);

    //   } catch (Exception e) {
    //     System.out.println("Something went Wrong " + e);
    //   }
    //   System.out.println(y);
    //   System.out.println("Bye");

    // A obj = new A();
    // try {
    //   obj.show();
    // } catch (ClassNotFoundException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a double");
    Double dec = sc.nextDouble();
    System.out.println(dec);
    sc.close();

  }
}

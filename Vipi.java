import java.io.IOException;

class A {
  public void show() throws ClassNotFoundException
  {
     Class.forName("Vip");        
    
  }
}
 

class Vipi {
  static {
    System.out.println("Class loaded");
  }

  public static void main(String a[]) throws IOException {
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

    System.out.println("Enter a number");
    int num = System.in.read();
    System.out.println(num);
  }
}

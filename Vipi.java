
class MyException extends Exception {
  MyException (String string) {
    super(string);//passing to exception supreclass
  }
}

 

class Vipi {

  public static void main(String a[]) {
    // A obj = (x, y) -> x + y;
    
    // int result = obj.add(6, 3);
    // System.out.println(result);
    try {
      Class.forName("Demo");
        
    } catch (ClassNotFoundException e) {
      System.out.println("Class not found");
    }

    int x = 20;
    int y = 0;
    
    try {
      y = 18 / x;
      if (y == 0) {
        throw new MyException("Cannot divide by zero");//throwing exception to catch
       }
      
    } catch (MyException e) {
      
      y = 18 / 1;
      System.out.println("Default Output" + e);
    
    } catch (Exception e) {
      System.out.println("Something went Wrong " + e);
    }
    System.out.println(y);
    System.out.println("Bye");
  }
}

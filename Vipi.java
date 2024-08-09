
class A  extends Thread{

  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("Vipi");
    }
  }
}

class B extends Thread{

  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("Niaje");
    }
  }
}
class Vipi {
 

  public static void main(String a[])  {
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

    // int x = 0;
    // int y = 0;
     
    // try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) 
    
    // {
          
    //   x = Integer.parseInt(bf.readLine());
    // } finally {
      
    // }
 
    A obj = new A();
    obj.start();

    B obj1 = new B();
    obj1.start();
    obj1.setPriority(Thread.MAX_PRIORITY);
    System.out.println("Obj priority:"+obj.getPriority());
  }

}

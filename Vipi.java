
// // class A  implements Runnable{

// //   public void run() {
// //     for (int i = 0; i <5; i++) {
// //       System.out.println("Vipi");
// //       try {
// //         Thread.sleep(10);
// //       } catch (InterruptedException e) {
// //         // TODO Auto-generated catch block
// //         e.printStackTrace();
// //       }
// //     }
// //   }
// // }

// class B implements Runnable{

//   public void run() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Niaje");
//       try {
//         Thread.sleep(10);
//       } catch (InterruptedException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//       }
//     }
//   }
// }


class Counter {
  int count;
  public synchronized  void increment() {
    count++;
  }
}

class Vipi {

  public static void main(String a[]) throws InterruptedException {
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

    // A obj = new A();
    // obj.start();

    // B obj1 = new B();
    // obj1.start();
    // obj1.setPriority(Thread.MAX_PRIORITY);
    // System.out.println("Obj priority:"+obj.getPriority());
    // Runnable obj1 = new A();

    Counter c = new Counter();
    

    Runnable obj1 = () -> {
      for (int i = 0; i < 10000; i++) {
        c.increment();
      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Runnable obj2 = () -> {
      for (int i = 0; i < 10000; i++) {
        c.increment();
      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(c.count);

  }

}

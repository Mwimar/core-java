
@FunctionalInterface
interface A {
  void show(int i);

}

// class B implements A {
//   public void show() {
//     System.out.println("In B show");
//   }
// } 

 
 

class Vipi {

  public static void main(String a[]) {
    A obj =  (int i) -> System.out.println("In new Show");
    
    
    obj.show(7);
  }
}

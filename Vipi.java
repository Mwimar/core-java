class Mobile {
    String brand;
    int price;
   static  String name;

   public void show() {
       System.out.println(brand + ":" + price + ":" + name);
   }

   static {
       name = "phone";
       System.out.println("In static block");
   }
    


    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }
    
    // public static void show1(Mobile mobile) {
    //     System.out.println(mobile.brand + ":" + mobile.price + ":" + mobile.name);
    // }
}

   


class Vipi {

    public static void main(String a[]) throws ClassNotFoundException {

        // Mobile mobile1 = new Mobile();
        // mobile1.brand = "Tecno";
        // mobile1.price = 50000;
        // Mobile.name = "Spark";

        // Mobile mobile2 = new Mobile();
       

        // mobile1.show();
        // mobile2.show();
        //    Mobile.show1(mobile1);
        Class.forName("Mobile");


    }

    }


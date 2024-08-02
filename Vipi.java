class Mobile {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand+ ":" + price+ ":" + name);
    }
}

   


class Vipi {

    public static void main(String a[]) {

        Mobile mobile1 = new Mobile();
        mobile1.brand = "Tecno";
        mobile1.price = 50000;
        mobile1.name = "Spark";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Huawei";
        mobile2.price = 7000;
        mobile2.name = "Matte";

        mobile1.show();
        mobile2.show();


    }

    }


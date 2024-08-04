class Human {
    private String name = "Kev";
    private int age = 20;
   
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

class Vipi {

    public static void main(String a[]) throws ClassNotFoundException {

       

        Human obj = new Human();
        
        System.out.println( obj.getName() + ":" + obj.getAge());

    }

}



class Human {
    private String name;
    private int age;
   
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;        
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
        
    }

}

class Vipi {

    public static void main(String a[]) throws ClassNotFoundException {

       

        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Mwima");
        System.out.println( obj.getName() + ":" + obj.getAge());

    }

}

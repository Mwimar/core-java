class Computer {

    public void playMusic() {
        System.out.println("Playing music");

    }


    public String getPen(int num){
        return "Pen";
    }

  }


class Vipi {

    public static void main(String a[]) {

        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.getPen(10);
        System.out.println(str);
    }
    }


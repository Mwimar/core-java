class Computer {

    public void playMusic() {
        System.out.println("Playing music");

    }


    public String getPen(int num) {
        if(num>=10)
            return "Pen";
        else
            return "No Pen";
    }

  }


class Vipi {

    public static void main(String a[]) {

        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.getPen(1);
        System.out.println(str);
    }
    }


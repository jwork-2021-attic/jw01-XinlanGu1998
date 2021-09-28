package S202220005;

public class Creature extends Being {
    String name;
    Creature(String n){
        name = n;
    }
    public void lookAt(Being other){
        System.out.println("I am looking at "+other+"'.");
    }
    public void speak(String content){
        System.out.println("I said '"+content+"'.");
    }
    public void touch(Being other){
        System.out.println("I touched "+other+".");
    }
    public void move(int distance){
        System.out.println("I moved "+distance+" meters.");
    }
}

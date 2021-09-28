package S202220005;

public class CarrierCreature extends Creature{
    Creature[] carrieds;
    int capacity, carrying;
    public CarrierCreature(String n, int c){
        super(n);
        capacity = c;
        carrying = 0;
        carrieds = new Creature[capacity];
    }
    public void carry(Creature c){
        if (carrying == capacity){
            System.out.println("Carrying capacity is full!");
            return;
        }
        carrieds[carrying] = c;
        carrying += 1;
        System.out.println("I carry "+c.name+".");
    }

    public void uncarry(){
        carrying -= 1;
    }

    @Override
    public void move(int distance){
        super.move(distance);
        for (int i = 0; i < carrying; i++){
            carrieds[i].move(distance);
        }
    }
}

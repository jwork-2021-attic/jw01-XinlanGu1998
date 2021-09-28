package S202220005;

public class MagicalCreature extends Creature{
    Magic magic;
    public MagicalCreature(String n, Magic m){
        super(n);
        magic = m;
    }
    public void doMagicOn(Being receiver){
        receiver.receiveMagic(magic);
    }
}

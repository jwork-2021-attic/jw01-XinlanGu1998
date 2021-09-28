package S202220005;

public class Pool extends Being{
    boolean hasWater;
    public Pool(boolean h){
        hasWater = h;
    }

    @Override
    public void receiveMagic(Magic magic){
        super.receiveMagic(magic);
        if (magic.kind == "Water" && !hasWater){
            hasWater = true;
            System.out.println("I'm filled with water.");
        }
    }
}

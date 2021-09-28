package S202220005;

public class Scene {
    Barrier barrier1, barrier2;
    MagicalCreature waterBoy, fireBoy;
    Creature snake;
    CarrierCreature tortoise;
    Pool pool;

    public Scene(){
        Magic waterMagic = new Magic("Water");
        Magic fireMagic = new Magic("Fire");
        waterBoy = new MagicalCreature("水娃", waterMagic);
        fireBoy = new MagicalCreature("火娃", fireMagic);
        snake = new Creature("蛇精");
        tortoise = new CarrierCreature("乌龟", 3);
        barrier1 = new Barrier();
        barrier2 = new Barrier();
        pool = new Pool(false);
    }

    public void Play(){
        snake.speak("走吧。");
        waterBoy.move(10);
        fireBoy.move(10);
        snake.move(10);
        barrier1.open();
        barrier2.open();
        tortoise.carry(waterBoy);
        tortoise.carry(fireBoy);
        tortoise.carry(snake);
        snake.speak("这个地方叫乌龟盼水，没有水走不了。");
        waterBoy.speak("这有什么难的？");
        waterBoy.doMagicOn(pool);
        snake.speak("啊？");
        tortoise.move(10);
        tortoise.lookAt(waterBoy);
        waterBoy.touch(tortoise);
    }

    public static void main(String[] args){
        new Scene().Play();
    }
}

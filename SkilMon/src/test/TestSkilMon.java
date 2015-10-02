package test;
import skilstak.c;
import skilstak.skilmon.SkilMon;

public class TestSkilMon {

    public static void main(String[] args) {
    
    SkilMon s = new SkilMon("OSX.json");
    System.out.println( c.red + "Speed:          " + s.speed);
    System.out.println(c.orange + "Attack:         " + s.attack);
    System.out.println(c.yellow + "Special Attack: " + s.spAttack);
    System.out.println(c.green + "Special Defence: " + s.spDefence);
    System.out.println(c.blue + "Happiness:       " + s.happiness);
    }


}

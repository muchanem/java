package skilstak.skilmon;
import java.util.ArrayList;
import skilstak.c;


public final class SkilMon {
    
    public int attack, defense, exp, happiness, 
                spAttack, hp, spDefence, speed, evolvesAt,
                total; 
    public String species; 
    public double catchRate, growthRate, height, width, mfRatio;  
    public ArrayList<String> abilities, types, moves;

    
    public SkilMon() {}
    public SkilMon(String jsonf) {
    
        System.out.println(c.rc() + "Yeah" + jsonf);    
    
    }

    
}




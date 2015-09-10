
import skilstak.c;
import java.util.Scanner;

public class hi{

    public static void main(String[] args) {
        String name;
        
        Scanner in = new Scanner(System.in);

         System.out.println(c.green + "Hi, whats your name" + c.reset);
         System.out.print(c.reset + "-->" + c.reset);
         name = in.nextLine();
         System.out.println(c.orange + "Hello There "+ c.red  + name + c.x);
                      
        }
}

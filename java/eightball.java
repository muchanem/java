import skilstak.c;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public final class eightball {
    
    
   private static List<String> answers = Arrays.asList( "It is certain", "It is decidedly so", "Without a doubt", "Yes, definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"  );    
   

   private final static  String choice(List list){
    int index = ThreadLocalRandom.current().nextInt(list.size());
    return (String) list.get(index);
   
   }
   private final static String input(String promt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(promt);
        String answer = scanner.nextLine();
        return answer;
   }
   public static final void main(String[] args){
        System.out.print(c.cl + c.yellow + "\n Welcome To Magic8Ball\n"
            + "Enter Your Question:\n\n" + c.x);
        while(true) {
            String question = input(c.x + "-->" + c.b3);
            String answer = choice(answers);
            System.out.println(c.random() + answer + c.x);
        }

    }
}

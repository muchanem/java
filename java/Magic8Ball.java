import java.util.Scanner;

import java.util.Random;

public class Magic8Ball {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Random generator = new Random();
        int theAnswer = generator.nextInt(20)+1;
        boolean playAgain = true;
        @SuppressWarnings("unused")
        boolean goAgain = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("+-+ +-+-+-+-+");
        System.out.println("|8| |B|A|L|L|");
        System.out.println("+-+ +-+-+-+-+");

        System.out.print(":::'###:::::'######::'##:::'##:\n");
        System.out.print("::'## ##:::'##... ##: ##::'##::\n");
        System.out.print(":'##:. ##:: ##:::..:: ##:'##:::\n");
        System.out.print("'##:::. ##:. ######:: #####::::\n");
        System.out.print(" #########::..... ##: ##. ##:::\n");
        System.out.print(" ##.... ##:'##::: ##: ##:. ##::\n");
        System.out.print(" ##:::: ##:. ######:: ##::. ##:\n");
        System.out.print(" ..:::::..:::......:::..::::..::\n");

        while (playAgain)
            {

            System.out.print("Ask a YES or NO question, and I'll give you the answer\n");
            String theQuestion = sc.nextLine();
            String prevQuestion = null;
            theQuestion = theQuestion.toLowerCase();    


           
            {

                if (goAgain = false)
                {
                    if (theAnswer == 1) //Yes                
                    {    
                    System.out.println("As I see it, yes.\n");
                    }
                    if (theAnswer == 2)
                    {
                        System.out.println("It is certain\n");
                    }
                    if (theAnswer == 3)
                    {
                        System.out.println("It is decidedly so\n");
                    }
                    if (theAnswer == 4)
                    {
                        System.out.println("Most likely\n");
                        System.out.print("  _____    __  __                   \n");
                        System.out.print(" |     |_ |__||  |--..-----. .---.-.\n");
                        System.out.print(" |       ||  ||    < |  -__| |  _  |\n");
                        System.out.print(" |_______||__||__|__||_____| |___._|\n");
                        System.out.print("                                    \n");
                        System.out.print("  __                                \n");
                        System.out.print(" |  |--..-----..-----..-----.       \n");
                        System.out.print(" |  _  ||  _  ||__ --||__ --|       \n");
                        System.out.print(" |_____||_____||_____||_____|       \n");

                    }
                    if (theAnswer == 5)
                    {
                        System.out.println("Outlook good\n");
                    }
                    if (theAnswer == 6)
                    {
                        System.out.println("Sign points to yes\n");
                    }
                    if (theAnswer == 7)
                    {
                        System.out.println("Without a doubt\n");
                    }
                    if (theAnswer == 8)
                    {
                        System.out.print("  __ __           \n");
                        System.out.print(" |  |  | ___  ___ \n");
                        System.out.print(" |_   _|| -_||_ -|\n");
                        System.out.print("   |_|  |___||___|\n");

                    }
                    if (theAnswer == 9)
                    {
                        System.out.println("Yes - definitley\n");
                    }
                    if (theAnswer == 10)
                    {
                        System.out.println("You may rely on it\n");
                    }
                    if (theAnswer == 11) //Maybe
                    {
                        System.out.println("Reply hazy, try again\n");
                    }
                    if (theAnswer == 12)
                    {
                        System.out.println("Ask again later\n");
                    }
                    if (theAnswer == 13)
                    {
                        System.out.println("Better not tell you now\n");
                    }
                    if (theAnswer == 14)
                    {
                        System.out.println("Cannot predict now\n");
                    }
                    if (theAnswer == 15)
                    {
                        System.out.println("Concentrate and ask again\n");
                    }
                    if (theAnswer == 16) //NO
                    {
                        System.out.println("Don't count on it\n");
                    }
                    if (theAnswer == 17)
                    {
                    System.out.println("My reply is...\n");
                    System.out.println("  _           _                    ");
                    System.out.println(" (_) _       (_)                   ");
                    System.out.println(" (_)(_)_     (_)    _  _  _        ");
                    System.out.println(" (_)  (_)_   (_) _ (_)(_)(_) _     ");
                    System.out.println(" (_)    (_)_ (_)(_)         (_)    ");
                    System.out.println(" (_)      (_)(_)(_)         (_)    ");
                    System.out.println(" (_)         (_)(_) _  _  _ (_)    ");
                    System.out.println(" (_)         (_)   (_)(_)(_)       ");

                    }
                    if (theAnswer == 18)
                    {
                        System.out.println("My sources say no\n");
                    }
                    if (theAnswer == 19)
                    {
                        System.out.println("Outlook not so good\n");
                    }
                    if (theAnswer == 20)
                    {
                        System.out.println("Very doubtful\n");
                    }
                    if (theQuestion.equals("Am I the boss?"))
                    {
                        System.out.println("No... I'm the boss");
                    }
                }
                else
                {
                        Random nexGen = new Random();
                        int nextAnswer = nexGen.nextInt(20)+1;
                        if (theQuestion == prevQuestion)
                        {
                            System.out.println("You just asked that question");
                        }
                        if ((nextAnswer == 1) && (!(theQuestion == prevQuestion)))  
                        {
                            System.out.println("As I see it, yes\n");
                        }

                        if ((nextAnswer == 2) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("It is certain\n");

                        }
                        if ((nextAnswer == 3) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("It is decidedly so\n");
                        }
                        if ((nextAnswer == 4) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Most likely\n");
                            System.out.print("  _____    __  __                   \n");
                            System.out.print(" |     |_ |__||  |--..-----. .---.-.\n");
                            System.out.print(" |       ||  ||    < |  -__| |  _  |\n");
                            System.out.print(" |_______||__||__|__||_____| |___._|\n");
                            System.out.print("                                    \n");
                            System.out.print("  __                                \n");
                            System.out.print(" |  |--..-----..-----..-----.       \n");
                            System.out.print(" |  _  ||  _  ||__ --||__ --|       \n");
                            System.out.print(" |_____||_____||_____||_____|       \n");
                        }
                        if ((nextAnswer == 5) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Outlook good\n");
                        }
                        if ((nextAnswer == 6) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Sign points to yes\n");                        
                        }
                        if ((nextAnswer == 7) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Without a doubt\n");                        
                        }
                        if ((nextAnswer == 8) && (!(theQuestion == prevQuestion)))
                        {        
                            System.out.print("  __ __           \n");
                            System.out.print(" |  |  | ___  ___ \n");
                            System.out.print(" |_   _|| -_||_ -|\n");
                            System.out.print("   |_|  |___||___|\n");
                        }
                        if ((nextAnswer == 9) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Yes - definitley\n");                        
                        }
                        if ((nextAnswer == 10) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("You may rely on it\n");                        
                        }
                        if ((nextAnswer == 11) && (!(theQuestion == prevQuestion))) //Maybe
                        {
                            System.out.println("Reply hazy, try again\n");                        
                        }
                        if ((nextAnswer == 12) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Try again later\n");                    
                        }
                        if ((nextAnswer == 13) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Better not tell you now\n");                
                        }
                        if ((nextAnswer == 14) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Cannot predict now\n");                    
                        }
                        if ((nextAnswer == 15) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Concentrate and ask again\n");                
                        }
                        if ((nextAnswer == 16) && (!(theQuestion == prevQuestion))) //NO
                        {
                            System.out.println("Don't count on it\n");                    
                        }
                        if ((nextAnswer == 17) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("My reply is...\n");
                            System.out.println("  _           _                    ");
                            System.out.println(" (_) _       (_)                   ");
                            System.out.println(" (_)(_)_     (_)    _  _  _        ");
                            System.out.println(" (_)  (_)_   (_) _ (_)(_)(_) _     ");
                            System.out.println(" (_)    (_)_ (_)(_)         (_)    ");
                            System.out.println(" (_)      (_)(_)(_)         (_)    ");
                            System.out.println(" (_)         (_)(_) _  _  _ (_)    ");
                            System.out.println(" (_)         (_)   (_)(_)(_)       ");
                        }
                        if ((nextAnswer == 18) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("My sources say no\n");                    
                        }
                        if ((nextAnswer == 19) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Outlook not so good\n");                    
                        }
                        if ((nextAnswer == 20) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("Very doubtful\n");        
                        }
                        if ((theQuestion == prevQuestion) && (!(theQuestion == prevQuestion)))
                        {
                            System.out.println("You just asked that question");
                        }
                        if ((theQuestion.equals("Am I the boss?")))
                        {
                            System.out.println("No... I'm the boss");
                        }

                if ((!(theQuestion == prevQuestion)))
                {
                    System.out.println("There is your answer... Ask another?");
                    goAgain = true;
                }
                String yesNo = sc.nextLine();
                if ((yesNo.equalsIgnoreCase("Y")) || (yesNo.equalsIgnoreCase("Yes")))
                {
                    playAgain = true;
                }
                if ((yesNo.equalsIgnoreCase("N")) || (yesNo.equalsIgnoreCase("No")))
                {
                    playAgain = false;
                    System.out.println("Thanks for playing");
                    System.out.println("http://www.miniCruzer911.co.cc/");
                    System.out.print(".___  ___.  __  .__   __.  __    ______ \n");
                    System.out.print("|   \\/   | |  | |  \\ |  | |  |  /      |\n");
                    System.out.print("|  \\  /  | |  | |   \\|  | |  | |  ,----'\n");
                    System.out.print("|  |\\/|  | |  | |  . `  | |  | |  |     \n");
                    System.out.print("|  |  |  | |  | |  |\\   | |  | |  `----.\n");
                    System.out.print("|__|  |__| |__| |__| \\__| |__|  \\______|\n");

                }
            }
        }
    }
}

}

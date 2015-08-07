import java.util.Scanner;

class hi {
  public static void main(String[] args) {

    String name;
    
    Scanner in = new Scanner(System.in);

    System.out.println("What is your name?");
    name = in.nextLine();
    System.out.println("Hi, "+name);
  }
}

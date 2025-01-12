import java.util.Scanner;
public class Main {
    float speed;
    Scanner input = new Scanner(System.in);
  
    public void run(){  
        System.out.println("Enter speed:");
        speed = input.nextFloat();
        System.out.println("You are running: "+ speed);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Main m = new Main();
        m.run();
    }
}

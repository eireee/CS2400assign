import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        self player1 = new self();
        Scanner keyboard = new Scanner(System.in);
        Boolean Q = true;
        while (Q == true)
        {
            System.out.println("Enter your name:");
            String name = keyboard.nextLine();
            if (name.equalsIgnoreCase("Amari"))
            {
                System.out.println("Please you're not the bird of destruction.....");
                System.out.println("Please enter a different name...");
                Q = true;
            }
            else
            {
                player1.setname(name);
                System.out.println("Your name is now " + player1.getname());
                Q = false;
            }
        }
        player1.info();
        self npc1 = new self("Kii", 500, 75, 100);
        npc1.info();
        keyboard.close();
        self npc2 = new self("Mia", 300, 40, 55);
        npc2.info();
        self npc3 = new self("Food", 50, 2, 1);
        npc3.info();
        // Im hungry...
    }
}
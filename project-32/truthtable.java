import java.util.Scanner;

public class TruthTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TRUTH TABLE GENERATOR =====");
        System.out.println("1. AND");
        System.out.println("2. OR");
        System.out.println("3. XOR");
        System.out.println("4. NAND");
        System.out.println("5. NOR");

        System.out.print("Choose gate: ");
        int choice = sc.nextInt();

        System.out.println("\nA B | Y");

        for (int a = 0; a <= 1; a++) {
            for (int b = 0; b <= 1; b++) {

                int y = 0;

                if (choice == 1)
                    y = a & b;
                else if (choice == 2)
                    y = a | b;
                else if (choice == 3)
                    y = a ^ b;
                else if (choice == 4)
                    y = (a & b) == 0 ? 1 : 0;
                else if (choice == 5)
                    y = (a | b) == 0 ? 1 : 0;
                else {
                    System.out.println("Invalid choice!");
                    return;
                }

                System.out.println(a + " " + b + " | " + y);
            }
        }

        sc.close();
    }
}
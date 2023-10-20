import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cina;
        String PN;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву продукту: ");
        PN = scanner.nextLine();
        System.out.print("Введіть ціну продукту: ");
        cina = scanner.nextInt();

        System.out.println("Назва продукту: " + PN);
        System.out.println("Ціна продукту: " + cina + "грн.");
    }
}
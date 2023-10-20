using System;

class Program {
    static void Main() {
        int cina;
        string PN;

        Console.Write("Введіть назву продукту: ");
        PN = Console.ReadLine();
        Console.Write("Введіть ціну продукту: ");
        cina = int.Parse(Console.ReadLine());

        Console.WriteLine("Назва продукту: " + PN);
        Console.WriteLine("Ціна продукту: " + cina + "грн.");

        Console.ReadKey();
    }
}
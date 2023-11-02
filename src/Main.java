import Package1.Client;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

     System.out.println("=== KARTOTEKA KLIENTA ===\n");
    //Poniżej obiekty klasy Client.
        Client c1 = new Client(345,"FKL Holdings","St. Joseph Av. 153",
            "London","GB","fkl@holdings.uk");
        Client c2 = new Client(233,"GGC","John Brown St.111",
                "Liverpool","UK","ggc@ggcgroup.uk");

        Client c3 = new Client(112,"FactoryJ","Las Frycowski 1", "FrycowaForest","Poland","factory@j.com.pl");

    //Wyświetlenie wcześniej utworzonych obiektów za pomocą metody print().
    c1.print();
    c2.print();
    c3.print();

    }
}
package Package1;
public class Client {

    //Pola(cechy) klasy Client. Modyfikator private ogranicza dostęp do danego pola tylko do jego własnej klasy.
    // do element
    private int clientID;
    private String clientName;
    private String clientAddress;
    private String clientCity;
    private String clientCountry;
    private String emailAddress;

    //Konstruktor klasy Client - inicjalizuje wartości pól obiektu.
    public Client (int clientID, String clientName, String clientAddress,String clientCity,
                   String clientCountry, String emailAddress)
    {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientCity = clientCity;
        this.clientCountry = clientCountry;
        this.emailAddress = emailAddress;
    }
    //Metoda o nazwie print(). Void oznacza że metoda nie zwraca żadnej wartości.
    // Metoda wykonuje operację polegającą na wyświetleniu danych obiektu w określonym formacie.
    //Modyfikator public określa że jest ona dostępna z poziomu dowolnej innej klasy.
    public void print()
    {
        System.out.println("Client ID: " + clientID);
        System.out.println("Client Name: " + clientName);
        System.out.println("Address: " + clientAddress);
        System.out.println("City: " + clientCity);
        System.out.println("Country: " + clientCountry);
        System.out.println("Email: " + emailAddress);
        System.out.println("--------------------------------------------");
    }
}

package Package1;

public class Client {
    int clientID;
    String clientName;

    public Client (int clientID, String clientName)
    {
        this.clientID = clientID;
        this.clientName = clientName;
    }
    public void print()
    {
        System.out.println("Client ID: " + clientID);
        System.out.println("Client name: " + clientName);
    }
}

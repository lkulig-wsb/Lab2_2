package Package1;
public class Klasa {

    //Pola klasy
    private int zmiennaInt;
    private double zmiennaDouble;
    private String zmiennaString;

    //Konstruktor
    public Klasa(int zmiennaInt, double zmiennaDouble, String zmiennaString)
    {
        this.zmiennaInt = zmiennaInt;
        this.zmiennaDouble = zmiennaDouble;
        this.zmiennaString =zmiennaString;
    }
    //Metody dostępowe.
    //Gettery
    public int getZmiennaInt()
    {
        return zmiennaInt;
    }
    public double getZmiennaDouble()
    {
        return zmiennaDouble;
    }
    public String getZmiennaString()
    {
        return  zmiennaString;
    }
    //Setters
    public void setZmiennaInt(int zmiennaInt)
    {
        this.zmiennaInt = zmiennaInt;
    }
    public void setZmiennaDouble(double zmiennaDouble)
    {
        this.zmiennaDouble = zmiennaDouble;
    }
    public void setZmiennaString(String zmiennaString)
    {
        this.zmiennaString = zmiennaString;
    }
    //Metoda print()
    public void print()
    {
        System.out.println(zmiennaInt);
        System.out.println(zmiennaDouble);
        System.out.println(zmiennaString);
    }
//Comment

}

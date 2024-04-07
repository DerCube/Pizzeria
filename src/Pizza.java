abstract public class Pizza {
    double z;   //radius
    double a;   //Höhe
    double preis;
    String belag;

    public double pizzaVolumen(){
        double ergebnis = 0.1;
        ergebnis = z*a;
        return ergebnis;
    }//end of pizzaVolumen

    public abstract void Backen();

}//end of all

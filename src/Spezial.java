public class Spezial extends Pizza{
    String extra;
    double extraPreis;

    public Spezial(String extra, double extraPreis){
        this.extra = extra;
        this.extraPreis = extraPreis;
    }


    public void Backen() {
        System.out.println("Back Back Speziell");
    }
}//end of all

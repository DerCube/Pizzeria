import javax.swing.*;
import java.util.ArrayList;

public class Pizzeria {
    Spezial spezial;
    Pizza pizza;
    public Pizzeria(Pizza pizza){
        this.pizza = pizza;
    }
    String name = "Pizzerio";
    /*public Pizzeria(String name){
        this.name = name;
    }//end of constructor  */

    public static void main(String[] args) {


        //objekt erstellung
        int KundenNr = (int)(Math.floor(Math.random()*10));

        //Methodeny aufruf

        for (int a = 0; a <KundenNr ; a++) {
            Kunde kd =new Kunde(a);
            kd.kundenNr = a;
            String spe=JOptionPane.showInputDialog("Wie viele Spiezelle Pitzzen wollen sie bestellen?");
            int Spezial=Integer.parseInt(spe);

            String nor=JOptionPane.showInputDialog("Wie viele Normale Pitzzen wollen sie bestellen?");
            int normal=Integer.parseInt(nor);

            bestellung(Integer.parseInt(spe), normal, kd);
        }
    }//end of main11

    public double rechnung(int anz){
        double ergebnis = 0.1;

        return ergebnis;
    }//end of rechnung444

    public static void bestellung(int normal, int spezial, Kunde kd){
        double AnzDerPitzzen = normal+spezial;
        //eingabe

        ArrayList<double[]> bestellung =new ArrayList<double[]>();

        for (int i = 0; i < spezial; i++) {

            String extraWahl = JOptionPane.showInputDialog("was wollen sie als Extra?");
            double extraPreis;
            switch (extraWahl) {
                case "Tomate":
                    extraPreis = 2.99;
                    System.out.println("das macht dann 2.99. ich Schreibe es auf Ihre Rechnung");

                    break;
                case "Zwiebeln":
                    extraPreis = 1.99;
                    System.out.println("das macht dann 1.99. ich Schreibe es auf Ihre Rechnung");
                    break;
                case "HS":
                    extraPreis = 0.99;
                    System.out.println("das macht dann 0.99. ich Schreibe es auf Ihre Rechnung");
                    break;
                case "extra Käse":
                    extraPreis = 3.99;
                    System.out.println("das macht dann 3.99. ich Schreibe es auf Ihre Rechnung");
                    break;
                default:
                    System.out.println("Tut mir leid du HS Sowas haben wir nicht, und jetzt Verpiss dich. Ahh aber Zahlen musst du noch. und du du bekommst deine Spezal Pizza Ohne Spezial");
                    extraPreis = 545;
            }//end of Switch Case
            Spezial spezial1 = new Spezial(extraWahl, extraPreis);
            spezial1.Backen();
            double[] Arry = new double[2];
            Arry[0] = kd.kundenNr;
            Arry[1] = (AnzDerPitzzen * 9.99) + extraPreis;
            bestellung.add(Arry);
        }//end of for
        for (int i = 0; i < bestellung.size(); i++) {
            System.out.println("der Kunde " + bestellung.get(i)[0] + " hat " + bestellung.get(i)[1] + " $$$ Sofort zu Zahlen");
        }

    }//end of Bestellung

    public static double Rechnung(int anz){
        double ergebnis = 0.1;

        return ergebnis;
    }//end of Rechnung
}//end of all
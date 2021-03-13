package P1923.CEITI.GherdelescuGrigore;

// Clasa Cursa cu ajutorul careia vom colecta date despre cursele aeroportului

import java.util.List;

public class Cursa {
    // initializam variabilele de tip private pentru securitate
    private int numarulCursei;
    private int numarulNavei;
    private String punctulDePlecare;
    private String punctulDestinatie;
    private TipulAvionului tipulAvionului;
    private Pilot pilot;
    private DateTime dateTime;
    private int bileteComercializate;

    public Cursa(int numarulCursei, int numarulNavei, String punctulDePlecare, String punctulDestinatie,
                 TipulAvionului tipulAvionului, Pilot pilot, DateTime dateTime, int bileteComercializate) {
        this.numarulCursei = numarulCursei;
        this.numarulNavei = numarulNavei;
        this.punctulDePlecare = punctulDePlecare;
        this.punctulDestinatie = punctulDestinatie;
        this.tipulAvionului = tipulAvionului;
        this.pilot = pilot;
        this.dateTime = dateTime;
        this.bileteComercializate = bileteComercializate;
    }

    // Cream getteri si setteri pentru introducerea si returnarea datelor

    public int getNumarulCursei() {
        return numarulCursei;
    }

    public int getNumarulNavei() {
        return numarulNavei;
    }

    public String getPunctulDePlecare() {
        return punctulDePlecare;
    }

    public String getPunctulDestinatie() {
        return punctulDestinatie;
    }

    public TipulAvionului getTipulAvionului() {
        return tipulAvionului;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public int getBileteComercializate() {
        return bileteComercializate;
    }

    public void setTipulAvionului(TipulAvionului tipulAvionului) {
        this.tipulAvionului = tipulAvionului;
    }

    public void setBileteComercializate(int bileteComercializate) {
        this.bileteComercializate = bileteComercializate;
    }

    // Stergerea setterilor fara sens


}

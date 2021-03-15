package P1923.CEITI.GherdelescuGrigore;

import java.util.Scanner;

public class Menu {
    Scanner cin = new Scanner(System.in);

    ManagerCursa m = new ManagerCursa();

    Pilot p1 = new Pilot("Ion" , "Branceanu");
    Pilot p2 = new Pilot("Grigore" , "Frumosu");

    DateTime d1 = new DateTime("22:05" , "Luni");
    DateTime d2 = new DateTime("13:05" , "Luni");

    Cursa c1 = new Cursa(1, 555, "Chisinau", "Moscova", TipulAvionului.Boeing, p1, d1, 300);
    Cursa c2 = new Cursa(2, 669, "Chisinau", "Argentina", TipulAvionului.TurboProp, p2 , d2, 666);

    Cursa[] listaCurse = {c1, c2};

    //        m.showInfo(listaCurse);
//        m.showInfoPoint(listaCurse, "Moscova");
//        m.showInfoWeek(listaCurse, "Luni");
//        m.showInfoMaxTickets(listaCurse);
//        System.out.println(m.showPlaneNumber(listaCurse, "Boeing"));
//        m.showInfoPilot(listaCurse, "Ion", "Branceanu");

    private int n;
    private boolean x = true;
    public void startMenu() {

        while(x) {
            showMenu();
            n = cin.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Introduceti numarul de bilete:");
                    int nrBilete = cin.nextInt();
                    System.out.print("Introduceti numarul cursei la care doriti sa schimbati biletele:");
                    int index = cin.nextInt();
                    m.setNewInfo(listaCurse, nrBilete, index);
                break;

                case 2:
                    m.showInfo(listaCurse);
                break;

                case 3:
                    System.out.print("Introduceti punctul de destinatie:");
                    String punct = cin.next();
                    m.showInfoPoint(listaCurse, punct);
                break;

                case 4:
                    System.out.print("Introduceti ziua saptamanii:");
                    String zi = cin.next();
                    m.showInfoWeek(listaCurse, zi);
                break;

                case 5:
                    m.showInfoMaxTickets(listaCurse);
                break;

                case 6:
                    System.out.print("Introduceti numele avionului:");
                    String avion = cin.next();
                    System.out.println(m.showPlaneNumber(listaCurse, avion));
                break;

                case 7:
                    System.out.print("Introduceti numele pilotului:");
                    String nume = cin.next();
                    System.out.print("Introduceti prenumele pilotului:");
                    String prenume = cin.next();
                    m.showInfoPilot(listaCurse, nume, prenume);
                break;

                case 0:
                    x = false;
                break;

                default: System.out.println("Try again...");
                break;

            }
        }
    }
    public void showMenu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Introduce noi date");
        System.out.println("2. Afisarea curselor");
        System.out.println("3. Afisarea dupa punctul destinatie");
        System.out.println("4. Afisarea pentru o zi anumita");
        System.out.println("5. Afisarea cursei cu numar maxim de bilete");
        System.out.println("6. Afisarea curselor in depenta de tipul avionului");
        System.out.println("7. Afisarea dupa numele/prenumele pilotului");
        System.out.println("0. EXIT");
        System.out.println("-----------------------------------------------------");
    }
}

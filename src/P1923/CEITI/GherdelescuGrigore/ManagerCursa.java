package P1923.CEITI.GherdelescuGrigore;

public class ManagerCursa {

    public void setNewInfo(Cursa[] cursa, int nrBilete, int i) {
        cursa[i-1].setBileteComercializate(nrBilete);
    }

    public void showInfo(Cursa[] cursa) {
        for(Cursa element:cursa) {
            System.out.println();
            System.out.println("Numarul Cursei: " + element.getNumarulCursei());
            System.out.println("Numarul Navei: " + element.getNumarulNavei());
            System.out.println("Tipul Avionului: " + element.getTipulAvionului().getTipulAvionului());
            System.out.println("Punctul de Plecare: " + element.getPunctulDePlecare());
            System.out.println("Punctul de Destinatie: " + element.getPunctulDestinatie());
            System.out.println("Ora Decolarii: " + element.getDateTime().getOraDecolarii());
            System.out.println("Numele Pilotului: " + element.getPilot().getNume());
            System.out.println("Prenumele Pilotului: " + element.getPilot().getPrenume());
            System.out.println("Ziua decolarii: " + element.getDateTime().getZiuaDecolarii());
            System.out.println("Bilete Comercializate: " + element.getBileteComercializate());
        }

    }

    public void showInfoPoint(Cursa[] cursa , String punct) {
        for(Cursa element: cursa) {
            if(element.getPunctulDestinatie().equals(punct)) {
                System.out.println();
                System.out.println("Spre " + punct + " va pleca: ");
                System.out.println("Numarul Cursei: " + element.getNumarulCursei());
                System.out.println("Numarul Navei: " + element.getNumarulNavei());
                System.out.println("Tipul Avionului: " + element.getTipulAvionului().getTipulAvionului());
                System.out.println("Punctul de Plecare: " + element.getPunctulDePlecare());
                System.out.println("Punctul de Destinatie: " + element.getPunctulDestinatie());
                System.out.println("Ora Decolarii: " + element.getDateTime().getOraDecolarii());
                System.out.println("Numele Pilotului: " + element.getPilot().getNume());
                System.out.println("Prenumele Pilotului: " + element.getPilot().getPrenume());
                System.out.println("Ziua decolarii: " + element.getDateTime().getZiuaDecolarii());
                System.out.println("Bilete Comercializate: " + element.getBileteComercializate());
                System.out.println();
            }
        }

    }

    public void showInfoWeek(Cursa[] cursa , String zi) {
        for(Cursa element: cursa) {
            if(element.getDateTime().getZiuaDecolarii().equals(zi)) {
                System.out.println();
                System.out.println("In ziua de " + zi + " va pleca: ");
                System.out.println("Numarul Cursei: " + element.getNumarulCursei());
                System.out.println("Numarul Navei: " + element.getNumarulNavei());
                System.out.println("Tipul Avionului: " + element.getTipulAvionului().getTipulAvionului());
                System.out.println("Punctul de Plecare: " + element.getPunctulDePlecare());
                System.out.println("Punctul de Destinatie: " + element.getPunctulDestinatie());
                System.out.println("Ora Decolarii: " + element.getDateTime().getOraDecolarii());
                System.out.println("Numele Pilotului: " + element.getPilot().getNume());
                System.out.println("Prenumele Pilotului: " + element.getPilot().getPrenume());
                System.out.println("Ziua decolarii: " + element.getDateTime().getZiuaDecolarii());
                System.out.println("Bilete Comercializate: " + element.getBileteComercializate());
                System.out.println();
            }
        }

    }

    public void showInfoMaxTickets(Cursa[] cursa) {
        int min = 0;
        int index = 1;

        for(Cursa element: cursa) {
            if(min < element.getBileteComercializate()) {
                min = element.getBileteComercializate();
                index = element.getNumarulCursei() - 1;
            }
        }
        System.out.println();
        System.out.println("Numarul maxim de tickete: ");
        System.out.println("Numarul Cursei: " + cursa[index].getNumarulCursei());
        System.out.println("Numarul Navei: " + cursa[index].getNumarulNavei());
        System.out.println("Tipul Avionului: " + cursa[index].getTipulAvionului().getTipulAvionului());
        System.out.println("Punctul de Plecare: " + cursa[index].getPunctulDePlecare());
        System.out.println("Punctul de Destinatie: " + cursa[index].getPunctulDestinatie());
        System.out.println("Ora Decolarii: " + cursa[index].getDateTime().getOraDecolarii());
        System.out.println("Numele Pilotului: " + cursa[index].getPilot().getNume());
        System.out.println("Prenumele Pilotului: " + cursa[index].getPilot().getPrenume());
        System.out.println("Ziua decolarii: " + cursa[index].getDateTime().getZiuaDecolarii());
        System.out.println("Bilete Comercializate: " + cursa[index].getBileteComercializate());
        System.out.println();
    }

    public int showPlaneNumber(Cursa[] cursa , String avion) {
        int counter=0;

        for(Cursa element: cursa) {
            if(element.getTipulAvionului().getTipulAvionului().equals(avion)) {
                counter++;
            }
        }
        return counter;
    }

    public void showInfoPilot(Cursa[] cursa, String firstName, String lastName) {
        for(Cursa element: cursa) {
            if(element.getPilot().getNume().equals(firstName) && element.getPilot().getPrenume().equals(lastName)) {
                System.out.println();
                System.out.println("Pilotul " + firstName + " " + lastName + " va pleca cu urmatoarele curse: ");
                System.out.println("Numarul Cursei: " + element.getNumarulCursei());
                System.out.println("Numarul Navei: " + element.getNumarulNavei());
                System.out.println("Tipul Avionului: " + element.getTipulAvionului().getTipulAvionului());
                System.out.println("Punctul de Plecare: " + element.getPunctulDePlecare());
                System.out.println("Punctul de Destinatie: " + element.getPunctulDestinatie());
                System.out.println("Ora Decolarii: " + element.getDateTime().getOraDecolarii());
                System.out.println("Numele Pilotului: " + element.getPilot().getNume());
                System.out.println("Prenumele Pilotului: " + element.getPilot().getPrenume());
                System.out.println("Ziua decolarii: " + element.getDateTime().getZiuaDecolarii());
                System.out.println("Bilete Comercializate: " + element.getBileteComercializate());
                System.out.println();
            }
        }
    }
}

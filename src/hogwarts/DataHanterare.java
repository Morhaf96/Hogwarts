/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @authors Gabriel Björk & Murhaf Jammal
 */
public class DataHanterare {

    private static InfDB databasen;

    public static InfDB dataHanterare() {

        if (databasen == null) {
            try {
                File dbFil = new File("HOGDB.FDB");
                String path = dbFil.getAbsolutePath();
                databasen = new InfDB(path);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Systemet kan inte nå databasen!");
                System.out.println("Databasfelet som har inträffat: " + e.getMessage());
            }
        }
        return databasen;
    }

    /**
     * Metoden ändrar elevhemsföreståndaren för en elevhem.
     *
     * @param elevhemsNamn
     * @param lararensFornamn
     * @param lararensEfternamn
     * @return
     */
    public boolean andraElevhemsForestandare(String elevhemsNamn, String lararensFornamn, String lararensEfternamn) {
        int lararId = getLararID(lararensFornamn, lararensEfternamn);
        boolean lyckats = false;
        if (lararId != 0) {
            try {
                databasen.update("update elevhem set forestandare='" + lararId + "' where elevhemsnamn='" + elevhemsNamn + "';");
                lyckats = true;
            } catch (InfException e) {
                System.out.println("andraElevhemsForestandare Felmeddelande: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("andraElevhemsForestandare Felmeddelande: " + e.getMessage());
            }
        }
        return lyckats;
    }

    /**
     * metoden kontrollerar om en lärare är föreståndare för ett elevhem,
     * returnerar då true
     *
     * @param lararId
     * @return
     */
    public boolean arForestandare(int lararId) {
        boolean stammer = false;
        String ehId = null;
        try {
            ehId = databasen.fetchSingle("select elevhem_id from elevhem where forestandare = '" + lararId + "';");
            if (ehId != null) {
                stammer = true;
            }
        } catch (InfException e) {
            System.out.println("arForestandare felmeddelande: " + e.getMessage());
        }
        return stammer;
    }

    /**
     * metoden returnerar id för elevhemmet som en elev tillhör.
     *
     * @param elevId
     * @return
     */
    public String getElevhemForElev(int elevId) {
        String elevhem = "";
        try {
            elevhem = databasen.fetchSingle("select elevhemsnamn from elevhem join sovsal on sovsal.elevhem = elevhem_id join elev on sovsal_id = sovsal where elev_id = '" + elevId + "';");
        } catch (InfException e) {
            System.out.println("getElevhemIdForElev felmeddelande: " + e.getMessage());
        }
        return elevhem;
    }

    /**
     * metoden kontrollerar om en lärare är registrerad på någon kurs,
     * returnerar i så fall true
     *
     * @param lararId
     * @return
     */
    public boolean larareHarKurs(int lararId) {
        boolean stammer = false;
        int kursId = 0;
        try {
            String fraga = databasen.fetchSingle("select kurs_id from kurs where kurslarare = '" + lararId + "';");
            if (fraga != null) {
                kursId = Integer.parseInt(fraga);
            }
        } catch (InfException e) {
            System.out.println("larareHarKurs felmeddelande: " + e.getMessage());
        }
        if (kursId != 0) {
            stammer = true;
        }
        return stammer;
    }

    /**
     * Metoden kontrollerar om en elev är prefekt, returnerar i så fall true
     *
     * @param elevId
     * @return
     */
    public boolean arPrefekt(int elevId) {
        boolean stammer = false;
        String ehId;
        try {
            ehId = databasen.fetchSingle("select elevhem_id from elevhem where prefekt = '" + elevId + "';");
            if (ehId != null) {
                stammer = true;
            }
        } catch (InfException e) {
            System.out.println("arPrefekt felmeddelande: " + e.getMessage());
        }
        return stammer;
    }

    /**
     * metoden lägger till elevhemmen i comboboxen.
     *
     * @param elevhemslista
     */
    public void laggTillElevhem(JComboBox elevhemslista) {
        ArrayList<String> elevhem = listaElevhem();
        int i = 0;
        while (i < elevhem.size()) {
            elevhemslista.addItem(elevhem.get(i));
            i++;
        }
    }

    /**
     * metoden hämtar en våning för en specifik elev beroende på deras
     * elevhemstillhörighet
     *
     * @param elevId
     * @param elevhemId
     * @return
     */
    public int getSovsalVaning(int elevId, int elevhemId) {
        String v = "";
        try {
            v = databasen.fetchSingle("select vaning from sovsal join elev on sovsal = sovsal_id where elev_id = '" + elevId + "' and elevhem = '" + elevhemId + "';");
        } catch (InfException e) {
            System.out.println("getSovsalVaning felmeddelande: " + e.getMessage());
        }
        return Integer.parseInt(v);
    }

    /**
     * Metoden lägger till kursnamnen från databasen i en combobox.
     *
     * @param kursnamnLista
     */
    public void laggTillKursnamn(JComboBox kursnamnLista) {
        ArrayList<String> kursnamnListan = listaKursnamn();
        int i = 0;
        while (i < kursnamnListan.size()) {
            kursnamnLista.addItem(kursnamnListan.get(i));
            i++;
        }
    }

    /**
     * Metoden lägger till betygsbeteckningen från databasen i en comobox.
     *
     * @param betygLista
     */
    public void laggTillBetygsBeteckning(JComboBox betygLista) {
        ArrayList<String> betygsBeteckning;
        betygsBeteckning = listaBetygsBeteckning();
        int i = 0;
        while (i < betygsBeteckning.size()) {
            betygLista.addItem(betygsBeteckning.get(i));
            i++;
        }
    }

    /**
     * Metoden ändrar vilken elev som är prefekt för ett angivet elevhem,
     * returnerar true vid lyckad databasändring.
     *
     * @param elevId
     * @param elevhem
     * @return boolean lyckadAndring
     */
    public boolean andraPrefekt(int elevId, String elevhem) {
        boolean lyckadAndring = false;
        try {
            databasen.update("update elevhem set prefekt = '" + elevId + "' where elevhemsnamn = '" + elevhem + "';");
            lyckadAndring = true;
        } catch (InfException e) {
            System.out.println("andraPrefekt felmeddelande: " + e.getMessage());
        }
        return lyckadAndring;
    }

    /**
     * Returnerar lärares förnamn från databasen.
     *
     * @return ArrayList fornamnLista
     */
    public ArrayList listaLarareFornamn() {
        ArrayList<String> fornamnLista = null;
        try {
            fornamnLista = databasen.fetchColumn("select fornamn from larare;");
        } catch (InfException e) {
            System.out.println("listaLarareFornamn felmeddelande: " + e.getMessage());
        }
        return fornamnLista;
    }

    /**
     * lägger till lärare i comboboxen.
     *
     * @param lararlista
     */
    public void laggTillLarare(JComboBox lararlista) {
        ArrayList<String> fornamn = listaLarareFornamn();
        ArrayList<String> efternamn = listaLarareEfternamn();
        int i = 0;
        while (i < fornamn.size()) {
            String f = fornamn.get(i);
            String e = efternamn.get(i);
            lararlista.addItem(f + " " + e);
            i++;
        }
    }

    /**
     * Returnerar lärares efternamn från databasen.
     *
     * @return ArrayList efternamnLista
     */
    public ArrayList listaLarareEfternamn() {
        ArrayList<String> efternamnLista = null;
        try {
            efternamnLista = databasen.fetchColumn("select efternamn from larare;");
        } catch (InfException e) {
            System.out.println("listaLarareEfternamn felmeddelande: " + e.getMessage());
        }
        return efternamnLista;
    }

    /**
     * Hämtar databas id för ett angivet ämne.
     *
     * @param amne
     * @return int amneId
     */
    public int getAmneId(String amne) {
        int amneId = 0;
        try {
            String id = databasen.fetchSingle("select amne_id from amne where amnesnamn = '" + amne + "';");
            amneId = Integer.parseInt(id);
        } catch (InfException e) {
            System.out.println("getAmneId felmeddelande: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ämnet hittades inte i databasen! \n Vänligen kontrollera angivet ämnesnamn");
        }
        return amneId;
    }

    /**
     * Metoden hämtar ett elevhems id-nummer från databasen.
     *
     * @param elevhem
     * @return String idnummer för elevhemmet
     */
    public int getElevhemId(JComboBox elevhem) {
        String elevhemId = "";
        String eh = elevhem.getSelectedItem().toString();
        try {
            elevhemId = databasen.fetchSingle("select elevhem_id from elevhem where elevhemsnamn = '" + eh + "';");
        } catch (InfException e) {
            System.out.println("getElevhemId felmeddelande: " + e.getMessage());
        }
        return Integer.parseInt(elevhemId);
    }

    /**
     * Metoden hämtar en sovsals id_nummer i databasen.
     *
     * @param elevhemId
     * @param vaning
     * @return String idnummer för sovsal
     */
    public int getSovsalId(int elevhemId, JComboBox vaning) {
        String v = vaning.getSelectedItem().toString();
        String sovsalId = "";
        try {
            sovsalId = databasen.fetchSingle("select sovsal_id from sovsal where elevhem = '" + elevhemId + "' and vaning = '" + v + "';");
        } catch (InfException e) {
            System.out.println("getSovsalId felmeddelande: " + e.getMessage());
        }
        return Integer.parseInt(sovsalId);
    }

    /**
     * Metoden registrerar en ny kurs i databasen, returnerar true vid lyckad
     * databasändring.
     *
     * @param kursnamn
     * @param amne
     * @param kursstart
     * @param kursslut
     * @param lararId
     * @return boolean kursRegistrerad
     */
    public boolean registreraNyKurs(String kursnamn, int amne, String kursstart, String kursslut, int lararId) {
        boolean kursRegistrerad = false;
        try {
            databasen.insert("insert into kurs(kurs_id, kursnamn, kursstart, kursslut, kurslarare, amnestillhorighet) "
                    + "values ('" + getNextKursId() + "', '" + kursnamn + "', '" + kursstart + "', '" + kursslut + "', '"
                    + lararId + "', '" + amne + "');");
            kursRegistrerad = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad registrering av kurs!");
            System.out.println("registreraNyKurs felmeddelande: " + e.getMessage());
        }
        return kursRegistrerad;
    }

    /**
     * Metoden tar bort en kurs från databasen, returnerar true vid lyckad
     * databasändring.
     *
     * @param kursId
     * @return boolean borttagen
     */
    public boolean taBortKurs(int kursId) {
        boolean borttagen = false;
        try {
            if (kursId != 0) {
                databasen.delete("delete from Registrerad_pa where kurs_id = '" + kursId + "';");
                databasen.delete("delete from har_betyg_i where kurs_id = '" + kursId + "';");
                databasen.delete("delete from kurs where kurs_id = '" + kursId + "';");
                borttagen = true;
            }
        } catch (InfException e) {
            System.out.println("TaBortKurs felmeddelande: " + e.getMessage());

        }
        return borttagen;
    }

    /**
     * metoden tar bort en lärare från databasen, returnerar true om vid lyckad
     * databasändring.
     *
     * @param lararId
     * @return boolean borttagen
     */
    public boolean taBortLarare(int lararId) {
        boolean borttagen = false;
        try {
            if (lararId != 0) {
                databasen.delete("delete from har_kompetens_i where larar_id = '" + lararId + "';");
                databasen.delete("delete from larare where larar_id = '" + lararId + "';");
                borttagen = true;
            }
        } catch (InfException e) {
            System.out.println("taBortLarare felmeddelande: " + e.getMessage());
        }
        return borttagen;
    }

    /**
     * Metoden returnerar nästa id-värde som är ledigt i kurs-tabellen.
     *
     * @return int id
     */
    public int getNextKursId() {
        String id = "";
        try {
            id = databasen.getAutoIncrement("Kurs", "kurs_id");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("getNextKursId felmeddelande: " + e.getMessage());
        }
        return Integer.parseInt(id);
    }

    /**
     * Returnerar ämnen från databasen.
     *
     * @return ArrayList amnesLista
     */
    public ArrayList listaAmne() {
        ArrayList<String> amneLista = null;
        try {
            amneLista = databasen.fetchColumn("select amnesnamn from amne;");
        } catch (InfException e) {
            System.out.println("listaAmne felmeddelande: " + e.getMessage());
        }
        return amneLista;
    }

    /**
     * metoden lägger till ämnen i comboboxen
     *
     * @param amneslista
     */
    public void laggTillAmne(JComboBox amneslista) {
        ArrayList<String> amne = listaAmne();
        int i = 0;
        while (i < amne.size()) {
            amneslista.addItem(amne.get(i));
            i++;
        }
    }

    /**
     * metoden returnerar ett visst elevhems elevers förnamn i en arraylist.
     *
     * @param elevhemsnamn
     * @return ArrayList String förnamn
     */
    public ArrayList ListaFornamnIEttElevhem(JComboBox elevhemsnamn) {
        ArrayList<String> fornamn = null;
        try {
            fornamn = databasen.fetchColumn("select fornamn from elev join sovsal on sovsal = sovsal_id join elevhem on elevhem = elevhem_id \n"
                    + "where elevhemsnamn = '" + elevhemsnamn.getSelectedItem().toString() + "'");
        } catch (InfException e) {
            System.out.println("ListaFornamnIEttElevhem felmeddelande: " + e.getMessage());
        }
        return fornamn;
    }

    /**
     * Metoden returnerar true vid lyckad uppdatering av lösenord i databasen.
     *
     * @param nyttpw
     * @param id
     * @return boolean nyttPwRegistrerat
     */
    public boolean uppdateraLosenord(JPasswordField nyttpw, int id) {
        boolean nyttPwRegistrerat = false;
        try {
            databasen.update("update larare set losenord = '" + nyttpw.getText() + "' where larar_id = " + id + ";");
            nyttPwRegistrerat = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckat lösenordsbyte!");
            System.out.println("uppdateraLosenord felmeddelande: " + e.getMessage());
        }
        return nyttPwRegistrerat;
    }

    /**
     * metoden returnerar ett visst elevhems elevers efternamn i en arraylist.
     *
     * @param elevhemsnamn
     * @return ArrayList String efternamn
     */
    public ArrayList ListaEfternamnIEttElevhem(JComboBox elevhemsnamn) {
        ArrayList<String> efternamn = null;
        try {
            efternamn = databasen.fetchColumn("select efternamn from elev join sovsal on sovsal = sovsal_id join elevhem on elevhem = elevhem_id where elevhemsnamn = '" + elevhemsnamn.getSelectedItem().toString() + "'");
        } catch (InfException e) {
            System.out.println("ListaEfternamnIEttElevhem felmeddelande: " + e.getMessage());
        }
        return efternamn;
    }

    /**
     * Metoden returnerar nästa id-värde som är ledigt i elev-tabellen.
     *
     * @return int id
     */
    public int getNextElevId() {
        String id = "";
        try {
            id = databasen.getAutoIncrement("Elev", "elev_id");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("getNextElevId felmeddelande: " + e.getMessage());
        }
        return Integer.parseInt(id);
    }

    /**
     * Metoden returnerar true vid lyckat tillägg i databasen.
     *
     * @param fornamn
     * @param efternamn
     * @param sovsalId
     * @return boolean elevRegistrerad
     */
    public boolean registreraNyElev(String fornamn, String efternamn, int sovsalId) {
        boolean elevRegistrerad = false;
        try {
            databasen.insert("insert into elev(elev_id, fornamn, efternamn, sovsal) "
                    + "values ('" + getNextElevId() + "', '" + fornamn + "', '" + efternamn + "', '" + sovsalId + "');");
            elevRegistrerad = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad registrering av elev!");
            System.out.println("registreraNyElev felmeddelande: " + e.getMessage());
        }
        return elevRegistrerad;
    }

    /**
     * metoden returnerar en arraylist med kurserna som en specifik lärare har
     * haft mellan två angivna datum.
     *
     * @param lararId
     * @param arStartdatum
     * @param manadStartdatum
     * @param dagStartdatum
     * @param arSlutdatum
     * @param manadSlutdatum
     * @param dagSlutdatum
     * @return ArrayList String kurser
     */
    public ArrayList ListaKurserHosLarare(int lararId, JTextField arStartdatum, JTextField manadStartdatum, JTextField dagStartdatum, JTextField arSlutdatum, JTextField manadSlutdatum, JTextField dagSlutdatum) {
        ArrayList<String> kurser = null;
        String startdatum = arStartdatum.getText() + "-" + manadStartdatum.getText() + "-" + dagStartdatum.getText();
        String slutdatum = arSlutdatum.getText() + "-" + manadSlutdatum.getText() + "-" + dagSlutdatum.getText();
        try {
            kurser = databasen.fetchColumn("select kursnamn from kurs join larare on larar_id = kurslarare "
                    + "where (kurslarare = '" + lararId + "' and Kursstart between '" + startdatum + "' and '" + slutdatum + "')"
                    + " or (kurslarare = '" + lararId + "' and Kursslut between '" + startdatum + "' and '" + slutdatum + "') "
                    + "or (kurslarare = '" + lararId + "' and Kursstart <= '" + startdatum + "' and kursslut >= '" + slutdatum + "');");

        } catch (InfException e) {
            System.out.println("ListaKurserHosLarare felmeddelande: " + e.getMessage());
        }
        return kurser;
    }

    /**
     * Metoden returnerar förnamnet på en elev utifrån sitt elevId
     *
     * @param elevID
     * @return
     */
    public String getElevFornamn(int elevID) {
        String fornamn = null;
        try {
            fornamn = databasen.fetchSingle("Select fornamn from elev where elev_id='" + elevID + "';");
        } catch (InfException e) {
            System.out.println("getElevFornamn felmeddelande: " + e.getMessage());
        }
        return fornamn;

    }

    /**
     * Metoden returnerar efternamnet på en elev utifrån sitt elevId
     *
     * @param elevID
     * @return
     */
    public String getElevEfternamn(int elevID) {
        String efternamn = null;
        try {
            efternamn = databasen.fetchSingle("Select efternamn from elev where elev_id='" + elevID + "';");
        } catch (InfException e) {
            System.out.println("getElevEfternamn felmeddelande: " + e.getMessage());
        }
        return efternamn;

    }

    /**
     * metoden returnerar elevhemmens namn i en arraylist, ordning efter högst
     * huspoäng.
     *
     * @return ArrayList String elevhemsNamn
     */
    public ArrayList listaElevhem() {
        ArrayList<String> elevhemsNamn = null;
        try {
            elevhemsNamn = databasen.fetchColumn("select elevhemsnamn from elevhem order by huspoang desc");
        } catch (InfException e) {
            System.out.println("listaElevhem felmeddelande: " + e.getMessage());
        }
        return elevhemsNamn;
    }

    /**
     * metoden returnerar kursnamn i en ArrayList.
     *
     * @return ArrayList String kursnamnLista
     */
    public ArrayList listaKursnamn() {
        ArrayList<String> kursnamnLista = null;
        try {
            kursnamnLista = databasen.fetchColumn("select kursnamn from kurs;");
        } catch (InfException e) {
            System.out.println("listaKursnamn felmeddelande: " + e.getMessage());
        }
        return kursnamnLista;
    }

    /**
     * metoden returnerar betygsbeteckning i en ArrayList.
     *
     * @return ArrayList String betygsbeteckning
     */
    public ArrayList listaBetygsBeteckning() {
        ArrayList<String> betygsLista = null;
        try {
            betygsLista = databasen.fetchColumn("select betygsbeteckning from betyg;");
        } catch (InfException e) {
            System.out.println("listaBetygsBeteckning felmeddelande: " + e.getMessage());
        }
        return betygsLista;
    }

    /**
     * metoden tar bort en elev ur databasen, returnerar true vid lyckad
     * databasändring.
     *
     * @param elevId
     * @return
     */
    public boolean taBortElev(int elevId) {
        boolean lyckades = false;
        try {
            if (elevId != 0) {
                databasen.delete("delete from registrerad_pa where elev_id = " + elevId);
                databasen.delete("delete from har_betyg_i where elev_id = " + elevId);
                databasen.delete("delete from elev where elev_id = " + elevId);
                lyckades = true;
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad avregistrering av elev!");
            System.out.println("taBortElev felmeddelande: " + e.getMessage());
        }

        return lyckades;
    }

    /**
     * metoden adderar värde på databasens nuvarande värde, returnerar true om
     * databasförändringen lyckades.
     *
     * @param elevhemsnamn
     * @param poang
     * @return
     */
    public boolean laggTillHuspoang(JComboBox elevhemsnamn, JTextField poang) {
        boolean lyckades = false;
        String elevhem = elevhemsnamn.getSelectedItem().toString();
        String p = poang.getText();
        try {
            databasen.update("update elevhem set huspoang = huspoang + " + p + " where elevhemsnamn = '" + elevhem + "';");
            lyckades = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad registrering av huspoäng!");
            System.out.println("laggTillHuspoang felmeddelande: " + e.getMessage());
        }
        return lyckades;
    }

    /**
     * metoden subtraherar värde på databasens nuvarande, returnerar true om
     * databasförändringen lyckades.
     *
     * @param elevhemsnamn
     * @param poang
     * @return
     */
    public boolean taBortHuspoang(JComboBox elevhemsnamn, JTextField poang) {
        boolean lyckades = false;
        String elevhem = elevhemsnamn.getSelectedItem().toString();
        String p = poang.getText();
        try {
            databasen.update("update elevhem set huspoang = huspoang - " + p + " where elevhemsnamn = '" + elevhem + "';");
            lyckades = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckat avdrag av huspoäng!");
            System.out.println("taBortHuspoang felmeddelande: " + e.getMessage());
        }
        return lyckades;
    }

    /**
     * metoden returnerar elevhemmens huspoang i en arraylist, från högsta till
     * lägst värdet.
     *
     * @return husPoang ArrayList String
     */
    public ArrayList listaHuspoang() {
        ArrayList<String> husPoang = null;
        try {
            husPoang = databasen.fetchColumn("select huspoang from elevhem order by huspoang desc");
        } catch (InfException e) {
            System.out.println("listaHuspoang felmeddelande: " + e.getMessage());
        }
        return husPoang;
    }

    /**
     * metoden ändrar kursbetyget i en angiven kurs till en angiven elev.
     *
     * @param elevId
     * @param kursId
     * @param betyg
     */
    public void andraKursbetygForEnElev(int elevId, int kursId, String betyg) {
        try {
            databasen.update("update har_betyg_i set kursbetyg = '" + betyg + "' where elev_id = " + elevId + " and kurs_id = " + kursId + ";");
            JOptionPane.showMessageDialog(null, "Ändringen lyckades!");
        } catch (InfException e) {
            System.out.println("andraKursbetygForEnElev Internet felmeddelande: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ändringen lyckades ej! Dubbelkolla den angivna informationen och försök igen.");

        }
    }

    /**
     * metoden uppdaterar alla information för en elev i databasen och
     * returnerar värdet "true" om ändringen lyckades, och värdet "false" om
     * inte.
     *
     * @param elevensNyaFornamn
     * @param elevId
     * @param elevensNyaEfternamn
     * @param elevensSovsal
     * @return
     */
    public boolean AndraElevInformation(String elevensNyaFornamn, String elevensNyaEfternamn, int elevensSovsal, int elevId) {
        boolean andrat = false;

        try {
            databasen.update("update elev set fornamn='" + elevensNyaFornamn + "', efternamn='" + elevensNyaEfternamn + "', sovsal=" + elevensSovsal + " where elev_id = '" + elevId + "';");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Informationsändringen lyckades ej! \n"
                    + "Vänligen dubbelkolla att elevnamnet stämmer och att det nya elev-Id inte hör till en befentlig elev.");
            System.out.println("AndraElevInformation felmeddelande: " + e.getMessage());
        }
        return andrat;
    }

    /**
     * metoden ändrar för- och efternamnet på en angiven lärare.
     *
     * @param lararensGamlaFornamn
     * @param lararensGamlaEfternamn
     * @param lararensNyaFornamn
     * @param lararensNyaEfternamn
     */
    public void AndraLararInformation(String lararensGamlaFornamn, String lararensGamlaEfternamn, String lararensNyaFornamn, String lararensNyaEfternamn) {

        try {
            databasen.update("update larare set fornamn='" + lararensNyaFornamn + "', efternamn='" + lararensNyaEfternamn + "' where fornamn='" + lararensGamlaFornamn + "' and efternamn='" + lararensGamlaEfternamn + "';");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Informationsändringen lyckades ej!");
            System.out.println("AndraLararInformation felmeddelande: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("AndraLararInformation Fel: " + e.getMessage());
        }

    }

    /**
     * metooden hämtar förnamnet hos en prefekt för ett angivet elevhem.
     *
     * @param elevhemsnamn
     * @return String prefektens förnamn
     */
    public String getPrefektFornamn(JComboBox elevhemsnamn) {
        String fornamn = null;
        String elevhem = elevhemsnamn.getSelectedItem().toString();
        try {
            fornamn = databasen.fetchSingle("select fornamn from elev join elevhem on elev_id = prefekt where elevhemsnamn = '" + elevhem + "'");
        } catch (InfException e) {
            System.out.println("getPrefektFornamn felmeddelande: " + e.getMessage());
        }
        return fornamn;
    }

    /**
     * metooden hämtar efternamnet hos en prefekt för ett angivet elevhem.
     *
     * @param elevhemsnamn
     * @return String prefektens efternamn
     */
    public String getPrefektEfternamn(JComboBox elevhemsnamn) {
        String efternamn = null;
        String elevhem = elevhemsnamn.getSelectedItem().toString();
        try {
            efternamn = databasen.fetchSingle("select efternamn from elev join elevhem on elev_id = prefekt where elevhemsnamn = '" + elevhem + "'");
        } catch (InfException e) {
            System.out.println("getPrefektEfternamn felmeddelande: " + e.getMessage());
        }
        return efternamn;
    }

    /**
     * metoden returnerar Lärarens-id från databasen som en int genom att skicka
     * in lärarens för- och efternamn.
     *
     * @param fornamn
     * @param efternamn
     * @return
     */
    public int getLararID(String fornamn, String efternamn) {
        int lararId = 0;
        try {
            String fraga = databasen.fetchSingle("Select Larar_ID from Larare where Fornamn='" + fornamn + "' and efternamn='" + efternamn + "';");
            lararId = Integer.parseInt(fraga);
        } catch (InfException e) {
            System.out.println("getLararID felmeddelande: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Läraren hittades ej! \n"
                    + "Vänligen skriv in korrekta för- och efternamn");
            System.out.println("getLararID felmeddelande: " + e.getMessage());
        }

        return lararId;
    }

    /**
     *
     * metoden returnerar elevId från databasen som en int genom att skicka in
     * elevens för- och efternamn.
     *
     * @param fornamn
     * @param efternamn
     * @return
     */
    public int getElevId(String fornamn, String efternamn) {
        int elevId = 0;
        try {

            String fraga = databasen.fetchSingle("Select elev_id from elev where Fornamn='" + fornamn + "' and efternamn='" + efternamn + "';");

            elevId = Integer.parseInt(fraga);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Personen hittades ej. Vänligen försök igen!");
            System.out.println("getElevId felmeddelande: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Eleven hittades ej! \n"
                    + "Vänligen skriv in korrekta för- och efternamn");
            System.out.println("getElevId felmeddelande: " + e.getMessage());
        }

        return elevId;
    }

    /**
     * metoden jämför angivna iloggningsuppgifter för en lärare med lärarens
     * inloggninguppifterna från databasen och returnerar true ifall de stämmer.
     *
     * @param lararId
     * @param losenord
     * @return
     */
    public static boolean kollaInloggning(int lararId, char[] losenord) {
        boolean stammer = false;
        String lararLosenord = "";
        try {
            lararLosenord = databasen.fetchSingle("Select losenord from larare where larar_id='" + lararId + "'");
        } catch (InfException e) {
            System.out.println("kollaInloggning felmeddelande: " + e);
        }
        if (Arrays.equals(losenord, lararLosenord.toCharArray())) {
            stammer = true;
        }
        return stammer;
    }

    /**
     * Metoden returnerar administratörstatus hos en bestämd användare som anges
     * i parametern. true om användaren har administratörstatus.
     *
     * @param lararID
     * @return arAdmin
     */
    public boolean hamtaAdministratorInfo(int lararID) {
        String administratorInfo = "";
        boolean arAdmin = false;
        try {
            administratorInfo = databasen.fetchSingle("select administrator from larare where larar_id = '" + lararID + "';");
        } catch (InfException e) {
            System.out.println("hamtaAdministratorInfo felmeddelande: " + e.getMessage());
        }
        if (administratorInfo.equals("T")) {
            arAdmin = true;
        }
        return arAdmin;
    }

    /**
     * metoden returnerar en ArrayList av strängar som består av kursnamnen som
     * en angiven elev läser.
     *
     * @param elevFornamn
     * @param elevEfternamn
     * @return
     */
    public ArrayList<String> listaKurserForEnElev(String elevFornamn, String elevEfternamn) {
        ArrayList<String> kursNamn = null;
        try {
            kursNamn = databasen.fetchColumn("select kursnamn from kurs join registrerad_pa on registrerad_pa.kurs_id = kurs.kurs_id "
                    + "join elev on registrerad_pa.elev_id = elev.elev_id where fornamn = '" + elevFornamn + "' and efternamn = '" + elevEfternamn + "';");

        } catch (InfException e) {
            System.out.println("listaKurserForEnElev Fel med hämtning från databasen" + e.getMessage());
        }
        return kursNamn;
    }

    /**
     * Metoden returnerar en ArrayList av strängar som består av kursnamnen på
     * alla kurser som en elev har betyg i.
     *
     * @param elevId
     * @return
     */
    public ArrayList<String> visaKursbetygKursnamn(int elevId) {
        ArrayList<String> kursbetygKursnamn = null;
        try {
            kursbetygKursnamn = databasen.fetchColumn("select kursnamn from betyg join har_betyg_i on betygsbeteckning = kursbetyg join elev on har_betyg_i.elev_id = elev.elev_id join kurs on har_betyg_i.kurs_id = kurs.kurs_id where kursbetyg is not null and elev.ELEV_Id='" + elevId + "';");
        } catch (InfException e) {
            System.out.println("visaKursbetygKursnamn Fel med hämtning från databasen" + e.getMessage());
        }
        return kursbetygKursnamn;
    }

    /**
     * metoden returnerar kursId från databasen som en int genom att skicka in
     * kursens namn.
     *
     * @param kursnamn
     * @return
     */
    public int getKursId(String kursnamn) {
        int kursId = 0;

        try {
            String svar = databasen.fetchSingle("SELECT kurs_id FROM KURS where KURSNAMN='" + kursnamn + "';");
            kursId = Integer.parseInt(svar);
        } catch (InfException e) {
            System.out.println("getKursId Internt felmeddelande:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Vänligen ange korrekt kursnamn");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kursen hittades ej! \n"
                    + "Vänligen skriv in korrekt kursnamn!");
            System.out.println("getKursId felmeddelande: " + e.getMessage());
        }
        return kursId;
    }

    /**
     * metoden lägger till ett nytt betyg på en kurs för en angiven elev.
     *
     * @param kursNamn
     * @param betyg
     * @param elevensFornamn
     * @param elevensEfternamn
     * @return boolean andrad
     */
    public boolean registreraNyttBetygForEnElev(String kursNamn, String betyg, String elevensFornamn, String elevensEfternamn) {
        int elevId = getElevId(elevensFornamn, elevensEfternamn);
        int kursId = getKursId(kursNamn);
        boolean andrad = false;
        if (elevId != 0) {
            try {

                databasen.insert("insert into har_betyg_i values(" + elevId + "," + kursId + ",'" + betyg + "');");
                JOptionPane.showMessageDialog(null, "Registrering lyckades!");
                andrad = true;
            } catch (InfException e) {
                System.out.println("registreraNyttBetygForEnElev Internt felmeddelande:" + e.getMessage());
                JOptionPane.showMessageDialog(null, "Eleven har redan betyg i den angivna kursen!");

            }
        } else {
            System.out.println("registreraNyttBetygForEnElev Fel med att hämta elevId: elevId = 0");
        }
        return andrad;
    }

    /**
     * Metoden returnerar en ArrayList av strängar som består av
     * betygbeskrivningarna på kurser som en angiven elev har betyg i.
     *
     * @param elevId
     * @return
     */
    public ArrayList<String> visaBetygbeskrivning(int elevId) {
        ArrayList<String> kursbetygBeskrivning = null;
        try {
            kursbetygBeskrivning = databasen.fetchColumn("select betygsbeskrivning from betyg join har_betyg_i on betygsbeteckning = kursbetyg join elev on har_betyg_i.elev_id = elev.elev_id join kurs on har_betyg_i.kurs_id = kurs.kurs_id where elev.ELEV_ID='" + elevId + "';");

        } catch (InfException e) {
            System.out.println("visaBetygbeskrivning Fel med hämtning från databasen" + e.getMessage());
        }
        return kursbetygBeskrivning;
    }

    /**
     * Metoden registrerar en ny lärare i databasen, returnerar true vid lyckad
     * databasändring.
     *
     * @param fornamn
     * @param efternamn
     * @param losenord
     * @param admin
     * @return boolean larareRegistrerad
     */
    public boolean registreraNyLarare(String fornamn, String efternamn, String losenord, String admin) {
        boolean larareRegistrerad = false;
        try {
            databasen.insert("insert into larare(larar_id, fornamn, efternamn, losenord, administrator) "
                    + "values ('" + getNextLararId() + "', '" + fornamn + "', '" + efternamn + "', '" + losenord + "', '" + admin + "');");
            larareRegistrerad = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad registrering av lärare!");
            System.out.println("registreraNyLarare felmeddelande: " + e.getMessage());
        }
        return larareRegistrerad;
    }

    /**
     * Metoden returnerar nästa id-värde som är ledigt i lärare-tabellen.
     *
     * @return int id
     */
    public int getNextLararId() {
        String id = "";
        try {
            id = databasen.getAutoIncrement("Larare", "larar_id");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("getNextLararId felmeddelande: " + e.getMessage());
        }
        return Integer.parseInt(id);
    }

    /**
     * metoden ger en lärare administratörstatus, returnerar true vid lyckad
     * databasändring.
     *
     * @param lararId
     * @return boolean lyckad
     */
    public boolean geAdminStatus(int lararId) {
        boolean lyckad = false;
        try {
            databasen.update("update larare set administrator = 'T' where larar_id = " + lararId);
            lyckad = true;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel! \n Läraren fanns inte i databasen");
            System.out.println("geAdminStatus felmeddelande: " + e.getMessage());
        }
        return lyckad;
    }

    /**
     * Metoden ändrar kursnamnet, startdatumet, slutdatumet, kursenslärare, och
     * kursens ämnestillhörighet på en angiven kurs.
     *
     * @param kursId
     * @param nyttKursnamn
     * @param kursStartdatum
     * @param kursSlutdatum
     * @param lararId
     * @param amnesId
     */
    public void andraKursInfo(int kursId, String nyttKursnamn, String kursStartdatum, String kursSlutdatum, int lararId, int amnesId) {
        try {
            databasen.update("update kurs set kursnamn='" + nyttKursnamn + "', kursstart='" + kursStartdatum + "', kursslut='" + kursSlutdatum + "', kurslarare='" + lararId + "', amnestillhorighet='" + amnesId + "' where kurs_id='" + kursId + "';");
        } catch (InfException e) {
            System.out.println("andraKursInfo felmeddelande: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("andraKursInfo felmeddelande: " + e.getMessage());
        }
    }

    /**
     * Metoden kollar om en elev har ett registrerat betyg på en angiven kurs
     * och returnerar true ifall det stämmer, och false annars.
     *
     * @param elevid
     * @param kursId
     * @return harBetyg
     */
    public boolean elevHarBetyg(int elevid, int kursId) {
        boolean harBetyg = false;
        try {
            String svar = databasen.fetchSingle("Select kursbetyg from har_betyg_i where elev_id='" + elevid + "' and kurs_id='" + kursId + "';");
            if (svar != null) {
                harBetyg = true;

            }
        } catch (InfException e) {
            System.out.println("elevHarBetyg felmeddelande: " + e.getMessage());
        }
        return harBetyg;
    }

    /**
     * Metoden kollar antalet elvhemspoängen som ett elevhem har och returnerar
     * det.
     *
     * @param elevhemsNamn
     * @return elevhemsPoang
     */
    public int kollaHuspoang(String elevhemsNamn) {
        int elevhemsPoang = 0;
        try {
            String fraga = databasen.fetchSingle("Select huspoang from elevhem where elevhemsnamn='" + elevhemsNamn + "';");
            elevhemsPoang = Integer.parseInt(fraga);
        } catch (InfException e) {
            System.out.println("kollaHuspoang  misslyckades! " + e.getMessage());
        }
        return elevhemsPoang;
    }

    /**
     * Metoden kolalr vad ett elvhem har för husåpäng i samband med ett
     * poängavdrag och returnerar true ifall de befentliga poäng räcker för
     * processen.
     *
     * @param elevHemsPoang
     * @param onskadPoang
     * @return racker
     */
    public boolean huspoangRacker(int elevHemsPoang, int onskadPoang) {
        boolean racker = false;

        if (elevHemsPoang >= onskadPoang) {
            racker = true;
        } else {
            JOptionPane.showMessageDialog(null, "Elevhemmet har inte tillräckligt med poäng för att ta bort det angivna antalet!");
        }
        return racker;
    }

    /**
     * Metoden gör första bokstaven till stor i namnet som matas in.
     *
     * @param namn
     * @return
     */
    public String namnFormat(String namn) {
        String nyttNamn = namn.substring(0, 1).toUpperCase() + namn.substring(1, namn.length()).toLowerCase();
        return nyttNamn;
    }

    /**
     * Metoden gör första bokstaven till stor i namnet som matas in. F;rutom
     * ifall namnet börjar med "mc" så blir första och tredje bokstäver till
     * stora.
     *
     * @param namn
     * @return
     */
    public String efternamnFormat(String namn) {
        String nyttNamn;
        if (namn.toLowerCase().startsWith("mc")) {
            nyttNamn = namn.substring(0, 1).toUpperCase() + namn.substring(1, 2).toLowerCase() + namn.substring(2, 3).toUpperCase() + namn.substring(3, namn.length());
        } else {
            nyttNamn = namn.substring(0, 1).toUpperCase() + namn.substring(1, namn.length()).toLowerCase();
        }
        return nyttNamn;
    }

    /**
     * metoden returnerar en arraylist med alla kurser i databasen;
     *
     * @return
     */
    public ArrayList listaKurs() {
        ArrayList<String> kurser = null;
        try {
            kurser = databasen.fetchColumn("select kursnamn from kurs;");
        } catch (InfException e) {
            System.out.println("listaKurs felmeddelande " + e.getMessage());
        }
        return kurser;
    }

    /**
     * metoden jämför ett kursnamn mot alla existerande kursnamn i databasen. om
     * namnet är unikt returneras true.
     *
     * @param nyKurs
     * @return
     */
    public boolean arUnikKurs(String nyKurs) {
        boolean arUnik = true;
        ArrayList<String> kurser = listaKurs();
        int i = 0;
        while (i < kurser.size()) {
            if (kurser.get(i).equalsIgnoreCase(nyKurs)) {
                arUnik = false;
            }
            i++;
        }
        return arUnik;
    }

}

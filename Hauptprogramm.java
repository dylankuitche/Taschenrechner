package Taschenrechner;

// Startpunkt der Anwendung
public class Hauptprogramm {

    public static void main(String[] args) {
        // GUI starten
        javax.swing.SwingUtilities.invokeLater(() -> {
            new RechnerFenster().setVisible(true);
        });
    }
}

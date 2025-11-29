package Taschenrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// Dieses Fenster stellt die grafische Oberfläche der Taschenrechner-App dar
public class RechnerFenster extends JFrame {

    private JTextField eingabeZahl1;
    private JTextField eingabeZahl2;
    private JLabel ausgabeErgebnis;
    private Rechner rechner = new Rechner();  // Logik-Objekt

    public RechnerFenster() {

        setTitle("Taschenrechner");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Grundlayout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Eingabefelder
        add(new JLabel("Erste Zahl:"));
        eingabeZahl1 = new JTextField();
        add(eingabeZahl1);

        add(new JLabel("Zweite Zahl:"));
        eingabeZahl2 = new JTextField();
        add(eingabeZahl2);

        // Buttons für Grundrechenarten
        JButton btnAdd = new JButton("Addieren (+)");
        JButton btnSub = new JButton("Subtrahieren (-)");
        JButton btnMul = new JButton("Multiplizieren (*)");
        JButton btnDiv = new JButton("Dividieren (/)");

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        // Ergebnisanzeige
        add(new JLabel("Ergebnis:"));
        ausgabeErgebnis = new JLabel("");
        add(ausgabeErgebnis);

        // Button-Aktionen
        btnAdd.addActionListener(e -> berechne("add"));
        btnSub.addActionListener(e -> berechne("sub"));
        btnMul.addActionListener(e -> berechne("mul"));
        btnDiv.addActionListener(e -> berechne("div"));
    }

    // Führt die mathematische Operation aus
    private void berechne(String art) {
        try {
            double zahl1 = Double.parseDouble(eingabeZahl1.getText());
            double zahl2 = Double.parseDouble(eingabeZahl2.getText());
            double ergebnis;

            switch (art) {
                case "add":
                    ergebnis = rechner.addieren(zahl1, zahl2);
                    break;
                case "sub":
                    ergebnis = rechner.subtrahieren(zahl1, zahl2);
                    break;
                case "mul":
                    ergebnis = rechner.multiplizieren(zahl1, zahl2);
                    break;
                case "div":
                    ergebnis = rechner.dividieren(zahl1, zahl2);
                    break;
                default:
                    ergebnis = 0;
            }

            ausgabeErgebnis.setText(String.valueOf(ergebnis));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Bitte gültige Zahlen eingeben!",
                    "Fehler",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Fehler",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

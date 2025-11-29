# 🧮 **Taschenrechner – Java GUI Anwendung**

```md
# 🧮 Taschenrechner – Java GUI Anwendung

Eine vollständig entwickelte Java-Anwendung mit grafischer Benutzeroberfläche (GUI), die die vier Grundrechenarten ausführt: **Addition**, **Subtraktion**, **Multiplikation** und **Division**.  
Die App wurde mit **Java Swing** erstellt, ist leicht verständlich, modular aufgebaut und für jedes IDE geeignet (Eclipse, IntelliJ, NetBeans).

---

## 🚀 Funktionen

- ✔ Benutzerfreundliche grafische Oberfläche  
- ✔ Eingabe von zwei beliebigen Zahlen  
- ✔ Unterstützung aller vier Grundrechenarten  
- ✔ Automatische Fehlererkennung  
  - Ungültige Eingaben  
  - Division durch Null  
- ✔ Klare Trennung zwischen GUI und Berechnungslogik  
- ✔ Vollständig objektorientiert umgesetzt  

---

## 🛠 Projektstruktur

Das Projekt ist in **mehrere Klassen** aufgeteilt, um Übersichtlichkeit und Wartbarkeit zu sichern:

---

## 📘 Technologien

- **Java 17+**  
- **Swing & AWT** für die grafische Oberfläche  
- **OOP** (Objektorientierte Programmierung)  
- Klare Trennung von **Logik** und **Darstellung**

---

## ▶️ Anwendung starten

1. Projekt herunterladen oder klonen:
   ```bash
   git clone https://github.com/dylankuitche/Taschenrechner.git
````

2. In einem Java-IDE öffnen (z. B. Eclipse oder IntelliJ)
3. Sicherstellen, dass ein **JDK** (kein JRE!) verwendet wird
4. Datei `Hauptprogramm.java` ausführen

Die grafische Oberfläche öffnet sich automatisch.

---

### 🧠 Aufbau der Logik der Klasse **Rechner**

Enthält die vier mathematischen Methoden:

* `addieren(a, b)`
* `subtrahieren(a, b)`
* `multiplizieren(a, b)`
* `dividieren(a, b)` *(mit Nullprüfung)*

### Klasse **RechnerFenster**

* Erstellt das Fenster
* Verwaltet Eingaben, Buttons und Ausgaben
* Ruft die Methoden der Logikklasse auf

### Klasse **Hauptprogramm**

* Startpunkt der App
* Initialisiert und zeigt das Fenster

---

## 🎯 Lernziele des Projekts

Dieses Projekt ist ideal, um:

* Graphische Oberflächen in Java zu verstehen
* Ereignisbehandlung (ActionListener) zu üben
* OOP-Prinzipien praktisch anzuwenden
* GUI-Komponenten sinnvoll zu strukturieren
* Professionelle Projektstruktur für Bewerbungen zu zeigen

---

## 📄 Lizenz

Dieses Projekt darf frei genutzt, verändert und für Bewerbungen oder Lernzwecke eingesetzt werden.


---

## ⭐ Unterstützung

Wenn dir dieses Projekt gefällt, gib dem Repository gerne einen **⭐ Stern**!

```

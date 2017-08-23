# CMD-Rechner

Einen PrimitvenRechner mit Java & Eclipse erstellen.

# Anleitung Java & Kompatibilität

Damit man die .java vernünftig ausführen kann, sollte die neuste Java SE Version installiert sein.
Im folgenden Link finden Sie die neueste Version: http://www.oracle.com/technetwork/java/javase/downloads/index.html

Daraufhin müssen Sie sichergehen, dass Windows "Java compiler(javac)" und "interpreter(java)" erkennt.

Dazu gehen Sie auf Start oder drücken die Windows-Taste > Computer > In der Menuleiste auf "Systemeigenschaften" > Erweiterte Systemeigenschaften > Umgebungsvariablen > Systemvariablen > PATH.

Die Systemvariable "PATH" bearbeiten Sie und fügen "C:\Program Files\Java\...\bin" an vorderster Stelle ein.

Gehen Sie sicher, dass Sie die neueste Version auswählen.
Falls Sie keine Systemvariable mit dem Namen "PATH" besitzen, erstellen Sie diese.

Um die cmd.exe zu starten: Windows-Taste + R drücken und im Suchfeld "cmd" eingeben, dann auf "OK" drücken.

# Anleitung cmd.exe Konsole

Anschließen braucht die Konsole, den genauen Standort der .java Datei.
Dazu verwenden Sie den Befehl: "cd" "Den Ordnerpfad, wo sich die .java Datei aufhält", um das Verzeichnis zu wechseln.

Beispiel: cd C:\Users\itamtpro\Desktop\Programmieren\Projekt\Java
Den Ordnerpfad mit Rechtsklick > Einfügen, einfügen.

Danach können Sie den Befehl: "dir" verwenden.
Dieser Befehl zeigt Ihnen alle Dateien innerhalb des aktuellen Verzeichnisses an.

Um die .java Datei nun zu verwenden, müssen Sie den Befehl: "javac Rechner.java" eingeben.
Dieser Befehl komprimiert die .java Datei und erstellt eine .class Datei.
Ohne das komprimieren, ensteht ein Fehler, da die Hauptklasse nicht gefunden wurde.

Daraufhin verwenden Sie den Befehl: "java Rechner", um die .java Datei zu öffnen.

Nun können Sie die beschränkten Funktionen des Rechners verwenden.

# Funktionen

1 Zahl eingeben: Dort geben Sie eine beliebige Zahl ein.

Operator: Dort geben Sie einen beliebigen Operator ein.
Der Rechner unterstüzt nur + , -, * ,/ .

2 Zahl eingeben: Dort geben Sie eine beliebige Zahl ein.

Das Objekt erzeugt: Ihr Ergebnis.

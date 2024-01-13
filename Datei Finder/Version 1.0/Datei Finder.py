import os
print("| Datei - Finder | Copyright 2023 | Owner: Louis |")
filename = input("\n\nGeben Sie den Dateinamen ein: ")

# Iteriere über alle Verzeichnisse auf dem Computer
for root, dirs, files in os.walk("C:\\"):
    if filename in files:
        # Wenn die Datei gefunden wurde, drucke den Pfad aus und öffne den Ordner im Explorer
        filepath = os.path.join(root, filename)

        print("\n\nDatei gefunden:", filepath)
        os.startfile(os.path.dirname(filepath))
        break
else:

    print("\n\nDatei nicht gefunden.")
    
# Warte auf Benutzereingabe, bevor das Programm beendet wird
input("Drücken Sie die Eingabetaste, um das Programm zu beenden...")

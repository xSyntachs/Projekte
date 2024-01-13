#!/bin/bash

# Überprüfe, ob ein Schlüssel als Kommandozeilenargument übergeben wurde
if [ $# -eq 1 ]; then
    # Setze den Schlüssel auf das erste Kommandozeilenargument
    key="$1"
else
    # Lese den Schlüssel von der Standardeingabe
    read -p "Geben Sie einen neuen key ein: " key
fi

# Füge den Schlüssel zur Datei keys.txt hinzu
echo "$key:*" >> keys.txt

# Zeige den Schlüssel an
echo "Key: $key"
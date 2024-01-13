#!/bin/bash

# �berpr�fe, ob ein Schl�ssel als Kommandozeilenargument �bergeben wurde
if [ $# -eq 1 ]; then
    # Setze den Schl�ssel auf das erste Kommandozeilenargument
    key="$1"
else
    # Lese den Schl�ssel von der Standardeingabe
    read -p "Geben Sie einen neuen key ein: " key
fi

# F�ge den Schl�ssel zur Datei keys.txt hinzu
echo "$key:*" >> keys.txt

# Zeige den Schl�ssel an
echo "Key: $key"
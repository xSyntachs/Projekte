#!/bin/bash

# Generiere einen neuen Schl�ssel
key=$(head /dev/urandom | tr -dc A-Za-z0-9 | head -c 16)

# F�ge den Schl�ssel zur Datei keys.txt hinzu
echo "$key:*" >> keys.txt

# Zeige den Schl�ssel an
echo "Neuer Schl�ssel: $key"
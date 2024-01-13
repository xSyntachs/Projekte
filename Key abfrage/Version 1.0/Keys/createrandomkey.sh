#!/bin/bash

# Generiere einen neuen Schlüssel
key=$(head /dev/urandom | tr -dc A-Za-z0-9 | head -c 16)

# Füge den Schlüssel zur Datei keys.txt hinzu
echo "$key:*" >> keys.txt

# Zeige den Schlüssel an
echo "Neuer Schlüssel: $key"
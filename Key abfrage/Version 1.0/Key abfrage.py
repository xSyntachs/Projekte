import os
import requests
import uuid

def get_device_id():
    # Definiere den Pfad zur Datei, in der die Geräte-ID gespeichert wird
    appdata_dir = os.getenv('APPDATA')
    device_id_file = os.path.join(appdata_dir, 'my_program', 'device_id.txt')
    print()

    # Versuche, die Geräte-ID aus der Datei zu lesen
    try:
        with open(device_id_file, 'r') as f:
            device_id = f.read().strip()

    except FileNotFoundError:
        # Wenn die Datei nicht existiert, generiere eine neue Geräte-ID
        device_id = str(uuid.uuid4())

        # Erstelle das Verzeichnis, falls es noch nicht existiert
        os.makedirs(os.path.dirname(device_id_file), exist_ok=True)

        # Speichere die Geräte-ID in der Datei
        with open(device_id_file, 'w') as f:
            f.write(device_id)

    return device_id

# Lese die IP-Adresse aus der Datei "ip.txt" im selben Verzeichnis
with open('ip.txt', 'r') as f:
    ip_address = f.read().strip()

while True:
    os.system('cls')
    user_key = ""
    user_key = input("Bitte Key eingeben: ")
    device_id = get_device_id()

    # Senden Sie eine POST-Anfrage an die PHP-Seite auf dem Server
    response = requests.post(f"http://{ip_address}/check_key.php", data={'key': user_key, 'device_id': device_id})

    if response.text == "Zugriff erlaubt":
        os.system('cls')
        print("Zugriff erlaubt")
        input()
    elif response.text == "Zugriff verweigert":
        os.system('cls')
        print("Zugriff verweigert")
        input()
    elif response.text == "Fehlende Parameter":
        os.system('cls')
        print("Fehlende Parameter")
        input()
    elif response.text == "Ungültige Anfragemethode":
        os.system('cls')
        print("Ungültige Anfragemethode")
        input()    
    else:
        os.system('cls')
        print("Else ausgabe")
        input()
            

<?php

// Setze den Pfad zur Datei keys.txt
$keys_file = '/var/www/Keys/keys.txt';

// Setze den Pfad zur Datei used_keys.txt
$used_keys_file = '/var/www/Keys/used_keys.txt';

// Lese die Datei keys.txt und konvertiere sie in ein Array
$keys = file($keys_file, FILE_IGNORE_NEW_LINES);

// �berpr�fe, ob die Anfrage eine POST-Anfrage ist
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // �berpr�fe, ob die erforderlichen Parameter �bergeben wurden
    if (isset($_POST['key']) && isset($_POST['device_id'])) {
        $key = $_POST['key'];
        $device_id = $_POST['device_id'];
        // �berpr�fe, ob der Schl�ssel g�ltig ist
        if (in_array("$key:$device_id", $keys) || in_array("$key:*", $keys)) {
            // Entferne den Schl�ssel aus der Liste der g�ltigen Schl�ssel
            if (in_array("$key:*", $keys)) {
                $keys = array_diff($keys, ["$key:*"]);
                // F�ge den Schl�ssel erneut mit der Ger�te-ID hinzu
                $keys[] = "$key:$device_id";
            }
            // Entferne alle leeren Elemente aus dem Array
            $keys = array_filter($keys);
            // Aktualisiere die Datei keys.txt
            file_put_contents($keys_file, implode("\n", $keys) . "\n");
            // F�ge den Schl�ssel zur Datei used_keys.txt hinzu
            file_put_contents($used_keys_file, "$key:$device_id\n", FILE_APPEND);
            // Sende eine Erfolgsmeldung zur�ck
            echo "Zugriff erlaubt";
        } else {
            // Sende eine Fehlermeldung zur�ck
            echo "Zugriff verweigert";
        }
    } else {
        // Sende eine Fehlermeldung zur�ck
        echo "Fehlende Parameter";
    }
} else {
    // Sende eine Fehlermeldung zur�ck
    echo "Ungültige Anfragemethode";
}

?>
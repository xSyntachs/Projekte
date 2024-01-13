import os
import shutil

# Setze den Pfad zum Download-Ordner
download_folder = os.path.expanduser("~/Downloads")

# Erstelle eine Liste von Dateiendungen
file_types = {
    'Images': ['.jpg', '.jpeg', '.png', '.gif', '.bmp'],
    'Audios': ['.mp3', '.wav', '.ogg', '.aac', '.flac'],
    'Videos': ['.mp4', '.mov', '.avi', '.mkv', '.wmv'],
    'PDFs': ['.pdf'],
    'Links': ['.url', '.lnk'],
    'JARs': ['.jar'],
    'ZIPs': ['.zip'],
    'RARs': ['.rar'],
    'Texts': ['.txt'],
    'Executables': ['.exe'],
    'Folders': [],
    'Others': []
}

# Gehe durch alle Dateien im Download-Ordner
for file_name in os.listdir(download_folder):
    file_path = os.path.join(download_folder, file_name)
    if os.path.isdir(file_path):
        file_types['Folders'].append(file_name)
    else:
        extension = os.path.splitext(file_name)[1].lower()
        moved = False
        for category, extensions in file_types.items():
            if extension in extensions:
                category_path = os.path.join(download_folder, category)
                if not os.path.exists(category_path):
                    os.mkdir(category_path)
                shutil.move(file_path, category_path)
                moved = True
                break
        if not moved:
            file_types['Others'].append(file_name)

# Erstelle einen Ordner für alle anderen Dateien
other_path = os.path.join(download_folder, 'Others')
if not os.path.exists(other_path):
    os.mkdir(other_path)

# Verschiebe alle anderen Dateien in den Ordner 'Others'
for other_file in file_types['Others']:
    other_file_path = os.path.join(download_folder, other_file)
    shutil.move(other_file_path, other_path)

# Gib eine Zusammenfassung aus
for category, items in file_types.items():
    if items:
        print(f"{category}: {len(items)}")
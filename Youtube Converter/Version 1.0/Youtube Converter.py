import os
import keyboard
import pyautogui
import pyperclip
import re
import subprocess
import time
from plyer import notification
from concurrent.futures import ThreadPoolExecutor

# Konstanten
HOTKEY = 'ctrl+alt+d'
DOWNLOAD_FOLDER = os.path.join(os.path.expanduser('~'), 'Downloads')
FORMAT_FILE_PATH = os.path.join(os.getenv('APPDATA'), 'format.txt')

def show_notification(title, message):
    try:
        notification.notify(
            title=title,
            message=message,
            app_icon=None,
            timeout=10,
        )
    except Exception as e:
        print(f"Benachrichtigungsfehler: {str(e)}")

def is_valid_youtube_link(link):
    try:
        pattern = r'(https:\/\/www\.youtube\.com\/watch\?v=\w+(&\w+=\w+)*)|(https:\/\/www\.youtube\.com\/playlist\?list=\w+)'
        return bool(re.match(pattern, link))
    except Exception as e:
        show_notification('Fehler bei der Link-Validierung', str(e))
        print(f"Fehler bei der Link-Validierung: {str(e)}")
        return False

def get_browser_url():
    try:
        pyautogui.click()
        pyautogui.hotkey('ctrl', 'a')
        time.sleep(1)
        pyautogui.hotkey('ctrl', 'c')
        return pyperclip.paste()
    except Exception as e:
        show_notification('Fehler beim Abrufen der Browser-URL', str(e))
        print(f"Fehler beim Abrufen der Browser-URL: {str(e)}")
        return ""

def get_format_and_path_from_file():
    try:
        with open(FORMAT_FILE_PATH, 'r') as file:
            format_ = file.readline().strip()
            path = file.readline().strip()
            return format_, path
    except Exception as e:
        show_notification('Fehler beim Lesen der Format-Datei', str(e))
        print(f"Fehler beim Lesen der Format-Datei: {str(e)}")
        return "mp3", ""

def download_video(url, format_, save_path):
    try:
        show_notification('Download gestartet', 'Der Download wurde gestartet.')

        cmd = [
            'yt-dlp',
            url,
            '-o', os.path.join(save_path, '%(title)s.%(ext)s'),
        ]
        if format_ == "mp3":
            cmd.extend(['--extract-audio', '--audio-format', 'mp3'])
        else:
            cmd.extend(['-f', 'bestvideo[ext=mp4]+bestaudio[ext=m4a]/best[ext=mp4]'])
        
        subprocess.run(cmd)

        # Ordner öffnen
        os.startfile(save_path)

    except Exception as e:
        show_notification('Download-Fehler', f'Während des Downloads ist ein Fehler aufgetreten: {str(e)}')
        print(f"Download-Fehler: {str(e)}")

def download():
    format_, custom_path = get_format_and_path_from_file()
    save_path = custom_path if custom_path else DOWNLOAD_FOLDER

    # Ordner "YoutubeConverterSongs" erstellen, wenn kein benutzerdefinierter Pfad angegeben ist
    if not custom_path:
        save_path = os.path.join(DOWNLOAD_FOLDER, 'YoutubeConverterSongs')
        if not os.path.exists(save_path):
            os.makedirs(save_path)

    url = get_browser_url()
    if not is_valid_youtube_link(url):
        show_notification('Ungültige URL', f'Die erfasste URL ist ungültig.')
        return

    with ThreadPoolExecutor() as executor:
        executor.submit(download_video, url, format_, save_path)

keyboard.add_hotkey(HOTKEY, download)

show_notification('Anwendung gestartet', f'Drücke {HOTKEY} um den Download zu starten.')

while True:
    keyboard.wait()
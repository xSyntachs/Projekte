import os
import tkinter as tk
from tkinter import messagebox
import subprocess
import ctypes
from plyer import notification

class USBFormatterGUI(tk.Tk):
    BLACKLIST_FILE = os.path.join(os.getenv("APPDATA"), "xSyntachs", "FormaterConfig.txt")

    def __init__(self):
        super().__init__()

        self.title("USB Stick Formatter <3 Ich Liebe dich doch Tim du schnucki")
        self.geometry("800x200")

        if not ctypes.windll.shell32.IsUserAnAdmin():
            self.admin_check()  # Hier wird die Admin-Abfrage nur durchgeführt, wenn das Programm nicht als Administrator gestartet wurde

        self.create_widgets()

    def admin_check(self):
        if not ctypes.windll.shell32.IsUserAnAdmin():
            messagebox.showerror("Fehler", "Das Programm muss als Administrator gestartet werden.")
            quit()
        else:
            self.format_usb_sticks()

    def create_widgets(self):
        label = tk.Label(self, text="USB Stick Formatter <3 Ich Liebe dich doch Tim du schnucki", font=("Helvetica", 16))
        label.pack(pady=10)

        usb_drive_label = tk.Label(self, text="Laufwerksbuchstaben des USB-Sticks (getrennt durch Komma):")
        usb_drive_label.pack()
        self.usb_drive_entry = tk.Entry(self)
        self.usb_drive_entry.pack()

        file_system_var = tk.StringVar(value="FAT32")
        file_system_label = tk.Label(self, text="Dateisystem auswählen:")
        file_system_label.pack()
        file_system_menu = tk.OptionMenu(self, file_system_var, "FAT32", "NTFS")
        file_system_menu.pack()

        format_button = tk.Button(self, text="Formatieren", command=lambda: self.format_usb_sticks(file_system_var.get()))
        format_button.pack(pady=20)

    def load_blacklist(self):
        blacklist_path = USBFormatterGUI.BLACKLIST_FILE

        if not os.path.exists(blacklist_path):
            # Erstelle den Ordner, wenn er nicht existiert
            os.makedirs(os.path.dirname(blacklist_path), exist_ok=True)
            
            # Erstelle die Datei mit den Standardwerten
            with open(blacklist_path, 'w') as file:
                file.write("M,C,Test")

        with open(blacklist_path, 'r') as file:
            return file.read().split(',')

    def format_usb_sticks(self, file_system):
        usb_drives = self.usb_drive_entry.get().split(',')

        for usb_drive in usb_drives:
            if usb_drive in self.load_blacklist():
                messagebox.showerror("Fehler", f"Fehler beim Formatieren des USB-Sticks {usb_drive}: Laufwerk steht auf der Blacklist")
                continue  # Weiter zum nächsten Laufwerk, auch wenn eines auf der Blacklist steht

            try:
                if file_system == "FAT32":
                    subprocess.run(f'echo f | format {usb_drive}: /FS:FAT32 /Q /V:USB_DRIVE', creationflags=subprocess.CREATE_NO_WINDOW, check=True, shell=True)
                elif file_system == "NTFS":
                    subprocess.run(f'echo f | format {usb_drive}: /FS:NTFS /Q /V:USB_DRIVE', creationflags=subprocess.CREATE_NO_WINDOW, check=True, shell=True)
                else:
                    messagebox.showerror("Fehler", "Ungültiges Dateisystem ausgewählt.")
                    return
                notification.notify(
                    title='USB-Formater | Erfolg',
                    message=f"Der USB-Stick {usb_drive} wurde erfolgreich formatiert als {file_system}.",
                    app_icon=None,
                    timeout=6,
                )
            except subprocess.CalledProcessError as e:
                messagebox.showerror("Fehler", f"Fehler beim Formatieren des USB-Sticks {usb_drive}: {e}")

if __name__ == "__main__":
    app = USBFormatterGUI()
    app.load_blacklist()
    app.mainloop()

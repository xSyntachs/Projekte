# Youtube Converter

**Projekt Version:** `1.0`

**Projekt Sprache:** `Python`

**Projekt zweck:** Ein Tool mit welchem du über die Tastenkombination `strg` + `alt` + `d` ein Youtube Song als `mp3` oder `mp4` downloaden kannst.

**Projekt Benutzung:** 

1 - Erstellen sie in ihrem Roaming verzeichnis die Datei `format.txt`.             
2 - Schreiben sie in die erste Zeile: `mp3` oder `mp4`. Das sorgt am ende dafür wie das Youtube video Convertiert wird.  
3 - Sie können wenn gewünscht in der zweiten Zeile einen Pfad eintragen. z.B. `C:\Users\IhrBenutzername\Desktop`. Dort wird dann die `mp3/mp4` gespeichert. Sollte nichts in der zweiten Zeile eingetragen werden, dann wird die `mp3/mp4` Datei unter `C:\Users\IhrBenutzername\Downloads\YoutubeConverterSongs` gespeichert.
4 - Sollten sie alles erledigt haben, dann Starten sie die Datei `Youtube Converter.exe`  
5 - Mit der Tastenkombination `strg` + `alt` + `d` können sie jetzt wenn sie über den Link ihrer URL hovern, das Video downloaden.

**Projekt Wichtig:** 

Sollten sie etwas in der Datei `format.txt` ändern, müssen sie den Converter neustarten.

**Projekt Setup:**
```
from distutils.core import setup
import py2exe

setup(
    windows=[{
        'script': 'Youtube Converter.py',
        'icon_resources': [(1, 'icon.ico')]
    }],
    options={
        'py2exe': {
            'bundle_files': 1,
            'compressed': True,
            'includes': ['plyer.platforms.win.notification', 'os']
        }
    },
    zipfile=None,
)
```
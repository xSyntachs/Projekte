
# Projects

In diesem Repository sind alle meine Projekte die ich gefunden habe.


# Wichtige Informationen

Convertieren mit Py2Exe: `python setup.py py2exe`

Alle Projekte sind auf der Version `1.0`

# Datei Finder

**Projekt Version:** `1.0`

**Projekt Sprache:** `Python`

**Projekt zweck:** Ein Tool mit welchem du auf deinem System alle Datein Finden kannst.

**Projekt Setup:**
```
from distutils.core import setup
import py2exe

setup(
    console=[{
        'script': 'Datei Finder.py',
        'icon_resources': [(1, 'icon.ico')]
    }],
    options={
        'py2exe': {
            'bundle_files': 1,
            'compressed': True,
            'includes': ['os']
        }
    },
    zipfile=None,
)
```

# Download Cleaner

**Projekt Version:** `1.0`

**Projekt Sprache:** `Python`

**Projekt zweck:** Ein Tool welches deinen Download Ordner auf folgendes Sortiert:   
`Images, Audios, Videos, PDFs, Links, JARs, ZIPs, RARs, Texts, Executables, Others`

**Projekt Setup:**
```
from distutils.core import setup
import py2exe

setup(
    windows=[{
        'script': 'Download Cleaner.py',
        'icon_resources': [(1, 'icon.ico')]
    }],
    options={
        'py2exe': {
            'bundle_files': 1,
            'compressed': True,
            'includes': ['os']
        }
    },
    zipfile=None,
)
```

# Java Text Adventure game

**Projekt Version:** `1.0`

**Projekt Sprache:** `Java`

**Projekt zweck:** Ein mittelmäßiges Text Adventure game für eine 10 - 30 Minute spielerlebnis.

# Key abfrage

**Projekt Version:** `1.0`

**Projekt Sprache:** `Python`, `PhP` und `Shell`

**Projekt zweck:** Ein Tool mit welchem du über Linux eine Key abfrage in deinen Python Projekten haben kannst.

**Projekt Setup:**
```
from distutils.core import setup
import py2exe

setup(
    console=[{
        'script': 'Key abfrage.py',
        'icon_resources': [(1, 'icon.ico')]
    }],
    options={
        'py2exe': {
            'bundle_files': 1,
            'compressed': True,
            'includes': ['os', 'requests', 'uuid', 'msvcrt']
        }
    },
    zipfile=None,
    packages=['.'],
)
```

# USB Formatter

**Projekt Version:** `1.0`

**Projekt Sprache:** `Python`

**Projekt zweck:** Ein Tool mit welchem du schnell und einfach mehrere USB Sticks formatieren kannst.

**Projekt Infos:** Unterstützt `FAT32` und `NTFS`.

**Projekt Setup:**
```
from distutils.core import setup
import py2exe

setup(
    windows=[{
        'script': 'USB Formatter.py',
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

# Whatsapp Auto message Bot [BETA]

**Projekt Version:** `1.0`

**Projekt Sprache:** `Python`

**Projekt zweck:** Ein Bot welcher automatisch mithilfe von ChatGPT auf Whatsapp Nachichten antwortet.


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
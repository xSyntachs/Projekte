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
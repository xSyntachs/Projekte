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
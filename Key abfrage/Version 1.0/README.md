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
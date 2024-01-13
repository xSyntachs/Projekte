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
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
# Schritt 0: Archive auspacken
unzip director_latest.zip
unzip org.eclipse.buckminster.site.eclipse.headless_1.2.0.r11379.zip -d site

# Schritt 1: Installieren von Buckminster
# Achtung, p2 ist ziemlich penibel bzgl. Pfaden. Bitte hier nur absolute Pfade angeben!
./director/director -r file:`pwd`/site \
                    -d `pwd`/buckminster \
                    -p Buckminster \
                    -i org.eclipse.buckminster.cmdline.product \
                    -i org.eclipse.buckminster.core.headless.feature.feature.group \
                    -i org.eclipse.buckminster.pde.headless.feature.feature.group


# Schritt 1a: Das erleichert uns die Arbeit
alias bm="./buckminster/buckminster -data `pwd`/workspace"


# Schritt 2: Target Platform setzen
# Wir gehen zunächst mal davon aus, dass diese bereits mit Maven heruntergeladen wurde
bm setpref org.eclipse.buckminster.pde.targetPlatformPath=`pwd`/../osgi-plattform/target


# Schritt 3: Die Sourcen in den workspace importieren
bm import source.cquery


# Schritt 4: Bauen :-)
bm build


# Schritt 5: Ausführen
bm launch -l org.osgiusers.germany.example.kasse.webapp/Kasse.launch --stdout

=> http://localhost:8888/kasse
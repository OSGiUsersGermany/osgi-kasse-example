ant4eclipse Demonstration auf dem OSGi Forums Germany Build Workshop
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

- Das Projekt 'ant4eclipse-demo' enthält die Build-Scripte sowie alle für den
  Build benötigten Bibliotheken (ant, ant4eclipse etc) zum Bauen und Testen
  der Workshop Beispiel-Anwendung
  (http://germany.osgiusers.org/Main/WorkshopBuildingOSGiApplication#Beispiel)

- Die weiteren Projekte entsprechen den Projekten aus dem Git-Repository
  (http://github.com/tux2323/osgi-kasse-example).
   Änderungen:
   - In allen Projekten haben wir (PDE) build.properties angelegt
   - Im osgi-plattform-Modul sind alle externen Bundles der Target-Platform
     bereits abelegt. Sie müssen also nicht mit maven geladen werden.
  
- Vor dem Ausführen des Builds müssen evtl. Pfade in der Datei
    build-kasse.properties
  angepasst werden (insb. die Pfade zum JRE)
  
- Zum Starten des Buildes von der Kommandozeile das Script
    build-kasse.cmd
  ausführen.
   
- Der Build kann auch aus Eclipse heraus gestartet werden; dazu einen
  der Ant "External Tool" Launcher ausführen

- Das Ergebnis des Builds befindet sich nach dem Ausführen im Verzeichnis
  'destination' des ant4eclipse-demo-Projektes:
  - destination/plugins: Die gebauten Plug-ins incl. Eclipse Source-Bundles
  - destination/reports: Der JUnit-Test-Report
  - destination/distribution: Alle Bundles (Workspace+Target Platform), sowie
     Equinox Launcher, Konfiguration und Start-Script
     (Konfiguration und Start-Script werden auf Grundlage des Kasse-Launchers
     erzeugt)

Viel Spaß!

Weitere Informationen über ant4eclipse:
http://www.ant4eclipse.org

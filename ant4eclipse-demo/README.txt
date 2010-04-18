ant4eclipse Demonstration auf dem OSGi Forums Germany Build Workshop
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

- Das Projekt 'ant4eclipse-demo' enth�lt die Build-Scripte sowie alle f�r den
  Build ben�tigten Bibliotheken (ant, ant4eclipse etc) zum Bauen und Testen
  der Workshop Beispiel-Anwendung
  (http://germany.osgiusers.org/Main/WorkshopBuildingOSGiApplication#Beispiel)

- Die weiteren Projekte entsprechen den Projekten aus dem Git-Repository
  (http://github.com/tux2323/osgi-kasse-example).
   �nderungen:
   - In allen Projekten haben wir (PDE) build.properties angelegt
   - Im osgi-plattform-Modul sind alle externen Bundles der Target-Platform
     bereits abelegt. Sie m�ssen also nicht mit maven geladen werden.
  
- Vor dem Ausf�hren des Builds m�ssen evtl. Pfade in der Datei
    build-kasse.properties
  angepasst werden (insb. die Pfade zum JRE)
  
- Zum Starten des Buildes von der Kommandozeile das Script
    build-kasse.cmd
  ausf�hren.
   
- Der Build kann auch aus Eclipse heraus gestartet werden; dazu einen
  der Ant "External Tool" Launcher ausf�hren

- Das Ergebnis des Builds befindet sich nach dem Ausf�hren im Verzeichnis
  'destination' des ant4eclipse-demo-Projektes:
  - destination/plugins: Die gebauten Plug-ins incl. Eclipse Source-Bundles
  - destination/reports: Der JUnit-Test-Report
  - destination/distribution: Alle Bundles (Workspace+Target Platform), sowie
     Equinox Launcher, Konfiguration und Start-Script
     (Konfiguration und Start-Script werden auf Grundlage des Kasse-Launchers
     erzeugt)

Viel Spa�!

Weitere Informationen �ber ant4eclipse:
http://www.ant4eclipse.org

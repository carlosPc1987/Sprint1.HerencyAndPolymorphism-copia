# Tasca-S1.01.HerencyAndPolymorphism

Tasca🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀
Tasca S1.01. Herència i Polimorfisme

- Aquest repositori conte exercicis per a comprendre 
  i aplicar els conceptes de hernecia i polimorfisme a Java.

Les excepcions a programacio son events inesperats que pasen durant l'execucio d'un programa.
Es fan servir per tractar errades sense interrumpir el fluxe del codi.
Les excepcions son objectes que heredan de Throwable y es divideixen en :

- checked(s'han de manejar)

- unchecked (errades en temps d'execucio).

  Es poden capturar amb try-catch i llançar amb throw.
- tambe es posible definir excepcions personalitzades extenen Exception o RuntimeException.
- un bon tractament d'exepcions millora l'estabilitat i seguretat del software.

  🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀

nivell1
·Exercici 1
    En un grup de música hi ha diferents tipus d’instruments musicals.
    Hi ha instruments de vent, de corda i de percussió.
    Tots els instruments tenen com a atributs el seu nom, i el seu preu. 
    A més, tenen un mètode anomenat tocar(). Aquest, és
    abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles.
    Si s’està tocant un instrument de
    vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", 
    si s’està tocant un instrument de corda:
    “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió:
    “Està sonant un instrument de
    percussió”.
  El procés de càrrega d'una classe només té lloc una vegada.
  Demostra que la càrrega pot ser provocada per la creació de
  la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.
  Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.

·Exercici 2
  Crea una classe "Cotxe" amb els atributs: marca, model i potència.
  La marca ha de ser estàtic final, el model estàtic i la potència final. 
  Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor
  de la classe?
  Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() 
  i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar per consola:
  “El vehicle està accelerant” i el mètode frenar() ha de mostrar: “El vehicle està frenant”.
  Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.

nivell 2

·Exercici 1
  Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode trucar().
  Aquest mètode ha de rebre un String amb un número de telèfon.
  El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut
  per paràmetre.
  Crea una interfície anomenada "Camera" amb el mètode fotografiar(), 
  i una altra interfície anomenada Rellotge amb el mètode alarma().
  Crea una classe anomenada "Smartphone" que sigui subclasse de "Telèfon" 
  i que a la vegada implementi les interfícies "Camera" i "Rellotge".
  El mètode fotografiar() ha de mostrar per consola: 
  “S’està fent una foto” i el mètode alarma() ha de mostrar: “Està sonant l’alarma”.
  Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.

nivell 3
Exercici 1
  En una redacció de notícies esportives tenen les notícies classificades per esports:
  futbol, bàsquet, tenis, F1 i motociclisme.
  La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom,
  el DNI i el sou. Un cop assignat un DNI, aquest no podrà canviar mai.
  Tots els redactors tenen el mateix sou, i si en un futur l’empresa pot incrementar-lo, 
  ho farà a tothom per igual. De moment el sou actual és de 1500 €.
  Cada redactor pot treballar en més d’una notícia.
  Les notícies han de tenir un titular, un text, una puntuació i un preu.
  En el moment de crear-se, el text ha d’estar buit.
  A més, de les notícies de futbol s’ha de saber a quina competició fa referència(String),
  a quin club(String) i a quin jugador(String).
  De les notícies de bàsquet s’ha d’indicar a quina competició fa referència(String)
  i a quin club(String).
  De les notícies de tenis s’ha de saber de quina competició(String)
  parlen i de quins tenistes(String).
  De les notícies d'F1 hem de saber a quina escuderia(String) fan referència.
  De les notícies de motociclisme s’ha d’indicar de quin equip(String) són.
  Les notícies es venen a diferents mitjans.
  Per saber el preu de cada notícia hem d'implementar un mètode que es diu 
  calcularPreuNoticia().
  A continuació s’explica com calcular el preu de cada notícia:
·Notícies de futbol:
  Preu inicial: 300 €
  Lliga de Campions: 100 €
  Barça o Madrid: 100 €
  Ferran Torres o Benzema: 50 €
  Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions,
  té un preu de 550 €.
·Notícies de bàsquet:
  Preu inicial: 250 €
  Eurolliga: 75 €
  Barça o Madrid: 75 €
·Notícies de tenis:
  Preu inicial: 150 €
  Federer, Nadal o Djokovic: 100 €
·Notícies d'F1:
  Preu inicial: 100 €
  Ferrari o Mercedes: 50 €
·Notícies de motociclisme:
  Preu inicial: 100 €
  Honda o Yamaha: 50 €
 
 Per calcular les puntuacions de les notícies se segueixen els següents criteris:
·Notícies de futbol:
5 Punts.
Lliga de Campions: 3 punts
Lliga: 2 punts
Barça o Madrid: 1 punt
Ferran Torres o Benzema: 1 punt
Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions, té una puntuació de 10 punts.

·Notícies de bàsquet:
4 punts 
Eurolliga: 3 punts
ACB: 2 punts
Barça o Madrid: 1 punt
Notícies de Tenis:
4 punts
Federer, Nadal o Djokovic: 3 punts
·Notícies F1:
4 punts
Ferrari o Mercedes: 2 punts
·Notícies de Motociclisme:
3 punts
Honda o Yamaha: 3 punts

A la classe principal s’ha de fer un menú amb les següents opcions:

  1.- Introduir redactor.

  2.- Eliminar redactor.

  3.- Introduir notícia a un redactor.

  4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

  5.- Mostrar totes les notícies per redactor.

  6.- Calcular puntuació de la notícia.

  7.- Calcular preu-notícia.


- Pasos para instalar y configurar el entorno.
  git :https://github.com/carlosPc1987
  proyecto-java

-🚀🚀🚀🚀🚀🚀🚀 CarlosPc🚀🚀🚀🚀🚀🚀🚀

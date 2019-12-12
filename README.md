# Monitor komponensek generálása kontextusfüggő viselkedés ellenőrzésére

## Kibővített szöveges PSC leíró nyelv és szöveges kontextus modell leíró nyelv

A kibővített szöveges PSC leíró nyelvhez és a szöveges kontextus modell leíró nyelvhez tartozó nyelvtanok a `org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtext` fájlban találhatók.
A `org.xtext.example.mydsl/src/org/xtext/example/mydsl/scoping/MyDslScopeProvider.xtend` fájlban található a nyelvtanokhoz tartozó `MyDslScopeProvider` segédosztály.

## Forráskód generátor

A forráskód generátor komponensekhez tartozó implementáció a `org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/MyDslGenerator.xtend` fájlban található.

A projektben található összes többi fájlt az `Xtext` és `Xtend` plugin-ok generálják.

## Műkődést demonstráló példák

A példák megtalálhatók a `https://github.com/BakaiIstvan/BatmonMinotorEnvironment` címen elérhető github repository-ban. Egy példához egy ág tartozik a repositoryban.

## Használat

A forráskódot egy Xtext projektként lehet importálni az Eclipse IDE-t használva. A projekt kezelőben lévő `org.xtext.example.mydsl` mappán jobb kattintással, a `Run As -> Eclipse Application` opciót kiválasztva, lehet legenerálni a specifikált nyelvet támogató Eclipse fejlesztő környezetet.
Ezt úgy tehetjük meg, hogy egy java projektet hozunk létre a generált fejlesztő környezetben, és létrehozunk benne egy `.mydsl` kiterjesztésű fájlt.
Ebben a fájlban tudunk, a nyelvet használva, kontextus modelleket leírni, vagy PSC követelményeket specifikálni.
`https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html` címen megtalálható egy részletes leírás a fordításhoz szükséges lépésekről.

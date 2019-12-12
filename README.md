# Monitor komponensek generálása kontextusfüggő viselkedés ellenőrzésére

## Kibővített szöveges PSC leíró nyelv és szöveges kontextus modell leíró nyelv

A kibővített szöveges PSC leíró nyelvhez és a szöveges kontextus modell leíró nyelvhez tartozó nyelvtanok a `org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtext` fájlban találhatók.
A `org.xtext.example.mydsl/src/org/xtext/example/mydsl/scoping/MyDslScopeProvider.xtend` fájlban található a nyelvtanokhoz tartozó `MyDslScopeProvider` segédosztály.

## Forráskód generátor

A forráskód generátor komponensekhez tartozó implementáció a `org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/MyDslGenerator.xtend` fájlban található.

A projektben található összes többi fájlt az `Xtext` és `Xtend` plugin-ok generálják.

## Mükődést demonstráló példák

A példák megtalálhatók a `https://github.com/BakaiIstvan/BatmonMinotorEnvironment` címen elérhető github repository-ban. Egy példához egy ág tartozik a repositoryban.

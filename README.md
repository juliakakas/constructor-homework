# constructor-homework

## 1. Feladat: egyszerű BankAccount osztály
### 1.a Fieldek
Készíts egy BankAccount osztályt, az alábbi **privát** fieldekkel:
`accountNumber` (String), `accountHolder` (String) és `balance` (double)!

### 1.b Getterek és Setterek
Írj mindegyik fieldhez gettert és settert! 
Mi a getterek visszatérési értéke? 
Mi a settereké? 
Mi a getterek paraméterlistája?
Mi a settereké?

### 1.c Példányosítás
Készíts a BankAccount osztályból legalább 2 objektumot! 
Állítsd be, majd írasd ki az értékeit!


## 2. Feladat: Konstruktorok
A konstruktor egy speciális metódus, amely az objektum létrehozásakor fut le. 
Szerepe az osztályon belüli változók kezdőértékének beállítása. 
Minden osztály legalább egy konstruktor metódust tartalmaz. 
Ha nem definiáljuk ezt a metódust, akkor a fordító generál egyet, 
ami paraméter nélküli lesz, ezt hívjuk default konstruktornak.

Ha az osztály rendelkezik már egy konstruktorral (paraméteres vagy paraméter nélküli), 
akkor a fordító nem generál az osztályhoz paraméter nélküli konstruktort. 

A konstuktorok jellemzői:
- nincs visszatérési értékük (void kulcsszó sem kell eléjük)
- nevük megegyezik az osztály nevével (nagybetűs!)
- fogadhatnak paramétereket
- több is lehet belőlük, viszont paraméterek számában és típusában egyértelműen 
megkülönböztethetőnek kell lennie két konstruktornak


### 2.a Default konstruktor
Az előző feladatban már tudtodon kívül használtál egy default (alapártelmezett) konstruktort:
`BankAccount myAccount = new BankAccount();`
A Javaban ez mindig automatikusan létrejön, ha megnézed, neked az osztályodban nincs külön
leírva egy ilyen sor, hogy `public BankAccount(){}`, de úgy működik, mintha lenne.
Írj most egy ilyet és írj bele egy kiíratást!
```
public BankAccount(){
    System.out.println("Meghívódik a paraméter néküli konstruktor")
}
```
Futtasd le a kódot!


_Ha kész vagy és lefuttattad, 
töröld ki (teljesen), ne legyen semmilyen konstruktor az osztályodban!_

### 2.b Paraméteres konstruktor
Készíts egy paraméteres konstuktort, ami paraméterként vár egy Stringet, amit beállít
accountNumbernek!
```
public BankAccount(String accountNumber) {
    this.accountNumber = accountNumber;
}
```
Mi történik ilyenkor és miért? 
_Válasz_: ha készítünk az osztályunkban egy konstruktort, akkor elveszik a default 
konstruktor és hibát fog dobni, amikor meghívjuk azt, hiszen nem létezik.
Ha mégis használni szeretnénk, akkor nekünk explicit definiálnunk kell az osztályunkban.
Azaz írnunk kell a BankAccount osztályba egy ilyen sort:
`public BankAccount(){}`, ezt most kipróbálhatod, de utána töröld ki!

Írd át a példányosítást, hogy az új konstuktort használja!
```
BankAccount account = new BankAccount("66642069");
```

### 2.c Overloading (túlterhelés)
Overloadolásnak hívjuk, amikor két metódusnak ugyanaz a neve, de eltér a paraméterlistájuk.
Konstruktorokat is tudunk overloadolni, azaz írhatunk több konstruktort, ha más a paraméterlistájuk.
Mit jelent az eltérő paraméterlista? Azt, hogy különböznek a paraméterek számában, 
a paraméterek típusában vagy a paraméterek sorrendjében. A lényeg, hogy a JVM ki tudja találni,
hogy mikor mit akarsz meghívni!

Ha írnál egy olyen konstruktort, ami nem az `accountNumber`-t, hanem az `accountHolder`-t
fogadja paraméterül, akkor a fordító nem fogja tudni, hogy melyik hívódjon meg.
Próbáljuk is ki!
```
public BankAccount(String accountHolder) {
    this.accountNumber = accountHolder;
}
```
Honnan fogja tudni a JVM, hogy itt melyik konstruktort szeretnéd futtatni?
```
BankAccount account = new BankAccount("66642069");
BankAccount otherAccount = new BankAccount("Rozsomák Rozi");
```
Hát, sehonnan. :) Annyit lát, hogy String paraméterrel hívsz meg konstuktorokat, de ez alapján
nem tudja beazonosítani, hogy melyiket kéne lefuttatni.

Töröld ki ezt az `accountHolder`-es konstuktort (az `accountNumber`-es maradjon)!

Írjunk most egy olyan konstuktort, amit meg fogunk tudni különböztetni:
a `balance`-t várja bemenetként és állítsa be azt!

Írj most egy olyan konstruktort, ami három paramétert vár és beállítja azokat!

### 2.d Konstruktor hívása másik konstruktorból
Nézd át a Car osztályt! Implementálj egy hasonló működést a BankAccount osztályodban!



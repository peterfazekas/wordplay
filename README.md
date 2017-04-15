<h1>Wordplay - Szójáték</h1>
<h2>Informatika érettségi emelt szintű feladat: 2011. május</h2>
<p>Sok szórakoztató szójátékkal lehet elütni az időt. Ezek közül némelyekhez segítségül hívhatjuk a technikát is. Az alábbiakban szójátékokhoz kapcsolódó problémákat kell megoldania.</p>
<p>A feladatok megoldásához rendelkezésére áll a <code>szoveg.txt</code> fájl, amelybe Gárdonyi Géza Egri csillagok című regényéből gyűjtöttünk ki szavakat. Az állományban csak olyan szavak szerepelnek, melyek az angol ábécé betűivel leírhatók, és minden szó csak egyszer szerepel. A könnyebb feldolgozhatóság érdekében valamennyi szó csupa kisbetűvel szerepel, szavanként külön sorban. Tudjuk, hogy ebben az állományban a szavak 20 karakternél nem hosszabbak.</p>
<p>Készítsen programot, amely az alábbi feladatokat megoldja! A program forráskódját <code>szavak</code> néven mentse!</p>
<p>Minden – képernyőre írást igénylő – részfeladat megoldása előtt írja a képernyőre a feladat sorszámát! Ha a felhasználótól kér be adatot, jelenítse meg a képernyőn, hogy milyen értéket vár (például a 1. feladat esetén: "<code>1. feladat Adjon meg egy szót: </code>")! Az ékezetmenteskiírás is elfogadott.</p>
<ol>
<li>Kérjen be a felhasználótól egy szót, és döntse el, hogy tartalmaz-e magánhangzót! Amennyiben tartalmaz, írja ki, hogy "<code>Van benne magánhangzó.</code>"! Ha nincs, akkor írja ki, hogy "<code>Nincs benne magánhangzó.</code>"! A begépelendő szóról feltételezheti, hogy csak az angol ábécé kisbetűit tartalmazza. <em>(Az angol ábécé magánhangzói: <code>a, e, i, o, u</code>.)</em></li>
<li>Írja ki a képernyőre, hogy melyik a leghosszabb szó a <code>szoveg.txt</code> állományban, és az hány karakterből áll! Ha több azonos leghosszabb hosszúságú szó is van a szógyűjteményben, akkor azok közül elegendő egyetlen szót kiírnia. A feladatot úgy oldja meg, hogy tetszőleges hosszúságú szövegállomány esetén működjön, azaz a teljes szöveget ne tárolja a memóriában!</li>
<li>A magyar nyelv szavaiban általában kevesebb a magánhangzó, mint a mássalhangzó. Határozza meg, hogy az állomány mely szavaiban van több magánhangzó, mint egyéb karakter! Ezeket a szavakat írja ki a képernyőre egy-egy szóközzel elválasztva! A szavak felsorolása után a mintának megfelelően az alábbi adatokat adja meg:
<ul>
    <li>hány szót talált;</li>
    <li>hány szó van összesen az állományban;</li>
    <li>a talált szavak hány százalékát teszik ki az összes szónak!</li>
</ul>
<p>A százalékot két tizedessel szerepeltesse!</p>
<p>Például: <code>130/3000 : 4,33%</code></p></li>
</ol>
<p>A következőkben a szólétra játékkal kapcsolatos feladatokat kell megoldania.</p>
<p>A szólétra építés egy olyan játék, amikor adott egy szó közepe, például isz, amit a létra fokának nevezünk. Ennek a szócsonknak az elejére és a végére kell egy-egy betűt illesztenünk úgy, hogy értelmes szót hozzunk létre, például hiszi vagy liszt. Ezt az értelmes szót a játékban létraszónak nevezzük. Az adott szórészlethez minél több létraszót tudunk kitalálni, annál magasabb lesz a szólétra. A cél az, hogy egy megadott szócsonkhoz a lehető legmagasabbszólétrát építsük.</p>
<p>Például: Szórészlet: <b>isz</b></p>
<p>A hozzá tartozó létraszavak:</p>
<pre>h<b>isz</b>i
l<b>isz</b>t
v<b>isz</b>i
t<b>isz</b>t
…</pre>
<ol start=4>
<li>Hozzon létre egy tömb vagy lista adatszerkezetet, és ebbe gyűjtse ki a fájlban található ötkarakteres szavakat! A <code>szoveg.txt</code> állomány legfeljebb 1000 darab ötkarakteres szót tartalmaz. Kérjen be a felhasználótól egy 3 karakteres szórészletet! Írja ki a képernyőre a szólétra építés szabályai szerint hozzá tartozó ötkarakteres szavakat a tárolt adathalmazból! A kiírásnál a szavakat egy-egy szóköz válassza el! (Teszteléshez használhatja például az „isz” vagy „obo” szórészleteket, mert ezekhez a megadott szövegállományban több létraszó is tartozik.)</li>
<li>Az eltárolt ötkarakteres szavakból csoportosítsa azokat a szavakat, melyek ugyanannak a hárombetűs szórészletnek a létraszavai! Hozzon létre egy letra.txt állományt, amelybe ezeket a szavakat írja az alábbiak szerint:
    <ul>
    <li>minden szó külön sorba kerüljön;
    <li>csak olyan szó szerepeljen az állományban, aminek van legalább egy párja, amivel egy létrát alkotnak (azaz első és utolsó karakter nélkül megegyeznek);
    <li>az egy létrához tartozó szavak közvetlenül egymás után helyezkedjenek el;
    <li>két létra szavai között egy üres elválasztó sor legyen!
    </ul>
<p>Például: <code>letra.txt</code></p>
<pre>  megye
  vegye
  hegyi
  tegye
    
    lehet
    teher
    mehet
    
    tejes
    fejet
    fejen
    
    neked
    nekem
    reked
    ...
 </pre></li>
</ol>
<hr>
<h3>Források:</h3>
<li><a href="https://www.oktatas.hu/pub_bin/dload/kozoktatas/erettsegi/feladatok2011tavasz/e_info_11maj_fl.pdf">Feladatlap</a>
<li><a href="https://www.oktatas.hu/pub_bin/dload/kozoktatas/erettsegi/feladatok2011tavasz/e_infofor_11maj_fl.zip">Forrásállományok</a>



[README.md](https://github.com/user-attachments/files/28708116/README.md)
Markdown
# Automation Exercise - Selenium QA Automation Project

Ovaj projekat predstavlja automatizovani test paket (Test Suite) kreiran za veb sajt [Automation Exercise](https://automationexercise.com/). Projekat je razvijen kao deo QA obuke na IT Bootcamp-u, sa ciljem demonstracije naprednih tehnika automatizacije korisničkog interfejsa (UI), stabilizacije testova i primene najboljih QA praksi.

---

## 🚀 Čemu služi ovaj projekat?

Projekat automatizuje ključne korisničke scenarije (End-to-End testove) na e-commerce platformi kako bi se osiguralo da kritične funkcionalnosti rade bez greške. Automatizovani su sledeći scenariji:
* **Registracija korisnika (Register User):** Kompletan proces kreiranja novog naloga sa jedinstvenim (dinamičkim) podacima.
* **Dodavanje proizvoda u korpu (Add Product to Cart):** Navigacija kroz kategorije (ženska odeća/haljine), dodavanje artikla i verifikacija sadržaja korpe.
* **Kontakt forma (Contact Us Form):** Popunjavanje forme, uspešno prilaganje (upload) fajla, rukovanje JavaScript Alert prozorima i povratak na početnu stranu.

---

## 🛠️ Tehnologije i Alati

Projekat je izgrađen pomoću sledećih tehnologija:
* **Java (verzija 26):** Primarni programski jezik.
* **Selenium WebDriver (verzija 4.43.0):** Alat za automatizaciju i upravljanje pretraživačem.
* **TestNG (verzija 7.12.0):** Framework za organizaciju, grupisanje i izvršavanje testova, kao i za napredne asertacije.
* **Maven:** Alat za upravljanje zavisnostima (dependencies) i build procesom kroz `pom.xml`.
* **Page Object Model (POM):** Arhitektonski šablon kojim je kod podeljen na stranice (Pages) i same testove (Tests) radi lakšeg održavanja.

---

## ⚙️ Stabilizacija testova (QA Rešenja)

Tokom razvoja, uspešno su prevaziđeni česti QA izazovi na ovom sajtu:
1. **Rukovanje oglasima (Google Ads Interception):** Testovi su stabilizovani upotrebom JavaScript izvršitelja (`JavascriptExecutor`) za klikove, čime je sprečeno da iskkačuće reklame prekinu izvršavanje testa.
2. **Pametna čekanja (Waits):** Primenjen je `Implicit Wait` na nivou drajvera, kombinovan sa preciznim `WebDriverWait` (eksplicitnim čekanjem) na mestima gde asinhroni (AJAX) pozivi i modalni prozori zahtevaju vreme za obradu na serveru.
3. **Dinamički podaci:** Implementirano je generisanje nasumičnih vrednosti za email adrese kako bi test registracije bio ponovljiv bez ručnog brisanja baze podataka.

---

## 💻 Kako pokrenuti testove?

### Preduslovi:
* Instaliran **Java JDK** (preporučeno v26 ili novija).
* Instaliran **IntelliJ IDEA** (ili drugi odgovarajući IDE).

### Koraci za pokretanje kroz IntelliJ:
1. Klonirajte ili preuzmite ovaj projekat na svoj računar.
2. Otvorite IntelliJ IDEA, idite na **File -> Open...** i izaberite korenski folder projekta.
3. Sačekajte da Maven automatski učita sve zavisnosti iz `pom.xml` fajla.
4. Locirajte test klasu unutar foldera: `src/test/java/TestsAndAssertions/TestPage.java`.
5. Kliknite desnim tasterom miša na klasu ili na specifičnu `@Test` metodu i izaberite opciju **Run 'TestPage'**.

---

## 📁 Struktura Projekta

* `src/main/java/automationexerciseTest/` -> Sadrži Page Object klase (lokatori i metode za elemente na stranicama kao što su `NavigationPage`, `ProductPage`, `CartPage`, `RegisterPage`).
* `src/test/java/TestsAndAssertions/` -> Sadrži test metode, asertacije, kao i `BaseTest` klasu zaduženu za `setUp` (podizanje drajvera) i `tearDown` (zatvaranje pretraživača).
* `pom.xml` -> Glavni Maven konfiguracioni fajl.

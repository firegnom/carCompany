# Zadanie 1: Zaprojektuj rozwiązanie następującego problemu
- Firma posiada pracowników oraz flotę samochodów.
- Firma posiada atrybuty takie jak ilość pracowników oraz lista dostępnych samochodów.
- Firma powinna być w stanie tylko dodać nowy samochód.
Firma w swojej flocie może posiadać samochody elektryczne, benzynowe oraz diesel. Tylko
samochody elektryczne uznawane są za ekologiczne.
Zaproponuj implementację serwisu CompanyService, który realizuje następujące funkcjonalności:
  - utworzenie firmy
  - dodanie nowego samochodu do firmy
  - zwraca informację czy firma jest firmą ekologiczną

Firma ekologiczna oznacza, że Firma zatrudnia minimum jednego pracownika oraz że wszystkie jej
samochody są ekologiczne.
Zaproponuj testy jednostkowe dla modelu firmy (Company) oraz dla serwisu CompanyService.
# Zadanie 2:
W dowolnym pakiecie utwórz klasę Driver oraz przenieś poniższy kod.
Napraw nieprawidłowe importy.
Przeanalizuj.
Zaproponuj refaktor kodu (w dowolny sposób tj. zmiany klas, refaktor nazw, itp), aby kod był
jak najbardziej elastyczny co do wprowadzanych zmian.
Twoje nowe rozwiązanie ma zapewnić dotychczasową obsługę (dotychczasowe zachowania
systemu). Dodatkowo system musi realizować następujące funkcjonalności:
a. chcemy aby obsługiwał kierowców kategorii D
b. chcemy aby obsługiwał kierowców kategorii T
Zaproponuj testy jednostkowe do Twojego rozwiązania.
Wyjaśnienie wymagań biznesowych:
Osoba (kierowca) może kierować autobusem (kat. D), jeśli posiada kategorię D oraz ma min. 26 lat.
Osoba (kierowca) może kierować ciągnikiem (kat. T), jeśli posiada kategorię T oraz ma min. 18 lat lub
podsiada kategorię B i ma min. 24 lata.
W przyszłości planujemy wprowadzać kolejne uprawnienia do prowadzenia pojazdów.
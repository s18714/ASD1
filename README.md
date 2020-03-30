Zadanie programistyczne 1

Student ma n kursów do zaliczenia. Kursy są poetykietowane od 0 do n-1. Niektóre z kursów mają wymagania wstępne, przykładowo aby zaliczyć kurs 1  należy najpierw zaliczyć kurs 0. Dla danej listy wszystkich kursów i ich wymagań czy jest możliwe ukończenie wszystkich kursów przez studenta i jeśli tak, w jakiej kolejności musi student je ukończyć?

Dane wejściowe:
W pierwszej linii znajduje sie liczba wszystkich kursów n oraz lączna liczba  wymagań m. W każdej z następnych m linii znajdują się dwie liczby a, b oddzielone spacją. Oznaczają one, że aby ukończyć kurs a należy wcześniej ukończyć kurs b.

Dane wyjściowe:
Jako wyjście należy podać: 
•	NIE - oznacza, ze nie jest możliwe zaliczenie listy kursów
•	Sekwencja kursów – kolejność zaliczania kursów. Przed zaliczeniem kursu wszystkie jego wymagania muszą być już zaliczone.

Przykład 1 (uzupełniony o pierwszą linię)
Dane wejściowe:
    3 2
    2 1
    1 0
Dane wyjściowe:
    0 1 2

Przykład 2 (uzupełniony o pierwszą linię)
  Dane wejściowe:
    3 3
    2 2
    1 0
    0 1
  Dane wyjściowe:
    NIE 

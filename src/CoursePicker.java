import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class CoursePicker {

    private int[] ileWymaganDla;
    private List<Integer>[] kursyZWymaganiem;
    private int[] result;
    private int counter = 0;


    private void addCondition(int wymaganie, int kurs) {
        ileWymaganDla[kurs]++;
        kursyZWymaganiem[wymaganie].add(kurs);
    }

    private void RecursiveCheck(int wymaganie) {
        result[counter++] = wymaganie;
        for (int n : kursyZWymaganiem[wymaganie]) {
            ileWymaganDla[n]--;
            if (ileWymaganDla[n] == 0)
                RecursiveCheck(n);
        }
    }

    void findSequence(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int liczbaKursow = scanner.nextInt();
        int liczbaWymagan = scanner.nextInt();
        result = new int[liczbaKursow];
        boolean[] stanGrafa = new boolean[liczbaKursow];

        ileWymaganDla = new int[liczbaKursow];
        kursyZWymaganiem = new LinkedList[liczbaKursow];

        for (int i = 0; i < liczbaKursow; ++i)
            kursyZWymaganiem[i] = new LinkedList<>();

        int lewy, prawy;
        for (int i = 0; i < liczbaWymagan; i++) {
            lewy = scanner.nextInt();
            prawy = scanner.nextInt();
            stanGrafa[lewy] = true;
            this.addCondition(prawy, lewy);
        }

        for (int i = 0; i < liczbaKursow; i++) {
            if (!stanGrafa[i])
                this.RecursiveCheck(i);

            if (this.counter == liczbaKursow)
                break;
        }

        if (this.counter == liczbaKursow)
            for (Integer n : this.result)
                System.out.print(n + " ");
        else System.out.println("NIE");
    }
}
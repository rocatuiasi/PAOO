import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        try {
            var scanner = new Scanner(System.in);
            System.out.print("Numarul problemei: ");
            var no = scanner.nextInt();

            switch (no) {
                case 1:
                    System.out.println("1. Se citește un număr n și un vector cu n componente numere întregi. Sa se afișeze valoarea minima conținută în vector.");
                    P1();
                    break;
                case 2:
                    System.out.println("2. Se citesc două valori naturale n și m nenule, ce reprezinta numărul de elemente a doua mulțimi A și B. Sa se calculeze și apoi sa se afișeze mulțimea care reprezinta intersecția celor doua mulțimi.");
                    P2();
                    break;
                case 3:
                    System.out.println("3. Se citesc două valori naturale n și m nenule, ce reprezinta numărul de elemente a doua mulțimi A și B. Sa se calculeze și apoi sa se afișeze mulțimea care reprezinta diferența AB a celor doua mulțimi.");
                    P3();
                    break;
                case 4:
                    System.out.println("4. Se citește un număr n și un vector cu n componente numere întregi. Sa se verifice dacă elementele vectorului sunt sau nu în ordine crescătoare.");
                    P4();
                    break;
                case 5:
                    System.out.println("5. Se considera un vector x cu n numere întregi. Sa se copieze într-un alt vector y elementele pozitive ale vectorului inițial.");
                    P5();
                    break;
                case 6:
                    System.out.println("6. Se citește un tablou unidimensional cu n (1n100) componente numere naturale. Se cere să se construiască și să se afișeze un nou vector cu componentele pătrate perfecte ale vectorului inițial.");
                    P6();
                    break;
                case 7:
                    System.out.println("7. Fiind dat un tablou bidimensional A(n,m) de numere întregi, sa se calculeze și să afișeze suma elementelor aflate pe marginea (rama) tabloului. Exemplu: Pentru n = 3 și m = 4 și se va afișa suma 1 + 2 + 3 + 4 + 5 + 8 + 9 + 10 + 11 +12 = 65.");
                    P7();
                    break;
                case 8:
                    System.out.println("8. Fiind dat un tablou bidimensional A(n,m) de numere întregi, sa se afișeze:\n\ta. produsul elementelor pozitive aflate pe linii pare și coloane impare.\n\tb. suma elementelor pozitive impare din matrice.\n\tc. numărul elementelor pozitive, negative și respectiv nule din matrice.\n\td. elementele aflate pe linii impare și coloane divizibile cu 3.");
                    P8();
                    break;
                case 9:
                    System.out.println("9. Fiind dat un tablou bidimensional A(n,m) de numere întregi, sa scrie un program Java care sa stabilească de cate ori apare o valoare data x ca element al metricii.");
                    P9();
                    break;
                case 10:
                    System.out.println("10. Fiind dat un tablou bidimensional A(n,m) de elemente 0 și 1. Sa se scrie un program Java care afișează numărul maxim de elemente egale cu 1 conținute pe o linie.");
                    P10();
                    break;
                case 11:
                    System.out.println("11. Fiind dat un tablou bidimensional A(n,m) de numere întregi. Sa se scrie un program Java care sa determine linia (liniile) din matrice care conține cele mai multe elemente nenule.");
                    P11();
                    break;
                case 12:
                    System.out.println("12. Fiind dat un tablou bidimensional A(n,m) de numere întregi. Sa se scrie un program Java care sa afișeze numărul/numerele de ordine a liniilor din tablou care au cele mai multe componente distincte.");
                    P12();
                    break;
                case 13:
                    System.out.println("13. Să se scrie un program Java care sa afișeze numărul de apariții unui șir (de caractere) în alt șir.");
                    P13();
                    break;
                case 14:
                    System.out.println("14. Se dă de la tastatură un șir de caractere S și un caracter C. Să se înlocuiască toate aparițiile C din S cu caracterul * .");
                    P14();
                    break;
                case 15:
                    System.out.println("15. Se citește de la tastatura un șir de caractere ce includ cuvinte despărțite prin spații. Să se extragă toate cuvintele din șir, fără a folosi metoda split.");
                    P15();
                    break;
                case 16:
                    System.out.println("16. Să se scrie un program care citeşte de la tastatură o propoziţie formată din mai multe cuvinte separate prin spaţii şi transformă prima literă a fiecărui cuvânt în literă mare.");
                    P16();
                    break;
                case 17:
                    System.out.println("17. Se citeste de la tastatura un sir de caractere. Să se determine câte vocale conține acest șir.");
                    P17();
                    break;
                case 18:
                    System.out.println("18. Să se scrie un program care citeşte un şir de caractere format din litere mici ale alfabetului englez şi înlocuieşte fiecare consoană cu litera mare corespunzătoare.");
                    P18();
                    break;
                case 19:
                    System.out.println("19. Să se scrie un program care verifică dacă două cuvinte date sunt anagrame. Două cuvinte sunt anagrame dacă sunt formate din aceleași litere.");
                    P19();
                    break;
                case 20:
                    System.out.println("20. Să se scrie un program ce va afișa pe ecran conținutul unui fișier text.");
                    P20();
                    break;
                case 21:
                    System.out.println("21. Se citește dintr-un fișier un șir de n numere întregi. Pe prima linie a fișierului este dat numărul de numere, apoi pe a doua linie sunt date, despărțite prin spații, cele n numere. Să se calculeze suma lor și să se afișeze pe ecran.");
                    P21();
                    break;
                case 22:
                    System.out.println("22. Pe fiecare rând dintr-un fișier se găsesc cuvinte. Să se determine care este cel mai lung cuvânt, și care este cea mai des utilizată litera. Litera mare și litera mică se consideră identice.");
                    P22();
                    break;
                case 23:
                    System.out.println("23. Se citește dintr-un fișier un text. Să se creeze un alt fișier în care literele mici sa fie transformate în litere mari iar literele mari în litere mici.");
                    P23();
                    break;
                case 24:
                    System.out.println("24. Se citește dintr-un fișier un text format din litere mari și mici ale alfabetului englez, cifre, spații și semne de punctuație. Determinați vocala din șir cu număr maxim de apariții (A si a se considera aceeași vocală).");
                    P24();
                    break;
                default:
                    System.out.println("Invalid problem number.");
                    break;
            }
        } catch (Exception e) {
        }
    }

    // region vectori

    public static void P1() throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(reader.readLine());
        var vec = new int[n];
        for (int i = 0; i < n; ++i)
            vec[i] = Integer.parseInt(reader.readLine());
        sort(vec);
        System.out.println(vec[0]);
    }

    public static void P2() throws IOException {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var A = new int[n];
        var B = new int[m];
        var inters = new int[n <= m ? n : m];
        for (int i = 0; i < n; ++i)
            A[i] = scanner.nextInt();
        for (int i = 0; i < m; ++i)
            B[i] = scanner.nextInt();

        var nr = 0;
        for (var el : A)
            if (findElem(B, el) && !findElem(inters, el))
                inters[nr++] = el;

        for (int i = 0; i < nr; ++i)
            System.out.print(inters[i] + " ");
        System.out.println();
    }

    public static void P3() throws IOException {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var A = new int[n];
        var B = new int[m];
        var inters = new int[n <= m ? n : m];
        for (int i = 0; i < n; ++i)
            A[i] = scanner.nextInt();
        for (int i = 0; i < m; ++i)
            B[i] = scanner.nextInt();

        var nr = 0;
        for (var el : A)
            if (!findElem(B, el) && !findElem(inters, el))
                inters[nr++] = el;

        for (int i = 0; i < nr; ++i)
            System.out.print(inters[i] + " ");
        System.out.println();
    }

    public static void P4() throws IOException {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var vec = new int[n];
        for (int i = 0; i < n; ++i)
            vec[i] = scanner.nextInt();

        for (int i = 1; i < n; ++i)
            if (vec[i - 1] > vec[i]) {
                System.out.println("Elementele nu sunt in ordine crescatoare");
                return;
            }
        System.out.println("Elementele sunt in ordine crescatoare");
    }

    public static void P5() throws IOException {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var x = new int[n];
        var y = new int[n];
        for (int i = 0; i < n; ++i)
            x[i] = scanner.nextInt();

        int nr = 0;
        for (var el : x)
            if (el > 0)
                y[nr++] = el;

        for (int i = 0; i < nr; ++i)
            System.out.print(y[i] + " ");
    }

    public static void P6() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var x = new int[n];
        var y = new int[n];
        for (int i = 0; i < n; ++i)
            x[i] = scanner.nextInt();

        int nr = 0;
        for (var el : x)
            if (el * el == Math.sqrt(el))
                y[nr++] = el;

        for (int i = 0; i < nr; ++i)
            System.out.print(y[i] + " ");
    }

    //endregion

    // region matrice

    public static void P7() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var sum = 0;
        var A = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j) {
                A[i][j] = scanner.nextInt();
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1)
                    sum += A[i][j];
            }
        System.out.println("Suma elem aflate pe marginea tabloului: " + sum);
    }

    public static void P8() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        int sum = 0, prod = 1, nrPoz = 0, nrNule = 0;
        var A = new int[n][m];
        var elem = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                A[i][j] = scanner.nextInt();

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j) {
                if (A[i][j] > 0) {
                    if ((i + 1) % 2 == 0 && (j + 1) % 2 == 1)
                        prod *= A[i][j];
                    if (A[i][j] % 2 == 1)
                        sum += A[i][j];
                    nrPoz++;
                } else if (A[i][j] == 0)
                    nrNule++;
                if ((i + 1) % 2 == 1 && (j + 1) % 3 == 0)
                    elem.add(A[i][j]);
            }

        System.out.println("Produsul elementelor pozitive aflate pe linii pare și coloane impare: " + prod);
        System.out.println("Suma elementelor pozitive impare din matrice: " + sum);
        System.out.println("Numărul elementelor pozitive: " + nrPoz);
        System.out.println("Numărul elementelor negative: " + (n * m - nrPoz - nrNule));
        System.out.println("Numărul elementelor nule: " + nrNule);
        System.out.print("Elementele aflate pe linii impare și coloane divizibile cu 3: ");
        for (var el : elem)
            System.out.print(el + " ");
        System.out.println();
    }

    public static void P9() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var A = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                A[i][j] = scanner.nextInt();

        System.out.print("Elementul cautat x: ");
        var x = scanner.nextInt();
        System.out.println("Elementul " + x + " apare de " + CountApp(A, n, m, x) + " ori");
    }

    public static void P10() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var A = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                A[i][j] = scanner.nextInt();

        var max = 0;
        for (int i = 0; i < n; ++i) {
            var cnt = CountApp(A[i], m, 1);
            if (max < cnt)
                max = cnt;
        }
        System.out.println("Numărul maxim de elemente egale cu 1 conținute pe o linie: " + max);
    }

    public static void P11() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var A = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                A[i][j] = scanner.nextInt();

        var lines = new ArrayList<Integer>();
        var max = 0;
        for (int i = 0; i < n; ++i) {
            var cnt = m - CountApp(A[i], m, 0);
            if (max < cnt) {
                max = cnt;
                lines = new ArrayList<>();
                lines.add(i);
            } else if (max == cnt)
                lines.add(i);
        }
        System.out.print("Lliniile din matrice care conțin cele mai multe elemente nenule: ");
        for (var line : lines)
            System.out.print(line + " ");
    }

    public static void P12() {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var A = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                A[i][j] = scanner.nextInt();

        var lines = new ArrayList<Integer>();
        var max = 0;
        for (int i = 0; i < n; ++i) {
            var cnt = CountUnique(A[i], m);
            if (max < cnt) {
                max = cnt;
                lines = new ArrayList<>();
                lines.add(i);
            } else if (max == cnt)
                lines.add(i);
        }
        System.out.print("Liniile din matrice care conțin cele mai multe elemente distincte: ");
        for (var line : lines)
            System.out.print(line + " ");
    }

    // endregion

    // region siruri de caractere

    public static void P13() {
        var scanner = new Scanner(System.in);
        var sir1 = scanner.nextLine();
        var sir2 = scanner.nextLine();
        System.out.println("Numarul de aparitii al sirului \"" + sir2 +
                "\" in \"" + sir1 + "\" este: " + sir1.split(sir2).length);
    }

    public static void P14() throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var S = reader.readLine();
        var C = (char) reader.read();
        System.out.println(S.replace(C, '*'));
    }

    public static void P15() {
        var scanner = new Scanner(System.in);
        var sir = scanner.nextLine();
        var cuvinte = new ArrayList<String>();

        var i = sir.indexOf(' ');
        while (i != -1) {
            cuvinte.add(sir.substring(0, i));
            sir = sir.substring(i + 1, sir.length());
            i = sir.indexOf(' ');
        }
        cuvinte.add(sir);

        for (var s : cuvinte)
            System.out.println(s);
    }

    public static void P16() {
        var scanner = new Scanner(System.in);
        var sir = scanner.nextLine();
        var cuvinte = sir.split("\\s+");

        for (int i = 0; i < cuvinte.length; ++i)
            cuvinte[i] = cuvinte[i].substring(0, 1).toUpperCase() + cuvinte[i].substring(1);

        for (var s : cuvinte)
            System.out.println(s);
    }

    public static void P17() {
        var scanner = new Scanner(System.in);
        var sir = scanner.nextLine();
        var vowels = "aeiouAEIOU";
        var nrV = 0;
        for (var i = 0; i < sir.length(); ++i) {
            if (vowels.indexOf(sir.charAt(i)) != -1)
                nrV++;
        }
        System.out.println("Nr de vocale: " + nrV);
    }

    public static void P18() {
    }

    public static void P19() {
    }

    // endregion

    // region fisiere

    public static void P20() throws IOException {
        int ch;
        var text = "";
        var file = new FileReader("file1.txt");

        while ((ch = file.read()) != -1)
            text = text + (char) ch;
        System.out.println(text);

        file.close();
    }

    public static void P21() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
        var n = Integer.parseInt(br.readLine());
        var strNumbers = br.readLine().split(" ");
        br.close();

        var vec = new int[n];
        for (int i = 0; i < n; ++i)
            vec[i] = Integer.parseInt(strNumbers[i]);
        var sum = 0;

        for (var el : vec)
            sum += el;

        System.out.print("\nElementele citite: ");
        for (var el : vec)
            System.out.print(el + " ");
        System.out.println("\nSuma elementelor citite este: " + sum);

    }

    public static void P24() throws IOException {
        int ch;
        var text = "";
        var file = new FileReader("file1.txt");

        while ((ch = file.read()) != -1)
            text = text + (char) ch;
        file.close();

        var vocale = "aeiouAEIOU";
        var vocala = '\0';
        var maxApp = 0;
        for (int i = 0; i < text.length(); ++i) {
            var v = text.charAt(i);
            var cnt = CountAppIgnoreCase(text, v);
            if ((vocale.indexOf(v) != -1) &&
                    (maxApp < cnt)) {
                vocala = v;
                maxApp = cnt;
            }
        }
        System.out.println("Vocala din sir cu nr maxim de aparitii este: " + vocala);
    }

    public static void P22() {
    }

    public static void P23() {
    }

    // endregion

    // region functions

    public static boolean findElem(int[] arr, int k) {
        for (var el : arr)
            if (el == k)
                return true;
        return false;
    }

    private static int CountApp(int[][] A, int n, int m, int x) {
        var cnt = 0;
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                if (A[i][j] == x)
                    cnt++;
        return cnt;
    }

    private static int CountApp(int[] vec, int n, int x) {
        var cnt = 0;
        for (int i = 0; i < n; ++i)
            if (vec[i] == x)
                cnt++;
        return cnt;
    }

    private static int CountAppIgnoreCase(String str, char k) {
        var cnt = 0;
        var k1 = Character.toLowerCase(k);
        var k2 = Character.toUpperCase(k);
        for (int i = 0; i < str.length(); ++i)
            if (str.charAt(i) == k1 || str.charAt(i) == k2)
                cnt++;
        return cnt;
    }

    private static int CountUnique(int[] vec, int n) {
        var unique = n;
        sort(vec);
        for (int i = 1; i < n; ++i)
            if (vec[i] == vec[i - 1])
                unique--;
        return unique;
    }

    // endregion

}
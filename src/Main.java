import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tytuł: ");
        String tytul = scanner.nextLine();
        System.out.print("Podaj treść: ");
        String tresc = scanner.nextLine();
        Notatka notatka = new Notatka(tytul, tresc);
        notatka.wyswietlTytultresc();
        notatka.wyswietlWszystkiePola();

        System.out.print("Podaj tytuł: ");
        String tytul2 = scanner.nextLine();
        System.out.print("Podaj treść: ");
        String tresc2 = scanner.nextLine();
        Notatka notatka2 = new Notatka(tytul2, tresc2);
        notatka2.wyswietlTytultresc();
        notatka2.wyswietlWszystkiePola();


    }
}
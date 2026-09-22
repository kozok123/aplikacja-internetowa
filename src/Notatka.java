public class Notatka {
    private static int liczbaNotatek;
    private int id;
    protected String tytul;
    protected String tresc;

    public Notatka(String tytul, String tresc) {
        this.tytul = tytul;
        this.tresc = tresc;
        liczbaNotatek++;
        id = liczbaNotatek;
    }

    public void wyswietlTytultresc() {
        System.out.println(tytul);
        System.out.println(tresc);
        System.out.println();

    }

    public void wyswietlWszystkiePola() {
        System.out.println("liczba notatek: "+ liczbaNotatek);
        System.out.println("id: "+ id);
        System.out.println("tytuł: "+ tytul);
        System.out.println("treść: "+ tresc);


    }
}

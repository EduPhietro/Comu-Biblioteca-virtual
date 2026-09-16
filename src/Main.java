public class Main{

    public static void main(String[] args){
        Livro harryPotter = new Livro(
                "Harry Potter e a pedra filosofal",
                "JK Rowling",
                "SciFi",
                "1ed",
                197,
                1997,
                true,
                9,
                9,
                "091231");

        Livro asAventurasDeTimTim = new Livro(
                "As Aventuras De Tintim: A Orelha Lascada",
                "Hergé",
                "SciFi",
                "1ed",
                53,
                1997,
                true,
                9,
                9,
                "9788525062567");

        harryPotter.introduce();
        asAventurasDeTimTim.introduce();
    }
}
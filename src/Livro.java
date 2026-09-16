import java.util.Date;

public class Livro {
    String titulo;
    String autor;
    String genero;
    String edicao;
    int qtdPaginas;
    int anoPublicacao;
    boolean isDisponivel;
    double nota;
    double media;
    String isbn;

    Livro(
            String titulo,
            String autor,
            String genero,
            String edicao,
            int qtdPaginas,
            int anoPublicacao,
            boolean isDisponivel,
            double nota,
            double media,
            String isbn
    ){
          this.titulo = titulo;
          this.autor = autor;
          this.genero = genero;
          this.edicao = edicao;
          this.qtdPaginas = qtdPaginas;
          this.anoPublicacao = anoPublicacao;
          this.isDisponivel = isDisponivel;
          this.nota = nota;
          this.media = media;
          this.isbn = isbn;


    }


    public void introduce(){
        IO.println("============FICHA CATALOGRÁFRICA============");
        IO.println("Titulo: " + this.titulo);
        IO.println("Autor: " + this.autor);
        IO.println("Genero: " + this.genero);
        IO.println("Edicao: " + this.edicao);
        IO.println("Quantidade de Paginas: " + this.qtdPaginas);
        IO.println("Ano de Publicacao: " + this.anoPublicacao);
        IO.println("Está Disponível: " + (this.isDisponivel ? "Sim": "Não"));
        IO.println("Nota: " + this.nota);
        IO.println("Media: " + this.media);
        IO.println("ISBN: " + this.isbn);
        IO.println();
    }

}

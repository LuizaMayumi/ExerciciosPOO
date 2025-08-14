public class Musica {
    public String titulo;
    public String artista;
    public int duracao;

    public Musica(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void exibirFichaTecnica(){
        System.out.println("Titulo: " + titulo + "\nArtista: " + artista + "\nDuracao: " + duracao);
    }

}

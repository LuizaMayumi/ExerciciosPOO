public class Produto {
//    Atributo
    public String nome;
    public String marca;
    public double preco;
    public double tamanho;
    public int unidade;

//    Metodo
//    STATIC nao usa POO, normalmente sera utilizado so na main
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
}

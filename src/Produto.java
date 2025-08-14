public class Produto {
//    Atributo
    public String nome;
    public String marca;
    public double preco;
    public double tamanho;
    public int unidade;
    public int estoque;

//    Metodo
//    STATIC nao usa POO, normalmente sera utilizado so na main
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }

    public void adicionarEstoque(int unidade){
        estoque += unidade;
        System.out.println("Unidades estocadas: " + estoque);
    }

    public void registrarVenda(int unidade) {
        if (estoque >= unidade) {
            estoque -= unidade;
            System.out.println("Unidades restantes: " + estoque);
        } else {
            System.out.println("Sem estoque");
        }
    }
}

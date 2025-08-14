public class Main {
    public static void main(String[] args) {

//        Produto prod1 = new Produto();
//        prod1.marca = "Thermos";
//        prod1.nome = "Garrafa termica";
//        prod1.unidade = 1;
//        prod1.tamanho = 250;
//        prod1.preco = 119.90;
//
//        prod1.mostrarInformacoes();

//        Carro meuCarro = new Carro(); //instanciar objeto
//        meuCarro.marca = "Volkswagen";
//        meuCarro.modelo = "Polo";
//        meuCarro.descricao = "Preto - 2025";

//        meuCarro.mostrarInformacoes();

//        Carro carro2 = new Carro(); //instanciar objeto
//        carro2.marca = "Honda";
//        carro2.modelo = "City";
//        carro2.descricao = "Azul - 2024";
//
//        carro2.mostrarInformacoes();


//        1
//        Musica minhaMusica = new Musica();
//        minhaMusica.titulo = "Bohemian Rhapsody";
//        minhaMusica.artista = "Queen";
//        minhaMusica.duracao = 355;
//
//        System.out.println("Tocando agora: " + minhaMusica.titulo);
//        System.out.println("Artista: " + minhaMusica.artista);

//        2
//        Carro meuCarro = new Carro(); //instanciar objeto
//        meuCarro.marca = "Volkswagen";
//        meuCarro.modelo = "Polo";
//        meuCarro.descricao = "Preto - 2025";

//        3
//        Aluno aluno1 = new Aluno();
//        aluno1.nota = 6.7;
//        aluno1.nome = "Teste 1";
//        aluno1.verificarStatus();
//
//        Aluno aluno2 = new Aluno();
//        aluno2.nota = 7;
//        aluno2.nome = "Teste 2";
//        aluno2.verificarStatus();


//        4
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.nomeTitular = "Luiza";
        contaBancaria1.saldo = 100;

        contaBancaria1.depositar(50);
        contaBancaria1.sacar(200);
        contaBancaria1.sacar(125);
        contaBancaria1.depositar(25);

        System.out.println("Saldo final: " + contaBancaria1.saldo);
    }
}
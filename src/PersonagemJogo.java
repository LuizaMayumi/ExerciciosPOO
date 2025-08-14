public class PersonagemJogo {
    String nome;
    int nivel;
    int pontosVida;

    public void receberDano(int dano){
        pontosVida -= dano;
        if (pontosVida > 0) {
            System.out.println("Resta(m) " + pontosVida + " pontos de vida");
        } else {
            System.out.println("Press F");
            pontosVida = 0;
        }
    }

    public void subirNivel(){
        nivel += 1;
    }

    public void exibirStatus(){
        System.out.println("Personagem " + nome + "\nNivel: " + nivel + "\nPontos de vida: " + pontosVida);
    }
}

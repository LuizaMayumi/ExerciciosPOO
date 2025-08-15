public class PersonagemJogo {
    private String nome;
    private int nivel;
    private int pontosVida;

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

    public void getNome(){
        System.out.println("Nome: " + nome);
    }

    public void getNivel(){
        System.out.println("Nivel: " + nivel);
    }

    public void getPontosDeVida(){
        System.out.println("Pontos de vida: " + pontosVida);
    }
}

public class Aluno {
    String nome;
    double nota;

    public void verificarStatus() {
        if (nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}

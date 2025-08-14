public class Aluno {
    public String nome;
    public double nota;

    public void verificarStatus() {
        if (nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}

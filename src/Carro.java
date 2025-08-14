public class Carro {
    public String descricao;
    public String marca;
    public String modelo;

    public Carro(String descricao, String marca, String modelo){
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacoes() {
        System.out.println("Descricao: " + descricao);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

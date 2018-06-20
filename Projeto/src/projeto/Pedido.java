package projeto;

public class Pedido {
    String nomep;
    int quantidadep;
    public Pedido(){}
    public Pedido(String nomep, int quantidadep){
        this.nomep = nomep;
        this.quantidadep = quantidadep;
    }
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
    public void setQuantidadep(int quantidadep) {
        this.quantidadep = quantidadep;
    }
    public String getNomep() {
        return nomep;
    }
    public int getQuantidadep() {
        return quantidadep;
    }
    
}

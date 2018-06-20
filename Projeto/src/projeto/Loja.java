package projeto;

public class Loja {
    String nomeloja;
    String cnpj;
    String endereçol;
    public Loja(){}
    public Loja(String nomeloja,String cnpj,String endereçol){
        this.nomeloja = nomeloja;
        this.cnpj = cnpj;
        this.endereçol = endereçol;
    }
    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereçol(String endereçol) {
        this.endereçol = endereçol;
    }
    public String getNomeloja() {
        return nomeloja;
    }
    public String getCnpj() {
        return cnpj;
    }
    public String getEndereçol() {
        return endereçol;
    }
    public void consultarLoja(){
        System.out.printf("6.Nome da loja: %s\n7.CNPJ: %s\n8.Endereço da Loja: %s\n", nomeloja, cnpj, endereçol);
    }
}

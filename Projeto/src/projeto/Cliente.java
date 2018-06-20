package projeto;

public class Cliente {
    String nome;
    String cpf;
    String email;
    String rg;
    String cep;
    public Cliente(){}
    public Cliente(String nome, String cpf, String email, String rg, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.rg = rg;
        this.cep = cep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getRg() {
        return rg;
    }
    public String getCep() {
        return cep;
    }
    public void consultarDados(){
        System.out.printf("1.Nome: %s\n2.CPF: %s\n3.E-mail: %s\n4.RG: %s\n5.CEP: %s\n", nome, cpf, email, rg, cep);
    }
}

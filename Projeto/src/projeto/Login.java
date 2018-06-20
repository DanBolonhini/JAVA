package projeto;

public class Login {
    String login;
    String senha;
    public Login(){}
    public Login(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    
}

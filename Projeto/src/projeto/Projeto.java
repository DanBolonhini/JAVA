package projeto;
import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, cont=0;
        Cliente dados = new Cliente();
        Mensagens mensagem = new Mensagens();
        Loja loja = new Loja();
        Pedido peça = new Pedido();
        Login conta = new Login();
        Agendamento data = new Agendamento();
        
        mensagem.mensagemCadastroLogin();
        mensagem.mensagemLogin();
        conta.login = leia.nextLine();
        mensagem.mensagemSenha();
        conta.senha = leia.nextLine();
        mensagem.mensagemCadastroCliente();
        mensagem.mensagemNome();
        dados.nome = leia.nextLine();
        mensagem.mensagemCpf();
        dados.cpf = leia.nextLine();
        mensagem.mensagemEmail();
        dados.email = leia.nextLine();
        mensagem.mensagemRg();
        dados.rg = leia.nextLine();
        mensagem.mensagemCep();
        dados.cep = leia.nextLine();
        mensagem.cadastroConcluido();
        mensagem.mensagemCadastroLoja();
        n2 = leia.nextInt();
        if (n2 != 0){
            mensagem.mensagemNomeLoja();
            leia.nextLine();
            loja.nomeloja = leia.nextLine();
            mensagem.mensagemCnpj();
            loja.cnpj = leia.nextLine();
            mensagem.mensagemEndereçoLoja();
            loja.endereçol = leia.nextLine();
            mensagem.cadastroConcluido();
        }
        mensagem.mensagemPeça();
        peça.nomep = leia.nextLine();
        mensagem.mensagemPeçaQuant();
        peça.quantidadep = leia.nextInt();
        do{
            mensagem.mensagemAlterarDados();
            dados.consultarDados();
            if (n2 != 0){
                loja.consultarLoja();
            }
            mensagem.mensagemAlterarDados9();
            n1 = leia.nextInt();
            switch(n1){
                case 1:
                    mensagem.mensagemNome();
                    leia.nextLine();
                    dados.nome = leia.nextLine();
                    break;
                case 2:
                    mensagem.mensagemCpf();
                    leia.nextLine();
                    dados.cpf = leia.nextLine();
                    break;
                case 3:
                    mensagem.mensagemEmail();
                    leia.nextLine();
                    dados.email = leia.nextLine();
                    break;
                case 4:
                    mensagem.mensagemRg();
                    leia.nextLine();
                    dados.rg = leia.nextLine();
                    break;
                case 5:
                    mensagem.mensagemCep();
                    leia.nextLine();
                    dados.cep = leia.nextLine();
                    break;
                case 6:
                    mensagem.mensagemNomeLoja();
                    leia.nextLine();
                    loja.nomeloja = leia.nextLine();
                    break;
                case 7:
                    mensagem.mensagemCnpj();
                    leia.nextLine();
                    loja.cnpj = leia.nextLine();
                    break;
                case 8:
                    mensagem.mensagemEndereçoLoja();
                    leia.nextLine();
                    loja.endereçol = leia.nextLine();
                    break;
            }
        }while(n1 != 9);
        mensagem.mensagemAgendamento();
        mensagem.mensagemDia();
        data.dia = leia.nextInt();
        mensagem.mensagemMes();
        data.mes = leia.nextInt();
        mensagem.mensagemAno();
        data.ano = leia.nextInt();
        mensagem.pedidoRegistrado();
    }
    
}

package email;
public class TesteEmail {

    static boolean testar_email_com_arroba() {
        return Pessoa.emailValid("email_teste@dominio.com.br") == true;
    }

    static boolean testar_email_sem_arroba() {
        return Pessoa.emailValid("email_testedominio.com.br") == false;
    }

    static boolean testar_email_mais_50_caracteres() {
        return Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br") == false;
    }

}

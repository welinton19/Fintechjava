package batista.gomes.welinton.Logar;

public class Cadastra {
     String nomeCompleto;
     String cpf;
     String estado;
     String cidade;
     String dataNasc;
     String cep;

    public Cadastra() {

    }

     public Cadastra( String nomeCompleto, String cpf, String estado, String cidade, String dataNasc, String cep ){
         this.nomeCompleto = nomeCompleto;
         this.cpf = cpf;
         this.estado = estado;
         this.cidade = cidade;
         this.dataNasc = dataNasc;
         this.cep = cep;
     }


}

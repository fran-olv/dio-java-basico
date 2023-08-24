import java.util.Date;

public class OperadoresMatematicos {
    public static void main(String[] args) throws Exception {
        //atribuição
        String nome = "Fran";
        int idade = 15;
        double peso = 70.5;
        char sexo = 'F';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //aritmético
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //concatenação + com valores string
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; //31

        concatenacao = 1+1+1+"1"; //?
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; //31

        concatenacao = 1+"1"+1+"1"; //1111

        concatenacao = "1"+1+1+1; //1111

        concatenacao = "1"+(1+1+1);

    }
}

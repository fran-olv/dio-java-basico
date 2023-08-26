package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;

        do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}

    }

    //método auxiliar de forma randomica 
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void imprimirSelecionado(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice=0; indice <candidatos.length;indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
        }


        System.out.println("forma interacao for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi" + candidato);

        }
    }

    // Método que simula o valor pretendido seta de forma aleatoria. 
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void selecionaCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionado = 0;
        int candidatoAtual = 0;

        double salarioBase = 2000.0;


        while(candidatosSelecionado<5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            
            System.out.println("O candidato" + candidato + "solicitou esse valor de salario " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.err.println("O candidato" +candidato+ "foi selecionado para a vaga");
                candidatosSelecionado++;
            }
            candidatoAtual++;         
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        }



    }
}

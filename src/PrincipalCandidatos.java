import java.util.Scanner;

public class PrincipalCandidatos {
	public static void main(String[] args) {
		
	    int tamanhoArray = (int) (Math.random() * 100) + 1;
	    Candidato[] candidatos = new Candidato[tamanhoArray];


	    for (int i = 0; i < candidatos.length; i++) {
	        String nome = "Candidato " + (i + 1);
	        String partido = "Partido " + (int) (Math.random() * 10);
	        int intencoesVoto = (int) (Math.random() * 1000);
	        candidatos[i] = new Candidato(nome, partido, intencoesVoto);
	    }

	    Candidato.ordenarCandidatosInsercaoDireta(candidatos);

	    System.out.println("Candidatos ordenados:");
	    for (Candidato candidato : candidatos) {
	        System.out.println(candidato);
	    }

	    Scanner scanner = new Scanner(System.in);
	    System.out.println("\nDigite o nome do candidato a ser procurado:");
	    String nomeCandidato = scanner.nextLine();

	    int posicaoEncontrada = pesquisaBinariaCandidatos(candidatos, nomeCandidato);

	    if (posicaoEncontrada == -1) {
	        System.out.println("Candidato não encontrado.");
	    } else {
	        System.out.println("Candidato encontrado:");
	        System.out.println(candidatos[posicaoEncontrada]);
	    }
	}

	private static int pesquisaBinariaCandidatos(Candidato[] candidatos, String nomeCandidato) {
	    int inicio = 0;
	    int fim = candidatos.length - 1;
	    while (inicio <= fim) {
	        int meio = (inicio + fim) / 2;
	        String nomeMeio = candidatos[meio].getNome();
	        if (nomeMeio.equals(nomeCandidato)) {
	            return meio;
	        } else if (nomeMeio.compareTo(nomeCandidato) < 0) {
	            inicio = meio + 1;
	        } else {
	            fim = meio - 1;
	        }
	    }
	    return -1;
	}




	

}
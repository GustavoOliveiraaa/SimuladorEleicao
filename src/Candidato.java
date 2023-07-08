public class Candidato {
    private String nome;
    private String partido;
    private int intencoesDeVoto;

    public Candidato(String nome, String partido, int intencoesDeVoto) {
        this.nome = nome;
        this.partido = partido;
        this.intencoesDeVoto = intencoesDeVoto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getIntencoesDeVoto() {
        return intencoesDeVoto;
    }

    public void setIntencoesDeVoto(int intencoesDeVoto) {
        this.intencoesDeVoto = intencoesDeVoto;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", partido='" + partido + '\'' +
                ", intencoesDeVoto=" + intencoesDeVoto +
                '}';
    }

	public static void ordenarCandidatosInsercaoDireta(Candidato[] candidatos) {
		// TODO Auto-generated method stub
		
	}
}

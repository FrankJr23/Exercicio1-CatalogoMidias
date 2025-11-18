public class Filme {
    private String titulo;
    private String diretor;
    private String genero;
    private int ano;
    private double avaliacao;

    public Filme(String titulo, String diretor, String genero, int ano, double avaliacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Filme ---");
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Gênero:" + genero);
        System.out.println("Ano de Lançamento: " + ano);
        String avaliacaoFormatada = String.format("%.1f", Math.min(10.0, Math.max(0.0, avaliacao)));
        System.out.println("Avaliação (0-10): " + avaliacaoFormatada);
        System.out.println("--------------------------");
    }
}
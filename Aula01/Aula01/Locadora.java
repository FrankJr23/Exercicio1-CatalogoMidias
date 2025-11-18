public class Locadora {
    public static void main(String[] args) {
        
        Filme filme1 = new Filme (
            
        "O Poderoso Chefão",
        "Francis Ford Coppola",
        "Suspense",
        1972,
        9.2);

        Filme filme2 = new Filme ("A Origem", "Christopher Nolan", "Ficção Cientifica", 2010, 8.8);

        System.out.println("🎬 Exibindo detalhes do Filme 1:");
        filme1.exibirDetalhes();

        System.out.println("\n🎬 Exibindo detalhes do Filme 2:");
        filme2.exibirDetalhes();
    }
}
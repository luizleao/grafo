public class Start {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        grafo.criaGrafo(3, 4, false);
        grafo.insereAresta(grafo, 0, 1, false, 0);
        grafo.insereAresta(grafo, 1, 1, false, 0);
        grafo.verGrafo(grafo);

    }
}
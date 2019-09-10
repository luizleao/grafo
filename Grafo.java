public class Grafo {
    private boolean flagPonderado;
    private int numVertices;
	private int grauMax;
	private int[][] arestas;
	private float[][] pesos;
	private int[] grau;
    
    public Grafo(){

    }

    public Grafo criaGrafo(int numVertices, int grauMax, boolean flagPonderado){
		int i;
		this.numVertices = numVertices;
		this.grauMax = grauMax;
		this.flagPonderado = (flagPonderado) ? true : false;
		this.grau = new int[numVertices];
		this.arestas = new int[numVertices][numVertices];
		this.pesos = new float[numVertices][numVertices];
		
		return this;
	}
	
	public boolean insereAresta(Grafo grafo, int origem, int destino, boolean flagDigrafo, float peso){
		if(grafo == null)
			return false;
		if(origem < 0 || origem >= grafo.getNumVertices())
			return false;
		if(destino < 0 || destino >= grafo.getNumVertices())
			return false;
	
		grafo.arestas[origem][grafo.grau[origem]] = destino;
		if(grafo.flagPonderado)
			grafo.pesos[origem][grafo.grau[origem]] = peso;
		
		grafo.grau[origem]++;
		
		if(flagDigrafo)
			insereAresta(grafo, destino, origem, true, peso);
		
		return true;
	}
	
	public void verGrafo(Grafo grafo){
		System.out.println("Num de Vertices: "+grafo.numVertices);
		System.out.println("Grau Máximo: "+grafo.grauMax);
		System.out.println("Ponderado: "+((grafo.flagPonderado) ? "Sim" : "Não"));
	

		for(int i=0; i<numVertices; i++)
			System.out.println("Grau do vértice ["+i+"]: "+grafo.grau[i]);	
		
		for(int i=0; i<numVertices; i++)
			for(int j=0; j<numVertices; j++)
				System.out.println("Arestas ["+i+"]["+j+"]: "+grafo.arestas[i][j]);	
		if(grafo.flagPonderado)
			for(int i=0; i<numVertices; i++)
				for(int j=0; j<numVertices; j++)
					System.out.println("Pesos ["+i+"]["+j+"]: "+grafo.pesos[i][j]);	
	}

	public void setFlagPonderado(boolean flagPonderado) {
		this.flagPonderado = flagPonderado;
	}

	public void setArestas(int[][] arestas) {
		this.arestas = arestas;
	}

	public boolean getFlagPonderado() {
		return flagPonderado;
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int[][] getArestas() {
		return arestas;
	}

	public int[] getGrau() {
		return grau;
	}

	public int getGrauMax() {
		return grauMax;
	}

	public float[][] getPesos() {
		return pesos;
	}
}
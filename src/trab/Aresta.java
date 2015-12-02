package trab;

public class Aresta {

    private String idAresta;
    private Vertice origem;
    private Vertice destino;
    

    public Aresta(String idAresta, Vertice origem, Vertice destino) {
        this.idAresta = idAresta;
        this.origem = origem;
        this.destino = destino;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public String getIdAresta() {
        return idAresta;
    }

    public void setIdAresta(String idAresta) {
        this.idAresta = idAresta;
    }

}


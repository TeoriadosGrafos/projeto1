
package teoriadosgrafos;


public class Disciplina {
    
    private int periodo;
    private int ano;

    public Disciplina(int periodo, int ano) {
        this.periodo = periodo;
        this.ano = ano;
    }

    
    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}

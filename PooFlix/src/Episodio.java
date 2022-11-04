public class Episodio {
    
    private int id;
    private String titulo;
    private String resumo;
    private int temporada;

    
    public Episodio(int id, int temporada, String titulo){
        this.id = id;
        this.temporada = temporada;
        this.titulo = titulo;

    }

    public int getId() {
        return id;
    }

    public int getTemporada() {
        return temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        if(resumo == null){
            System.out.println("Não há descrição ainda... Que tal criar uma?");
            return "";
        }
        else{
            return resumo;
        }
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

}

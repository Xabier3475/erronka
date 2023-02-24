public class Kategoria {
    private int id;
    private String izena;

    public Kategoria(){}

    public Kategoria(int id,String izena){
        this.id=id;
        this.izena=izena;
    }
    
    public int getId(){
        return this.id;
    }
      
    public void setId(int id){
        this.id = id;
    }

    public String getIzena(){
        return this.izena;
    }
      
    public void setIzena(String izena){
        this.izena = izena;
    }

    @Override
    public String toString(){
        return ("Kategoria: Id= "+this.id+" Izena= "+this.izena);
    }
}

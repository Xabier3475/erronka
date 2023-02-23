public class Kontinente {
    private int id;
    private String izena;

    public Kontinente(){}

    public Kontinente(int id,String izena){
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
        return ("Kontinente: Id= "+this.id+" Izena= "+this.izena);
    }
}

public class Herrialde {
    private String id;
    private String izena;
    private int id_kontinente;
    
    public Herrialde(){}

    public Herrialde(String id,String izena,int id_kontinente){
        this.id=id;
        this.izena=izena;
        this.id_kontinente=id_kontinente;
    }

    public String getId(){
        return this.id;
    }
      
    public void setId(String id){
        this.id = id;
    }

    public String getIzena(){
        return this.izena;
    }
      
    public void setIzena(String izena){
        this.izena = izena;
    }

    public int getId_Kontinente(){
        return this.id_kontinente;
    }
      
    public void setId_Kontinente(int id_kontinente){
        this.id_kontinente = id_kontinente;
    }

    @Override
    public String toString(){
        return ("Herrialde: Id= "+this.id+" Izena= "+this.izena+" Id_Kontienente= "+this.id_kontinente);
    }
}

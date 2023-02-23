public class Eskari_Egoera {
    private int id;
    private String deskribapena;

    public Eskari_Egoera(){}

    public Eskari_Egoera(int id,String deskribapena){
        this.id=id;
        this.deskribapena=deskribapena;
    }
    public int getId(){
        return this.id;
    }
      
    public void setId(int id){
        this.id = id;
    }
    
    public String getDeskribapena(){
        return this.deskribapena;
    }
      
    public void setDeskribapena(String deskribapena){
        this.deskribapena = deskribapena;
    }

    @Override
    public String toString(){
        return ("Eskari_Egoera: Id="+this.id+" Deskribapena= "+this.deskribapena);
    }
}

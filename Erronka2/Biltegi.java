public class Biltegi {
    private int id;
    private String izena;
    private int id_kokaleku;

    public Biltegi(){}

    public Biltegi(int id,String izena,int id_kokaleku){
      this.id=id;
      this.izena=izena;
      this.id_kokaleku=id_kokaleku;
    }
    
    public int getId(){
       return this.id;
    }
    
    public void setId(int id){
       this.id=id;
    }
    
    public String getIzena(){
        return this.izena;
    }
     
     public void setIzena(String izena){
        this.izena=izena;
    }
   
    public int getId_Kokaleku(){
        return this.id_kokaleku;
     }
     
     public void setId_Kokkaleku(int id_kokaleku){
        this.id_kokaleku=id_kokaleku;
     }

    @Override
    public String toString(){
       return("Biltegi:  Id-a= " + this.id +" Izena= " + this.izena + " Id_Kokaleku= " + this.id_kokaleku);
    } 
}

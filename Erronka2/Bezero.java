public class Bezero{
    private String izena;
    private String abizena;
    private int id;
    private String helbidea;
    private String email;
    
    public Bezero(){}

    public Bezero(int id,String izena,String abizena,String helbidea,String email){
      this.id=id;
      this.izena=izena;
      this.abizena=abizena;
      this.helbidea=helbidea;
      this.email=email;
    }
    public String getIzena(){
       return this.izena;
    }
    
    public void setIzena(String izena){
       this.izena=izena;
    }
    
    public String getAbizena(){
       return this.abizena;
    }
    
    public void setAbizena(String abizena){
       this.abizena=abizena;
    }
    
    public int getId(){
       return this.id;
    }
    
    public void setId(int id){
       this.id=id;
    }
    
    public String getHelbidea(){
       return this.helbidea;
    }
    
    public void setHelbidea(String helbidea){
       this.helbidea=helbidea;
    }
    
    public String getEmail(){
       return this.email;
    }
    
    public void setEmail(String email){
       this.email=email;
    }

    @Override
    public String toString(){
       return("Bezeroa:  NAN-a= " + this.id +"Izena= " + this.izena + " Abizena= " + this.abizena + " Helbidea= " + this.helbidea + " Email= " + this.email);
    }
 }
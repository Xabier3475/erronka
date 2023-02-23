public class Kokaleku {
    private int id;
    private String helbidea;
    private String postakodea;
    private String udalerria;
    private String probintzia;
    private String id_herrialde;
    
    public Kokaleku(){}

    public Kokaleku(int id,String helbidea,String postakodea,String udalerria,String probintzia,String id_herrialde){
        this.id=id;
        this.helbidea=helbidea;
        this.postakodea=postakodea;
        this.udalerria=udalerria;
        this.probintzia=probintzia;
        this.id_herrialde=id_herrialde;
    }

    public int getId(){
        return this.id;
    }
      
    public void setId(int id){
        this.id = id;
    }

    public String getHelbidea(){
        return this.helbidea;
    }
      
    public void setHelbidea(String helbidea){
        this.helbidea = helbidea;
    }

    public String getPostakodea(){
        return this.postakodea;
    }
      
    public void setPostakodea(String postakodea){
        this.postakodea = postakodea;
    }
    
    public String getUdalerria(){
        return this.udalerria;
    }
      
    public void setUdalerria(String udalerria){
        this.udalerria = udalerria;
    }
    
    public String getProbintzia(){
        return this.probintzia;
    }
      
    public void setProbintzia(String probintzia){
        this.probintzia = probintzia;
    }
       
    public String getId_Herrialde(){
        return this.id_herrialde;
    }
      
    public void setId_Herrialde(String id_herrialde){
        this.id_herrialde = id_herrialde;
    }

    @Override
    public String toString(){
        return ("Kokaleku: Id= "+this.id+" Helbidea= "+this.helbidea+" Postakodea= "+this.postakodea+" Udalerria= "+this.udalerria+" Probintzia= "+this.probintzia+" Id_Herrialde= "+this.id_herrialde);
    }
}

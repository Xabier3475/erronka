public class Inbentario {
    private int id_produktu;
    private int id_biltegi;
    private int kopurua;
    
    public int getId_Produktu(){
        return this.id_produktu;
    }
      
    public void setId_Produktu(int id_produktu){
        this.id_produktu = id_produktu;
    }

    public int getId_Biltegi(){
        return this.id_biltegi;
    }
      
    public void setId_Biltegi(int id_biltegi){
        this.id_biltegi = id_biltegi;
    }

    public int getKopurua(){
        return this.kopurua;
    }
      
    public void setKopurua(int kopurua){
        this.kopurua = kopurua;
    }
}

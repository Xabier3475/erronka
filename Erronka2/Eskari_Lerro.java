public class Eskari_Lerro {
    private int id_ekari;
    private int id_lerro;
    private int id_produktu;
    private int kopurua;
    private double salneurria;

    public Eskari_Lerro(){}

    public Eskari_Lerro(int id_eskari,int id_lerro,int id_produktu,int kopurua,double salneurria){
        this.id_ekari=id_eskari;
        this.id_lerro=id_lerro;
        this.id_produktu=id_produktu;
        this.kopurua=kopurua;
        this.salneurria=salneurria;
    }

    public int getId_Eskari(){
        return this.id_ekari;
    }
      
    public void setId_Eskari(int id_eskari){
        this.id_ekari = id_eskari;
    }

    public int getId_Lerro(){
        return this.id_lerro;
    }
      
    public void setId_Lerro(int id_lerro){
        this.id_lerro = id_lerro;
    }

    public int getId_Produktu(){
        return this.id_produktu;
    }
      
    public void setId_Produktu(int id_produktu){
        this.id_produktu = id_produktu;
    }

    public int getKopurua(){
        return this.kopurua;
    }
      
    public void setKopurua(int kopurua){
        this.kopurua = kopurua;
    }

    public double getSalneurria(){
        return this.salneurria;
    }
      
    public void setSalneurria(double salneurria){
        this.salneurria = salneurria;
    }

    @Override
    public String toString(){
        return ("Eskari_Lerroa: Id_Eskari= "+this.id_ekari+" Id_Lerro= "+this.id_lerro+" Id_Produktu= "+this.id_produktu+" Kopurua= "+this.kopurua+" Salneurria "+this.salneurria);
    }
}

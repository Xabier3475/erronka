import javax.xml.bind.annotation.*; 

@XmlRootElement(name="produktua")
@XmlType(propOrder={"id","id_kategoria","izena","deskribapena","balioa","une_salneurria","i"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Produktu{
   @XmlAttribute(required=true)
   private int id;
   @XmlAttribute(required=true)
   private int id_kategoria;
   @XmlElement(name="izena")
   private String izena;
   @XmlElement(name="deskribapena")
   private String deskribapena;
   @XmlElement(name="balioa")
   private String balioa;
   @XmlElement(name="une_salneurria")
   private String une_salneurria;
   @XmlElementWrapper(name="inbentario")
   @XmlElement(name="biltegi")
   private Inbentario [] i;

   public Produktu(){}

   public Produktu(int id,int id_kategoria,String izena,String deskribapena,String balioa,String une_salneurria){
      this.id=id;
      this.id_kategoria=id_kategoria;
      this.izena=izena;
      this.deskribapena=deskribapena;
      this.balioa=balioa;  
      this.une_salneurria=une_salneurria;
      this.i = new Inbentario [0];
   }
   
   public void setInbentario(Inbentario [] i){
      this.i=i;
   }

   public Inbentario [] getInbentario(){
      return this.i;
   }

   public int getId(){
      return this.id;
   }
   
   public void setId(int id){
      this.id=id;
   }

   public int getKategoria(){
      return this.id_kategoria;
   }
   
   public void setKategoria(int id_kategoria){
      this.id_kategoria=id_kategoria;
   }
   
   public String getIzena(){
      return this.izena;
   }
   
   public void setIzena(String izena){
      this.izena=izena;
   }
   
   public String getDeskribapena(){
      return this.deskribapena;
   }
   
   public void setDeskribapena(String deskribapena){
      this.deskribapena=deskribapena;
   }
   
   public String getBalioa(){
      return this.balioa;
   }
   
   public void setBalioa(String balioa){
      this.balioa=balioa;
   }
   
   public String getUne_salneurria(){
      return this.une_salneurria;
   }
   
   public void setUne_salneurria(String une_salneurria){
      this.une_salneurria=une_salneurria;
   } 
   
   @Override
   public String toString(){
      return("Produktua: Kodea= "+this.id+" Izena= "+this.izena+" Uneko_Salneurria= "+this.une_salneurria+" Deskribapena= "+this.deskribapena+" Balioa= "+this.balioa+"  Id Kategoria= "+this.id_kategoria );
   }

}
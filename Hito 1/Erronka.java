public class Erronka {
   public static void main (String [] args){
   Bezero b=new Bezero ();
   Eskaria e=new Eskaria ();
   Produktu p=new Produktu ();
   Biltegi bi=new Biltegi ();
   Kokaleku k=new Kokaleku ();
   Saltzaile s=new Saltzaile ();
   Bulegari bu=new Bulegari ();
   
   
   s.addKontua (k);
   k=new Kontua ("123456578F","Iker","Peña Gartzia",1000,"30/01/2023");
   s.addKontua (k);
   //XML 
   JAXBContext c;
   try{
      c = JAXBContext.newInstance (Sukursala.class);
      Marshaller m = c.createMarshaller();
      m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      m.marshal (s,new File ("sukursala.xml"));
   }catch (Exception e){
      System.out.println("Errorea irakurtzerakoan");
   }
   }
}
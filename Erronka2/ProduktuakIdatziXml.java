import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class ProduktuakIdatziXml {
    public static void main (String [] args){
        Produktu p = new Produktu (1,1,"si","si",1.2,1.5);
        Produktuak pk = new Produktuak ();
        pk.addProduktu (p);
        p = new Produktu (2,1,"si","si",1.3,1.3);
        pk.addProduktu(p);
        //XML 
        JAXBContext c;
        try{
           c = JAXBContext.newInstance (Produktuak.class);
           Marshaller m = c.createMarshaller();
           m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           m.marshal (pk,new File ("produktuak.xml"));
        }catch (Exception e){
           System.out.println("Errorea irakurtzerakoan");
        }
        }
}

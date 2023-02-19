import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;

public class KategoriakIdatziXml {
    public static void main (String [] args){
        Kategoria k = new Kategoria (1,"bai");
        Kategoriak kk = new Kategoriak ();
        kk.addKategoria (k);
        k = new Kategoria (2,"ez");
        kk.addKategoria(k);
        //XML 
        JAXBContext c;
        try{
           c = JAXBContext.newInstance (Kategoriak.class);
           Marshaller m = c.createMarshaller();
           m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           m.marshal (kk,new File ("kategoriak.xml"));
        }catch (Exception e){
           System.out.println("Errorea irakurtzerakoan");
        }
        }
}

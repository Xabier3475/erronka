import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class DBInbentarioKlasea{
    private Inbentario [] i;
    public DBInbentarioKlasea(){}

    public DBInbentarioKlasea(Inbentario[]i){
        i = new Inbentario [0];
    }

    public void AddInbertario(Inbentario[]i){
        
    }

    public static void main(System [] args){
        try{
            File f = new File ("ERRONKA2\\DB_EXPORTAZIOA\\INBENTARIO_DATA_TABLE.tsv");
            Scanner sc = new Scanner (f);
            
            
            sc.nextLine();
            while(sc.hasNext()){
                
            }
        }catch(Exception e){
            System.out.println("Errorea"+e);
        }
    }

}
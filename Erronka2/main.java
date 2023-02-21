import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class main {
    public static void main (String[] args){
      int d=0;
      login(d);
    }

    public static void menua(){
        int erabaki;
        String berriro;
        Scanner sc = new Scanner (System.in);
        System.out.println("Erabaki zer egin nahi duzun:");
        System.out.println("1.- XML-a Sortu");
        System.out.println("2.- DB Eguneratu");
        System.out.println("3.- Erabiltzaileak Gehitu");
        System.out.println("4.- Datuak Erakutsi");
        System.out.println("5.- Deslogeatu");
        System.out.println("6.- Exit");
        erabaki=sc.nextInt();
        switch (erabaki){
            case 1:
                xmlaSortu();
                break;
            case 2:
                dbEguneratu();
                break;
            case 3:
                erabiltzaileakGehitu();
                break;
            case 4:
                datuakErakutsi();
                break;
            case 5:
                deslogeatu();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Sartu duzuna txarto dago, sahiatu nahi duzu berriz? Bai(b) / Ez(e)");
                berriro=sc.next();
                if (berriro.equals("b")){
                    menua();
                }
        }
        sc.close();
    }

    public static void login(int d){
        String erabiltzaile;
        String pasahitza;
        String erabiltzaileA;
        String pasahitzaA;
        int a=0,b=0,c=0;
        String [] [] erabiltzaileak = new String [100] [2];
        Scanner sc = new Scanner(System.in);
        if (d<4){
            System.out.println("Sartu zure erabitzailea: ");
            erabiltzaile=sc.next();
            try{ 
                File erabil = new File("Erronka2\\Erabiltzaileak\\Erabiltzaileak.txt");
                Scanner leer = new Scanner(erabil);
                leer.nextLine();
                int z =0;
                while(leer.hasNext()){
                    erabiltzaileA=leer.next();
                    erabiltzaileak [z] [0] = erabiltzaileA;
                     pasahitzaA=leer.next();
                    erabiltzaileak [z] [1] = pasahitzaA;
                    z++; 
                }
                leer.close();
            }catch (Exception e){
                System.out.println("Ez du file-rik aurkitu");
                login(d);
                d++;
            }
            for(int i=0;i<erabiltzaileak.length;i++){
                if(erabiltzaile.equals(erabiltzaileak[i][0])){
                    a++;
                    c=i;
                }
            }
            if(a==1){
                System.out.println("Sartu pasahitza: ");
                pasahitza=sc.next();
                if(pasahitza.equals(erabiltzaileak[c][1])){
                b++;
                }
                if(b==1){
                    menua();
                }else{
                    System.out.println("Pasahitza txarto sartu duzu");
                    login(d);
                    d++;
                }
            }else{
                System.out.println("Erabiltzailea ez da existitzen, sahiatu berriro.");
                d++;
                login(d);
            }
            sc.close();
        }
    }

    

    public static void deslogeatu(){
        login(0);
    }

    public static void exit(){
        String exit;
        Scanner sc = new Scanner (System.in);
        System.out.println("Atera nahi duzu programatik? Bai(b) / Ez(e)");
        exit=sc.next();
        if (exit.equals("e")){
            menua();
        }
        sc.close();
    }

    public static void xmlaSortu(){
    }

    public static void dbEguneratu(){
        int e=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Zer egin nahi duzu?");
        System.out.println("1.- Soldata Eremua Gehitu");
        System.out.println("2.- Langileen Soldata Eguneratu");
        e=sc.nextInt();
        switch (e){
            case 1:
                eremuaGehitu();
                break;
            case 2:
                taulaEguneratu();
                break;                
        }
    }

    public static void erabiltzaileakGehitu(){
        String erabiltzaile="";
        int pass1 = 0;
        int pass2 = 0;
        try{
            FileWriter f = new FileWriter ("Erronka2\\Erabiltzaileak\\Erabiltzaileak.txt",true);
            PrintWriter pw = new PrintWriter (f);
            Scanner sc = new Scanner (System.in);
            System.out.println("Sartu erabiltzaile berriaren izena: ");
            erabiltzaile=sc.next();
            System.out.println("Sartu erabiltzaile berriaren pasahitza: ");
            pass1=sc.nextInt();
            System.out.println("Konfirmatu pasahitza: ");
            pass2=sc.nextInt();
            if (pass1==pass2){
                pw.println("");
                pw.print(erabiltzaile + " "+pass1);
                pw.close();
                f.close();
            }
        }catch (Exception e){
            System.out.println("Fitxategia ez du irakurtzen");
        }
        exit();
    }

    public static void datuakErakutsi(){
        String a="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Zein taula erakutsi nahi duzu?");
        System.out.println("BEZERO");
        System.out.println("BEZERO_TELEFONO");
        System.out.println("BILTEGI");
        System.out.println("BULEGARI");
        System.out.println("ESKARI");
        System.out.println("ESKARI_EGOERA");
        System.out.println("ESKARI_LERRO");
        System.out.println("HERRIALDE");
        System.out.println("INBENTARIO");
        System.out.println("KATEGORIA");
        System.out.println("KOKALEKU");
        System.out.println("KONTINENTE");
        System.out.println("LANGILE");
        System.out.println("LANPOSTU");
        System.out.println("PRODUKTU");
        System.out.println("SALTZAILE");
        a=sc.next();

        try{
            File p = new File ("DB_EXPORTAZIOA\\"+a+"_DATA_TABLE.tsv");
            Scanner produktu = new Scanner (p);
            String [] [] produktuArray;
            while(produktu.hasNext()){
                //this.produktuArray=Arrays.copyOf(this.produktuArray,this.produktuArray.length+1)[];
                //produktuArray [][]={}
            }
            produktu.close();
        }catch (Exception e){
            System.out.println("Ez da dokumentua aurkitzen.");
        }
    }

    public static void eremuaGehitu(){
        try{
            FileWriter gehitu = new FileWriter("Erronka2\\Sql\\eremuaGehitu.sql");
            PrintWriter eremua = new PrintWriter(gehitu);
            eremua.println("--Script hau sartu sql developer-en eta exekutatau.");
            eremua.print("ALTER TABLE LANGILE ADD SOLDATA NUMBER(5);");
            eremua.close();
            gehitu.close();
        }catch (Exception e){
            System.out.println("Errorea egon da SQL sorreran");    
        }
        System.out.println("Eremua Gehitu SQL Scripta sortu da.");
        System.out.println(" ");
        exit ();
    }

    public static void taulaEguneratu(){
        try{
            FileWriter eguneratu = new FileWriter("Erronka2\\Sql\\taulaEguneratu.sql");
            PrintWriter taula = new PrintWriter(eguneratu);
            taula.println("--Script hau sartu sql develop-en eta exekutatu");
            taula.println("--Saltzaileak");
            taula.println("UPDATE LANGILE SET SOLDATA = 30000 WHERE ID= ANY (SELECT L.ID FROM LANGILE L INNER JOIN SALTZAILE S ON L.ID = S.ID);");
            taula.println(" ");
            taula.println("--Bulegariak");
            for (int i=1;i<=19;i++){
                taula.println("UPDATE LANGILE SET SOLDATA = " +(30000 +((i-1)*1000)) +" WHERE ID = ANY (SELECT ID FROM BULEGARI  WHERE LANPOSTU_ID = '"+i+"' );");
            }
            taula.close();
            eguneratu.close();
        }catch (Exception e){
            System.out.println("Errorea egon da SQL sorreran");
        }  
        System.out.println("Taula Eguneratu SQL Scripta sortu da.");
        System.out.println(" ");
        exit ();
    }
}




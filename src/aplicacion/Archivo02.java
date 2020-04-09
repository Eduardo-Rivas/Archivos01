package aplicacion;

//--Importamos las Clases--//
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Archivo02 
{

 //--Metodo main--//
 public static void main(String[] args)
 {
    //--Definimos objeto tipo FileReader inizaializado en null--//
    FileReader fr = null;
    BufferedReader br = null;

    //--Definimos una variable para la ruta del archivo--// 
    String ruta = "/home/eduardo/archivo.txt";

    try
    {
       //--Instanciamos el objeto FileReader--//
       fr = new FileReader(ruta);

       //--Instanciamos el objeto BuffereReader apartir de fr--//
       br = new BufferedReader(fr);

       String linea = br.readLine();
       while(linea != null)
       {
          System.out.println(linea);
          linea = br.readLine();
       }

    }
    catch(IOException e)
    {
       System.out.println("Error..."+e.getMessage());
    }
    finally
    {
       try
       {
          if(fr != null)
          {
             fr.close();
          }
          if(br != null)
          {
             br.close();
          }
       }
       catch(IOException e)
       {
          e.printStackTrace();    
       }

    }
   

 }
 
}
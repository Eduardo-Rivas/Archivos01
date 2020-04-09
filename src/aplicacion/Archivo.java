package aplicacion;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Archivo
{

   //--Metodo main--//
   public static void main(String[] args)
   {
      //--Instanciamos un objeto File con la ruta de archivo--//
      File file = new File("/home/eduardo/archivo.txt");
      
      //--Inicializaos un objeto tipo Scanner para leer el archivo.txt--//
      Scanner sc = null;

      try	
      {
         //--Instanciamos a sc apartir del objeto file--//
         sc = new Scanner(file);
         while(sc.hasNextLine())
         {
            //--Imprimimos las lineas del archivo--//
            System.out.println(sc.nextLine());        
         }

      }
      catch(IOException e)
      {
         System.out.println("Error en Archivo..."+e.getMessage());   
      }
      finally
      {
         if(sc != null)
         {
            sc.close();
         }
      }

   }	  

}


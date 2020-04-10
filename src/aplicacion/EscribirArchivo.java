package aplicacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo
{
   public static void main(String[] args)
   {
      //--Definimos e Instanciamos un Arreglo--//
      String[] lineas = new String[] {"Buenas Dias", "Buenas Trades", "Buenas Noches"};

      //--Ruta del Archivo--//
      String ruta = "/home/eduardo/out.txt"; 

      //--Creamos e Instanciamos objeto BufferedWriter y FileWriter para A#adir al final del archivo(out.txt)--//
      try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true)))
      {
         for(String linea : lineas)
         {
            bw.write(linea);
            bw.newLine(); 
         }

      } 
      catch(IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         System.out.print("Proceso Terminado...");
      }

   }

}

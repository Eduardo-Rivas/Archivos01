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

    //--Definimos una variable para la ruta del archivo--// 
    String ruta = "/home/eduardo/archivo.txt";

    //--Instanciamos los objetos BufferReader y FileReader--//
    //--Directamente en el bloque try, y no hace falta cerrarlos--//
    try(BufferedReader br = new BufferedReader(new FileReader(ruta)))
    {

       String linea = br.readLine(); 
       while(linea != null) 
       {
          System.out.println(linea);
          linea = br.readLine();
       }

    }
    catch(IOException e)
    {
       System.out.println("Error de Archivo..."+e.getMessage());
    }

 }
 
}
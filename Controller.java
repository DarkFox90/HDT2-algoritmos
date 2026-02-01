/**
* Clase controladora encargada de la lectura del archivo de datos y 
* la coordinación entre la vista y la lógica de la calculadora.
* @author Mauricio Corado 25218 Carlos Pozuelos 25104
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller {
    
    public void ReadFile() {
        String filePath = "";   

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == ' ') {
                        continue;
                    }
                    
                    System.out.println(c);
                } 
            } 
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        catch(IOException e) {
            System.out.println("algo salio mal");
        }
    }
}

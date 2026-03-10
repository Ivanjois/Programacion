package U7.Entregables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Producto> lproductos = new ArrayList<>();
        File Productos = new File("productos.csv");
        Scanner sc = new Scanner(Productos);
        try {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                Scanner analizador = new Scanner(linea);
                analizador.useDelimiter(";");
            }
        }catch (Exception e){

        }
    }

}

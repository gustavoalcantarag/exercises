package com.mycompany.sem0701;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.StringTokenizer;

/**
 *
 * @author YRM
 */
public class ListaProductos {
    
    Producto lista[];
    int indice;
    
    ListaProductos(int cantidad){
        lista = new Producto[cantidad];
        indice = 0;
    }
    
    void AgregarProducto(Producto e){
        lista[indice] = e;
        indice++;
    }
    
    void GuardarEnArchivo(Producto e){
        try{
            FileWriter fw = new FileWriter("ArchivoProductos.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(e.codigo+"|"+e.producto+"|"+e.precio+"|"+e.stock+"|"+e.categoria);
            pw.close();
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null,"ERROR en guardar dato "+ex);
        }
    }
    
    void MostrarDeArchivoATabla(JTable tabla, String[] encabezado){
        DefaultTableModel dtm = new DefaultTableModel(null, encabezado);
        tabla.setModel(dtm);
        indice = 0;
        String linea;
        try{
            //System.out.println(new File(".").getAbsoluteFile());
            FileReader fr = new FileReader("ArchivoProductos.txt");
            BufferedReader br = new BufferedReader(fr);
            while((linea = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(linea,"|");
                String codigo = st.nextToken();
                String producto = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                String categoria = st.nextToken();
                
                Producto p = new Producto(codigo,producto,precio,stock,categoria);
                this.AgregarProducto(p);
                dtm.addRow(p.Registro(indice));
                
            }
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null,"ERROR al recuperar archivo "+ex);
        }
    }
}

package com.mycompany.sem0702;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom. Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
    * @author YRM
 */
public class RecuperarDeXML {

    public static void main(String[] args) {
        
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(new File("Producto.xml"));
            NodeList listaproductos = documento.getElementsByTagName("Producto");
            for(int i=0; i<listaproductos.getLength(); i++){
                Node nodo = listaproductos.item(i);
                if(nodo.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nodo;
                    NodeList hijos = e.getChildNodes();
                    Producto prod = new Producto();
                    for(int j=0; j<hijos.getLength(); j++){
                        Node hijo = hijos.item(j);
                        if(hijo.getNodeType() == Node.ELEMENT_NODE){
                            
                            if(hijo.getNodeName().equals("codigo")){
                                prod.setCodigo(hijo.getTextContent());
                            }
                            if(hijo.getNodeName().equals("nombreprod")){
                                prod.setNombreprod(hijo.getTextContent());
                            }
                            if(hijo.getNodeName().equals("precio")){
                                prod.setPrecio(hijo.getTextContent());
                            }
                            if(hijo.getNodeName().equals("stock")){
                                prod.setStock(hijo.getTextContent());
                            }
                        }
                    }
                    System.out.println("*** Producto "+(i+1)+"\n"+prod);
                }
            }
        }catch(ParserConfigurationException | SAXException | IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
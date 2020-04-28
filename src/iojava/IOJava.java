package iojava;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package iojava;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

*/
/**
 *
 * @author geoleite
 *//*

public class IOJava {

    */
/**
     * @param args the command line arguments
     *//*

    public static void main(String[] args) {
        try {
            String arquivo = "Pergunta1;errada;correta;Pergunta2;errada;corretad";
            // TODO code application logic here
            String path = "/Users/geoleite/estrutura1.dat";
            //String path = "/Users/geoleite/eu.jpg";
            IOBInario iOBInario = new IOBInario(path);
            //byte[] dados = "String qualquer".getBytes();
            //iOBInario.write(dados);
            byte[] dados = iOBInario.read();
            //ByteArrayInputStream bais = new ByteArrayInputStream(dados);
            //BufferedImage bi = ImageIO.read(bais);
            //ImageIO.write(bi, "PNG", new File("/Users/geoleite/eu2.png"));
            //String txt = new String(dados);
            System.out.println(dados.length);
        } catch (Exception ex) {
            Logger.getLogger(IOJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
}
*/

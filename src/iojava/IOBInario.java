package iojava;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package iojava;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

*/
/**
 *
 * @author geoleite
 *//*

public class IOBInario {
    private File file;
    public IOBInario(String path) throws Exception {
        file = new File(path);
        if (file.isDirectory()) {
            throw new Exception("Arquivo inválido! " + path);
        }
        
    }
    public byte[] read() throws Exception {
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int controle = -1;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ( (controle = fis.read(buffer)) > 0 )  {
            byte[] bufferTemp  = new byte[controle];
            System.arraycopy(buffer, 0, bufferTemp, 0, controle);
            baos.write(bufferTemp);
        }
        fis.close();
        return baos.toByteArray();
    }
    
    public void write(byte[] dados) throws Exception {
        
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(dados);
        fos.flush();
        fos.close();
    }
}
*/

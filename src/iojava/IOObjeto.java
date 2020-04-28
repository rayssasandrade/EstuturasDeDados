package iojava;

import java.io.*;

public class IOObjeto {
    private File file;
    
    public IOObjeto(String path) throws Exception {
        file = new File(path);
    }
    
    public Object read() throws Exception{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
    
    public void write(Object obj) throws Exception {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
    }
}

package EstruturasII.ArvoreBinaria;

import java.io.File;

public class IOBinario {

    private File file;
    public IOBinario(String path) throws Exception{
        file = new File(path);
        if(file.isDirectory()){
            throw new Exception("Arquivo inválido!"+ path);
        }
    }
    public void read(){

    }
    public void write(byte[] dados) throws Exception{

    }

}

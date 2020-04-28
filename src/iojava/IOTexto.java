

package iojava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTexto {
    private File file;
    public IOTexto() {
    }
    public IOTexto(String path) throws Exception {
        file = new File(path);
    }

    public String read() throws Exception {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        while (br.ready()) {
            String line = br.readLine();
            sb.append(line);
            sb.append("\n");
        }
        br.close();
        return sb.toString();
    }

    public void write(String dados) throws Exception {
        FileWriter fw = new FileWriter(file);
        fw.write(dados);
        fw.flush();
        fw.close();
    }
}

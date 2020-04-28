/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iojava;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 *
 * @author geoleite
 */
public class IOJson extends IOTexto {
    private static Gson gson = new Gson();
    public IOJson(){
        super();
    }

    public IOJson(String path) throws Exception {
        super(path);
    }

    public Object read(Class clazz) throws Exception {
        String str = super.read();
        return gson.fromJson(str, clazz);
    }

//    public Object read(Arvore<String> arvore) throws Exception {
//        String str = super.read();
//        return gson.fromJson(str, (Type) arvore);
//    }

    public Object read(Type type) throws Exception {
        String str = super.read();
        return gson.fromJson(str, type);
    }

    public void write(Object obj) throws Exception {
        String str = gson.toJson(obj);
        super.write(str);
    }
}

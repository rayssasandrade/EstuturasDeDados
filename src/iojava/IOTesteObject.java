package iojava;

public class IOTesteObject {
    public static void main(String[] p) {
        try {
            Aluno aluno = new Aluno();
            aluno.setMat(123);
            aluno.setNome("Eu");
            aluno.setNota1(7.5);
            String path = "/Users/geoleite/teste.dat";
            IOObjeto iOObjeto = new IOObjeto(path);
            iOObjeto.write(aluno);
//            Aluno alu = (Aluno)iOObjeto.read();
//            System.out.println(alu.getNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

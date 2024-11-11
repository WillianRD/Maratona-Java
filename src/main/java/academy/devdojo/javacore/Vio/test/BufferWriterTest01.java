package academy.devdojo.javacore.Vio.test;

import java.io.*;

public class BufferWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            fw.write("Essa parte podemos escrever qualquer coisa\nLeide & Yuri");
            fw.flush(); // flush(); Envia todo o conteudo do write(); para o arquivo

            bw.newLine(); // Pula linha no arquivo
            bw.write("Olá amigos \n");
            bw.write("Olá Pessoal \n");
            bw.write("Olá Alunos");
            System.out.println("Arquivo atualizado!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

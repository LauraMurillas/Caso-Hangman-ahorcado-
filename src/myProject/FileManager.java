package myProject;

 import java.io.*;
 import java.util.ArrayList;

//Este programa sirve para aprender el uso de las excepciones

public class FileManager {
    private FileReader fileReader;
    private BufferedReader input;
    private FileWriter fileWriter;
    private BufferedWriter output;


    public ArrayList<String> lecturaFile() {

        ArrayList<String> frases = new ArrayList<String>();


        try {
            fileReader = new FileReader("src/myProject/files/diccionario.txt");
            input = new BufferedReader(fileReader);
            String line = input.readLine();
            while(line!=null){
                frases.add(line);
                line=input.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return frases;
    }

    public void escribirTexto(String linea){
        try {
            fileWriter = new FileWriter("src/myProject/files/fileText.txt",true);
            output = new BufferedWriter(fileWriter);
            output.write(linea);
            output.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

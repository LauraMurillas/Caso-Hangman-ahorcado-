package myProject;

public class ControlHangman {
    private Diccionario frases;
    private String frase, clave, errores;
    private int conteoErrores;
    private boolean fallo, ganar;

    //constructor
    public ControlHangman(){
        frases = new Diccionario();
    }

    //metodo para seleccionar la frase y crear las rayitas de la frase
    public String pintarClaveFrase(){
        //inicializacion de las variables de las variables de la ronda de juego
        clave="";
        //frase= frases.getFrase();
        errores="Letras Erroneas: ";
        conteoErrores=0;

        //Obtener la frase
        frase=frases.getFrase();

        //Creamos las rayitas (clave)
        for (int i=0; i<frase.length();i++){
            if( frase.charAt(i) == ' '){
                clave+= frase.charAt(i);
            }else{
                clave+="-";
            }
        }

    return clave;
    }

    //metodo para recorrer la frase y validar si la letra es correcta o hubo fallo
    public String validarLetra(char letra){
        fallo=false;
        int index=frase.indexOf(letra); //indexOf busca la primera incidencia de esa cadena de caracter y devuelve el indice del caracter que adivinaron
        if(index!=-1){
            //uso while xq no se el numero de iteraciones
            while(index>-1){
                reemplazarLetra(index,letra);
                index=frase.indexOf(letra, index+1);
            }
        }else{
            fallo=true;
            conteoErrores++;
            errores+=letra+" ";
        }
        return clave;
    }

    //metodo que cambia el guion por la letra
    private void reemplazarLetra(int index, char letra) {
        char[] arrayClave= clave.toCharArray();
        arrayClave[index]=letra; //esta linea cambia el guion por la letra
        clave= String.copyValueOf(arrayClave);
    }

    //Metodo para determinar el ganador
    public boolean isGanador(){
        /*
        if(clave.indexOf('-')==-1){
            ganar=true;
        }else{
            ganar=false;
        }
        */
    //forma breve de escribir el if/else anterior en JAVA
    ganar = (clave.indexOf('-')==-1)?true:false;
    return ganar;
    }

    public String getClave() {
        return clave;
    }

    public String getErrores() {
        return errores;
    }

    public int getConteoErrores() {
        return conteoErrores;
    }

    public boolean isFallo() {
        return fallo;
    }

    public String getFrase() {
        return frase;
    }
}

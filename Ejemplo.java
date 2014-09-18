/*Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:
2, 5, 7, 10, 12, 15, 17, . . ., 1 800
*/

public class Ejercicio302 {
public static void main(String[] args){
    int i,j=0,bra='t';
    for(i=0;i<=797;i=i)
    {
        if(bra=='t')
        {
            i=i+2;
            bra='f';
        }
 else
        {
            i=i+3;
            bra='t';
        }
        System.out.println(+i);
    }
}

}


http://programacionparajava.blogspot.com.es/p/primeros-programas-en-java-para-novatos.html
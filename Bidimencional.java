
package bidimencional;

public class Bidimencional {

    public static void main(String[] args) {
       
       char[][] letras= {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'}
        };
 for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[0].length; j++) {
                System.out.print(letras[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    }
    


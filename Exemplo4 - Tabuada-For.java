/**
 *
 * @author Nicolas
 */
public class Exemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, num;

        num = (int) (Math.random() * 100);

        System.out.println("\t\t\tTabuada DO " + num);

        for (cont = 1; cont <= 10; cont++) {
            System.out.println(num + "x" + cont + " = " + cont * num);
        }

    }

}

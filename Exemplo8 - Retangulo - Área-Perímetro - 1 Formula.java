import fatec.poo.model.Retangulo; //Trazer Referencias/importando as restrições, e informações da pasta Retangulo
import java.util.Scanner; //importando a classe Scanner - na pasta util


/**
 *
 * @author Nicolas
 */
public class Aplic { //criando class principal Aplic - dentro do prjRetangulo - <pacote default>

    
    public static void main(String[] args) {
        //Instanciação de um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
       
        //Instanciação de um objeto da classe Retangulo
        Retangulo objRet = new Retangulo();  //new comando de alocação
        
        double medAlt, medBase;
        int opcao;
        
        medAlt = 5.0;
        medBase = 8.0;
        
        //passagem de menssagem
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1-Consultar Área");
            System.out.println("\n2-Consultar Perimetro");
            System.out.println("\n3-Sair");
            System.out.println("\n\tDigite sua opção: ");
            opcao = entrada.nextInt(); // lembra o scanf("%d")
            switch(opcao){
                case 1: System.out.println("\nMedida da Área: " + objRet.calcArea());
                break;
                
                case 2: System.out.println("\nMedida de Perimetro: " + objRet.calcPerimetro());
                break;
                
                
            }
                    
        }while(opcao < 3);
        
    }
    
}

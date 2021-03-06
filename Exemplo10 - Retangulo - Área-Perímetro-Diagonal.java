
**Retangulo.java 

package fatec.poo.model;

/**
 *
 * @author Nicolas Ferrari
 */
public class Retangulo {
    private double altura;
    private double base;
    private double diagonal;
    
    public void setAltura(double a){
        altura = a;
    }
    
    public double getAltura(){
        return(altura);
    }
    
    
    public void setBase(double b){
        base = b; 
    }

    public double getBase(){
        return(base);
    }
    
    public double calDiagonal(){
        return(Math.sqrt(Math.pow(altura,2)+Math.pow(base,2)));
    }
    
    public double calcArea(){
        return (altura * base);
    }
    
    public double calcPerimetro(){
        return(2*(base + altura));
    }
    
}

**Aplic.java


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
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        
       
        
        //passagem de menssagem
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1-Consultar Área");
            System.out.println("\n2-Consultar Perimetro");
            System.out.println("\n3-Consultar Diagonal");
            System.out.println("\n4-Sair");
            System.out.println("\n\tDigite sua opção: ");
            opcao = entrada.nextInt(); // lembra o scanf("%d")
            
            System.out.println("\n\nMedida da altura: " + objRet.getAltura());
            System.out.println("\n\nMedida da base: " + objRet.getBase());
        
            
            switch(opcao){
                case 1: System.out.println("\nMedida da Área: " + objRet.calcArea());
                break;
                
                case 2: System.out.println("\nMedida de Perimetro: " + objRet.calcPerimetro());
                break;
                
                case 3: System.out.println("\nMedida da Diagonal: " + objRet.calDiagonal());
                break;
                
            }
                    
        }while(opcao < 4);
        
    }
    
}



//*** Fundamentos *** Profa.Giraffa
import java.util.*;

public class ExtensoNumeroSwitch{
    public static String unidades(int valor){
    String aux=" ";
        switch (valor){
                        case 1: aux="um";break;
            case 2: aux="dois";break;
            case 3:aux="tres";break;
            case 4: aux="quatro";break;
            case 5: aux="cinco";break;
            case 6: aux="seis";break;
            case 7: aux="sete";break;
            case 8: aux="oito";break;
            case 9: aux="nove";break;
              default:; 
    
    }
    return aux;
}
public static void dezenas(int valor){
    
        switch (valor){
            case 1: System.out.println ("onze");break;
            case 2: System.out.println ("doze");break;
            case 3: System.out.println ("treze");break;
            case 4: System.out.println ("quatorze");break;
            case 5: System.out.println ("quinze");break;
            case 6: System.out.println ("dezesseis");break;
            case 7: System.out.println ("dezsete");break;
            case 8: System.out.println ("dezoito");break;
            case 9: System.out.println ("dezenove");break;
            case 0: System.out.println ("dez");break;
                  
    
    }
}
                   
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);//objeto instanciado para metodo main
        System.out.println("\f");
        System.out.println("\n  Valores por extenso ****");
        System.out.println ("\n Digite  numero entre 0 e 100");//de 1 a 99
        int num=teclado.nextInt();
        if ((num<1) || (num>99)) System.out.println("\n Valor fora dos limites");
        int aux1=num/10;
        int aux2=num%10;
        if (aux1==0) { System.out.println (unidades(aux2));}
        if (aux1==1){  dezenas(aux2);}
        if (aux1==2){ if (aux2==0) System.out.println ("vinte");
                            else {System.out.println ("vinte e "+ unidades(aux2));}
                            }
        if (aux1==3){ if (aux2==0) System.out.println ("trinta");
                            else {System.out.println ("trinta e "+ unidades(aux2));}
                            }
        if (aux1==4){ if (aux2==0) System.out.println ("quarenta");
                            else {System.out.println ("quarenta e "+ unidades(aux2));}
                            }
        if (aux1==5){ if (aux2==0) System.out.println ("cinquenta");
                            else {System.out.println ("cinquenta e "+ unidades(aux2));}
                            }      
        if (aux1==6){ if (aux2==0) System.out.println ("sessenta");
                            else {System.out.println ("sessenta e "+ unidades(aux2));}
                            }  
        if (aux1==7){ if (aux2==0) System.out.println ("setenta");
                            else {System.out.println ("setenta e "+ unidades(aux2));}
                            }
        if (aux1==8){ if (aux2==0) System.out.println ("oitenta");
                            else {System.out.println ("oitenta e "+ unidades(aux2));}
                            } 
         if (aux1==9){ if (aux2==0) System.out.println ("noventa");
                            else {System.out.println ("noventa e "+ unidades(aux2));}
                            }
        }
             }
            

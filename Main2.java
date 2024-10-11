import java.util.Scanner;
public class Main2
{
    public static void main(String []srgs){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Unesite broj telefona: ");
        int BrojTelefona = scan.nextInt();
        
        System.out.println("Unesite trenutno stanje na racunu: ");
        float Stanje = scan.nextInt();
        
        System.out.println("Unesite 1 za vaučer od 5€");
        System.out.println("Unesite 2 za vaučer od 10€");
        System.out.println("Unesite 3 za vaučer od 20€");
        
        int Vaucer = scan.nextInt();
        
        if(Vaucer == 1){
            System.out.println("Stanje na vasem racunu: " + (Stanje + 5));
        }else if(Vaucer == 2){
            System.out.println("Stanje na vasem racunu: " + (Stanje + 10));
        }else if(Vaucer == 3){
            System.out.println("Stanje na vasem racunu: " + (Stanje + 20));
        }
        }
}




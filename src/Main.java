import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int resultat[] = new int[5];
        System.out.println("introduix els numeros del primer array :");
        for(int i=0 ; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("introduix els numeros del segon array :");
        for(int i=0 ; i<b.length; i++){
            b[i] = sc.nextInt();
        }
        for(int i=0 ; i<a.length; i++){
            resultat[i]=a[i]+b[i];
        }
        System.out.println("a:["+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+"]");
        System.out.println("b:["+b[0]+","+b[1]+","+b[2]+","+b[3]+","+b[4]+"]");
        System.out.println("resultat:["+resultat[0]+","+resultat[1]+","+resultat[2]+","+resultat[3]+","+resultat[4]+"]");
    }
}

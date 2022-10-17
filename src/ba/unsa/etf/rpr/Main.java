package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {
    public static int SumaCifara(int n){
        int s=0;
        while(n!=0){
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.printf("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        for(int i=1;i<=n;i++){
            if(i%SumaCifara(i)==0){
                System.out.println(i);
            }
        }
    }
}
package BasicMath;

import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args) {
        int gcd =1;
        int n1=9;
        int n2=12;
        for(int i=1;i<min(9,12);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD :"+gcd);
    }
}

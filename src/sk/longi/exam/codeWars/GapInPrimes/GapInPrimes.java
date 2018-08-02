package sk.longi.exam.codeWars.GapInPrimes;

import java.util.Arrays;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long[] p=new long[2];
        for(long i=m+1;i<n;i++){
           if(isPrime(i)){
               System.out.println(i);
               if (p[0]==0)p[0]=i;
               if (p[0]!=0) p[1]=i;
               if ((p[1]- p[0])==g) return p;
               if (p[0]>0&&p[1]>0){
                   p[0]=p[1];
                   p[1]=0;
               }
           }

        }
    return null;
    }

    private static boolean isPrime(long num){
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int max = (int) Math.sqrt(num);

        for (int i = 3; i <= max; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(10,300,400)));
        System.out.println();
    }
}

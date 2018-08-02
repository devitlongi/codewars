package sk.longi.exam.codeWars.NextBiggerNumber;

import java.util.Arrays;

public class nextBiggerNumber {
    static long n=144;

    public static long nextBNumber(long n){
        System.out.println(n);
        char nArr[]= String.valueOf(n).toCharArray();
        int i=nArr.length-1;
        int j=i-1;
        while(nArr[i]<=nArr[j]){
            char ch=nArr[i];
            nArr[i]=nArr[j];
            nArr[j]=ch;
            j--;
            if(j<0) return -1;
        }
        Arrays.sort(nArr,j+1,i);
        i=j;
        while(nArr[i]>=nArr[j+1]) {
            j++;
            }
        char ch=nArr[i];
        nArr[i]=nArr[j+1];
        nArr[j+1]=ch;
        Arrays.sort(nArr,i+1,nArr.length);
        return Long.valueOf(String.valueOf(nArr));
    }
    public static void main (String[]args){
        System.out.println(nextBNumber(n));
    }

}


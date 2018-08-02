package sk.longi.exam.codeWars.WeightSort;

import java.util.Arrays;

public class WeightSort {

    public static String orderWeight(String strng) {
       String str1 = strng;
       int numbers = strng.split(" ").length;
       String [] str= new String [numbers];
        int i;
        int j;
        for(i=0;i<numbers;i++){
            str[i] = (i==numbers-1)? str1 : str1.substring(0,str1.indexOf(' '));
            str1 = str1.substring(str1.indexOf(' ')+1);
        }
       int[] num = new int[numbers];
        for( i=0;i<numbers;i++){
            for (j=0;j<str[i].length();j++){
                num[i]+=str[i].charAt(j)-'0';
            }
            System.out.println(num[i]);
        }
        for(i=0;i<numbers-1;i++)
            for(j=i+1;j<numbers;j++){
                if (num[i]>= num[j]) {
                    int s = num[i];
                    num[i]=num[j];
                    num[j]=s;
                    String st =str[i];
                    str[i]=str[j];
                    str[j]=st;
                }
                if (num[i]>= num[j]&&str[j].compareTo(str[i])<0){
                    String st =str[i];
                    str[i]=str[j];
                    str[j]=st;
                }
            }
       str1=Arrays.toString(str).replaceAll("[,\\[\\]]","");

       return str1;
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
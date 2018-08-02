//package sk.longi.exam.codeWars.MissingAlphabet1;
///*
//https://www.codewars.com/kata/missing-alphabet/train/java
// */
//public class MissingAlphabet {
//
//    public static String insertMissingLetters(String str) {
//        String AZ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String az="abcdefghijklmnopqrstuvwxyz";
//        String strIn="";
//        String s="";
//        System.out.println(str);
//        String strEX="";
//        int i;
//        strIn= strIn+str;
//
//        for (i=0;i<strIn.length();i++){
//            AZ=AZ.replace(strIn.toUpperCase().charAt(i),'.');
//            }
//            for (i=0;i<strIn.length();i++){
//                strEX +=(s.indexOf(strIn.charAt(i))!=-1) ?  strIn.charAt(i) : strIn.charAt(i)+AZ.substring(az.indexOf(strIn.charAt(i)));
//                s+= strIn.charAt(i);
//            }
//        strEX=strEX.replace(".","");
//        AZ=AZ.replace(".","");
//        az=AZ.toLowerCase().;
//        return strEX;
//    }
//    public static void main(String[] args) {
//        System.out.println(insertMissingLetters("hello"));
//        System.out.println(insertMissingLetters("abcdefghijklmnopqrstuvwxyz"));
//        System.out.println(insertMissingLetters("xpixax"));
//        //System.out.println(insertMissingLetters("z"));
//    }
//}

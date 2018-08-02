package sk.longi.exam.codeWars.findMostSimilar;

/**
 * https://www.codewars.com/kata/did-you-mean-dot-dot-dot/train/java
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class findMostSimilar {
static String to="ypviu";
    static final String[] words={"1234567890", "zqdrhpviqslik", "karpscdigdvucfr", "straasdasdassawberry", "raspasdasdasdasberry"};



    static String findMostSimilar1(String to) {
        //System.out.println(Arrays.toString(words));
       // System.out.println(to);
        if(words.length==0)return to;
        int p=0;
        int matchPos=0;
            String w;
            char[] word = to.toCharArray();
        for(int i=0;i<words.length;i++) {
            for (int j = 0; j < word.length; j++) {
                for (int k =word.length-1; k>j; k--) {
                    for (int l =j; l <= k; l++) {
                        w = "";
                        for( int m =l; m <=k; m++){
                                w += word[m] + "";
                                if (words[i].contains(w)) {
                                    if(p < w.length()) {
                                        p = w.length();
                                        matchPos = i;
                                    }
                            }else break;
                        }
                    }
                }
            }
        }
        return words[matchPos];
    }

    public static void main(String[] args) {
        System.out.println(findMostSimilar1(to));
    }
}
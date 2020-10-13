package com;
import java.lang.String;
import java.util.*;

public class StrManipul {

    public void WS(String s) {
        int words=0;
        int sentence=0;
    for (int i=1;i<s.length()-1;i++) {

        if ((s.charAt(i-1)==' ')&&(s.charAt(i)!=' ')) {
            words++;
        }

        if ((s.charAt(i-1)=='.')&&(s.charAt(i)==' ')) { sentence++; }
    }

    if (sentence>0) sentence++;
    if (words>0) words++;
    System.out.println("Words: "+words+" Sentences:"+sentence+"\n");
    }

    public void LVC(String s) {
        int letter = 0;
        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) > 'A') && (s.charAt(i) < 'Z') || (s.charAt(i) > 'a') && (s.charAt(i) < 'z')) {
                letter++;
                if ((s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I') || (s.charAt(i) == 'O') || (s.charAt(i) == 'U') ||
                        (s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
                    vowel++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Letters: "+letter+" Vowels: "+vowel+" Consonants: "+consonants+"\n");
    }

    public void WoCo(String s) {
        Map<String,Integer> dict= new HashMap<>();
        s=s.toLowerCase();
        String subs,longest="";
        int left;
        int right=0;

        for (int i=0;i<s.length();i++) {
            if ((s.charAt(i)==' ')||(s.charAt(i)==',')||(s.charAt(i)=='.')||(s.charAt(i)=='!')||(s.charAt(i)=='?')||(s.charAt(i)=='-')||(s.charAt(i)=='"')) {
                left=right;
                right=i;
                subs=s.substring(left+1,right);
                if (right-left>longest.length()) { longest=subs; }
                if (dict.get(subs) == null) {
                    dict.put(subs,1);
                } else { dict.put(subs,dict.get(subs)+1); }
            }
        }
        dict.remove("");
        System.out.println("The most often words:");

        ArrayList<String> keyList = new ArrayList<>(dict.keySet());
        ArrayList<Integer> valueList = new ArrayList<>(dict.values());
        WordCounter temp = new WordCounter("",0);
        int index=0;

        for (int j=0;j<5;j++) {
            for (int i = 0; i < keyList.size(); i++) {
                if (valueList.get(i) > temp.count) {
                    temp.count = valueList.get(i);
                    temp.word = keyList.get(i);
                    index=i;
                }
            }
            keyList.remove(index);
            valueList.remove(index);
            System.out.println((j + 1) + "." + temp.word + " " + temp.count);
            temp.count=0;
        }

        System.out.println("\nThe longest word is: "+longest);
    }

}
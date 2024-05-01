package LAB.LAB2.JavaCode;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Anagram Test = new Anagram();
        String t = "dog";
        String s = "God";
        System.out.println(Test.isAnagram(t, s));
    }
    public boolean isAnagram(String t, String s){
        ArrayList<Character> T = new ArrayList<>();
        ArrayList<Character> S = new ArrayList<>();
        t = t.toLowerCase();
        s = s.toLowerCase();
        if(t.length() != s.length()){
            return false;
        }
        for(int i = 0; i < t.length(); i++){
            Character temp = t.charAt(i);
            T.add(temp);
        }
        for(int j = 0; j < s.length(); j++){
            Character temp = s.charAt(j);
            S.add(temp);
        }
        Collections.sort(T);
        Collections.sort(S);
        for(int k = 0; k < T.size(); k++){
            if(T.get(k) != S.get(k)){
                return false;
            }
        }
        return true;
    }
}

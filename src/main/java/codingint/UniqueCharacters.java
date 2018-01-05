package codingint;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by borisgurtovyy on 10/30/17.
 */
public class UniqueCharacters {


    @Test
    public void testUniqueChars(){
        String s = "Hello, ultimate bootcamp 2!";
        HashMap<Character, Integer> result = uniqueChars(s);

        for(char ch : result.keySet()){
            int val = result.get(ch);
            System.out.println(ch + " => " + val);
        }
    }

    public HashMap<Character, Integer> uniqueChars(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray()){

            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                int oldValue = map.get(ch);
                oldValue++;
                map.put(ch, oldValue);
            }
        }
        return map;
    }

}

// Runtime compexity  ->   O(n)
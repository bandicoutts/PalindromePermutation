/*

Given a string, write a function to check if it is a permutation of a palin- drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.) Hints: #106, #121, #134, #136


Thought process for MVP:

- split string into a char array
- iterate through the char array, counting how many times each character appears
- if there's more than one letter that's in the string that appears an odd number of times, it can't be a palindrome

 */

import java.util.*;

class PalindromePermutation {


    private static String getInput(){
        String result;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        result = reader.nextLine();
        return result;
    }

    private static void countCharacters(String string){
        java.util.HashMap<Character, Integer> mapOfChars = new java.util.HashMap<Character, Integer>();
        for (Character c: string.replaceAll("\\s","").toLowerCase().toCharArray()){
            if (mapOfChars.get(c) == null){
                mapOfChars.put(c, 1);
            } else {
                mapOfChars.put(c, mapOfChars.get(c)+1);
            }
        }
        System.out.println(mapOfChars);
    }




    public static void main(String args[]){

        String palindrome = getInput();
        countCharacters(palindrome);


    }
}
/*

Given a string, write a function to check if it is a permutation of a palin- drome.
A palindrome is a word or phrase that is the same forwards and backwards.
A permutation is a rearrangement of letters.The palindrome does not need to be limited to just dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.) Hints: #106, #121, #134, #136


Thought process for MVP:

- split string into a char array
- iterate through the char array, counting how many times each character appears
- if there's more than one letter that's in the string that appears an odd number of times, it can't be a palindrome


Next step will be to show permutations of the string. I can do this by using a StringBuilder
and adding characters into the string builder, starting with the odd one in the centre, and then
placing odd characters on each side, starting with the character that has the highest count and then
working down from there.

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

        int oddCount = 0;

        for (int i : mapOfChars.values()){
            if (i % 2 != 0){
                oddCount += 1;
            }

        }

        if (oddCount > 1){
            System.out.println("The string is not a permutation of a palindrome.");
        } else {
            System.out.println("The string is a permutation of a palindrome!");
        }
    }




    public static void main(String args[]){

        String palindrome = getInput();
        countCharacters(palindrome);


    }
}
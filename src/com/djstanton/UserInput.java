package com.djstanton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInput {

    public static void main(String[] args){

    }

    public static List<String> wordList(String input) {
        //String delimiters = "[ \t,.:;?!\"']+";

        String[] words = input.split("[ \t,.:;?!\"']+");

        //List<String> strList = Arrays.asList(words);

        return Arrays.asList(words);

        //return strList;
    }


    public static String parseInput(String input) {
        String response = "ok";

        if (!input.equalsIgnoreCase("q")) {

            if (input.equals("")) {
                response = "The telepathic interface is temporarily offline, please enter a command";
            } else {

                List<String> parsedList = wordList(input);

                String verb = parsedList.get(0);
                String noun = parsedList.get(1);

                List<String> commands = new ArrayList<>(Arrays.asList("take", "drop", "throw"));
                List<String> objects = new ArrayList<>(Arrays.asList("sword", "ring", "snake"));

                if (parsedList.size() > 2) {
                    System.out.println("Only two word commands allowed!");
                } else {

                    if (!commands.contains(verb)) {
                        System.out.println("I don't know how to " + verb + ".");
                    }

                    if (!objects.contains(noun)) {
                        System.out.println("I don't know what " + noun + " is.");
                    }

                    System.out.println("Verb = " + verb);
                    System.out.println("Noun = " + noun);
                }
            }
        }
        return response;
    }

}

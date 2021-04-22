package com.djstanton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        String output;

        Game game = new Game();

        game.showIntro();

        do {
            System.out.print("> ");
            input = in.nextLine();  //in.readLine();
            output = game.runCommand(input);
            System.out.println(output);
        } while (!"q".equalsIgnoreCase(input));

        in.close();
    }

}

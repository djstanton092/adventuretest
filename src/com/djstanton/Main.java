package com.djstanton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.print("> ");
            input = scanner.nextLine();
            System.out.println(UserInput.parseInput(input));

        } while (!input.equalsIgnoreCase("q"));

        scanner.close();
    }

}

package hu.wordplay.service;

import java.util.Scanner;

/**
 * Created by Péter on 2017.04.14..
 */
public class Console {

    private final Scanner sc;

    public Console(Scanner sc) {
        this.sc = sc;
    }

    public String read() {
        return sc.nextLine();
    }
}

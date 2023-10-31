/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchFile;

import java.util.Scanner;
import java.util.List;
/**
 *
 * @author HI
 */
public class WordCounterView {
    private final Scanner scanner = new Scanner(System.in);

    public int promptUserForChoice() {
        System.out.println("===== Search File Program =====");
        System.out.println("1. Count Word In File");
        System.out.println("2. Find File By Word");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String promptForPath() {
        System.out.print("Enter Path: ");
        return scanner.nextLine();
    }

    public String promptForWord() {
        System.out.print("Enter Word: ");
        return scanner.nextLine();
    }

    public void displayWordCount(int count) {
        System.out.println("Count: " + count);
    }

    public void displayMatchingFiles(List<String> files) {
        for (String file : files) {
            System.out.println("File name: " + file);
        }
    }

    public void displayError(String message) {
        System.err.println(message);
    }
}

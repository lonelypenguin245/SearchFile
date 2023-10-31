/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchFile;

import java.util.List;

/**
 *
 * @author HI
 */
public class WordCounterController {
    private WordCounterModel model;
    private WordCounterView view;

    public WordCounterController(WordCounterModel model, WordCounterView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        while (true) {
            int choice = view.promptUserForChoice();
            switch (choice) {
                case 1:
                    String path = view.promptForPath();
                    String word = view.promptForWord();
                    int count = model.countWordInFile(path, word);
                    view.displayWordCount(count);
                    break;
                case 2:
                    path = view.promptForPath();
                    word = view.promptForWord();
                    List<String> matchingFiles = model.getFileNameContainsWordInDirectory(path, word);
                    view.displayMatchingFiles(matchingFiles);
                    break;
                case 3:
                    return;
                default:
                    view.displayError("Invalid choice. Please try again.");
            }
        }
    }
}

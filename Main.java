/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchFile;

/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) {
        WordCounterModel model = new WordCounterModel();
        WordCounterView view = new WordCounterView();
        WordCounterController controller = new WordCounterController(model, view);

        controller.run();
    }
}

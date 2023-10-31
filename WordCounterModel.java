/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HI
 */
public class WordCounterModel {
    public int countWordInFile(String fileSource, String word) {
        int count = 0;
        FileReader fr = null;
        try {
            fr = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return count;
    }

    public List<String> getFileNameContainsWordInDirectory(String source, String word) {
        List<String> matchingFiles = new ArrayList<>();
        File folder = new File(source);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (countWordInFile(file.getAbsolutePath(), word) != 0) {
                    matchingFiles.add(file.getName());
                }
            }
        }
        return matchingFiles;
    }
}

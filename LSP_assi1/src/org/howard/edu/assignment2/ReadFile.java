package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFile {
  public static void main(String[] args) {
    Map<String, Integer> wordCount = new LinkedHashMap<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
  
        String[] words = line.split(" ");

        for (String word : words) {
          
          word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();

          int count = wordCount.getOrDefault(word, 0);
          wordCount.put(word, count + 1);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

 
    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}


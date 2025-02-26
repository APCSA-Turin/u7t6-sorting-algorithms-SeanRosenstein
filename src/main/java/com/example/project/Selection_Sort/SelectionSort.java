package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int minIdx = 0;
        int temp = 0;
       for (int i = 0; i<elements.length; i++){
        minIdx = i;
        for (int n = i; n<elements.length; n++){
            if (elements[n]<elements[minIdx]){
                minIdx=n;
            }
        }
            temp = elements[i];
            elements[i]=elements[minIdx];
            elements[minIdx]=temp;
       }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int minIdx = 0;
        String temp = "";
       for (int i = 0; i<words.size(); i++){
        minIdx = i;
        for (int n = i; n<words.size(); n++){
            if (words.get(n).compareTo(words.get(minIdx))<0){
                minIdx=n;
            }
        }
            temp = words.get(i);
            words.set(i,words.get(minIdx));
            words.set(minIdx,temp);       }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
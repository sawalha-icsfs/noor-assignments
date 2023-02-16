package com.jkframework.training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;

public class Day1 {
	private static List<Integer> mostFreq3Number = new ArrayList<Integer>();

	public static Integer findKey(HashMap<Integer, Integer> map, int value) {
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == value) {
				if (mostFreq3Number.contains(entry.getKey())) {
					continue;
				} else {
					return entry.getKey();
				}
			}
		}
		return null;
	}
	
	public static List<Integer> sortArray(HashMap<Integer, Integer> map) {

		List<Integer> FreqNumList = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			FreqNumList.add(entry.getValue());
		}

		Collections.sort(FreqNumList);
		return FreqNumList;
	}

	public static List<Integer> findMostFrequent(int[] array) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int count = 0;// value
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}

			if (count > 1) {
				map.put(array[i], count);
			}
		}

		List<Integer> frequentList = sortArray(map);

		mostFreq3Number.add(findKey(map, frequentList.get(frequentList.size() - 1)));
		mostFreq3Number.add(findKey(map, frequentList.get(frequentList.size() - 2)));
		mostFreq3Number.add(findKey(map, frequentList.get(frequentList.size() - 3)));
		return mostFreq3Number;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int arraySize;
		int arraySum = 0, averge = 0;
		System.out.println("Please enter integer number greater than 10,000");
		arraySize = scanner.nextInt();
		while (arraySize < 10000) {
			System.out.println("should be more than 10,000");
			arraySize = scanner.nextInt();
		}
		int myArray[] = new int[arraySize];
		 File f = new File("D:/Source/java-sde1-training/training/src/main/resources/ArrayList.txt");
		FileWriter file = new FileWriter(f);
		if (f.createNewFile()) {
			System.out.println("File created: " + f.getName());
		} else {
			System.out.println("File already exists.");
		}
		

		for (int i = 0; i < arraySize; i++) {
			myArray[i] =random.nextInt(1000);

			arraySum = arraySum + myArray[i];
			file.write((int) myArray[i] + "\r");

		}
		file.close();
		averge = arraySum / arraySize;
		
		findMostFrequent(myArray);
	}

}

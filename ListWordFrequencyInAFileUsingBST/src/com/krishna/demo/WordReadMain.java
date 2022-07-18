package com.krishna.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordReadMain {

	public static void main(String[] args) {

		BinarySearchTree treeMap = new BinarySearchTree();
		
		try(FileReader fileReader = new FileReader("WordFile");){
			int ch;
			String word = "";
			while((ch=fileReader.read())!=-1) {
				if(ch!=9 && ch!=10 && ch!=11 && ch!=32 && ch!=33 && ch!=34 && ch !=38 && ch!=39 && ch!=40 && ch!=41 && ch!=45 && ch!=44 && ch!=46 && ch !=59) {
					word = word.concat(Character.toString(ch));
				}else {
					if(word.trim().equals("")==false) {
						treeMap.insert(new WordFrequencyClass(word));
						word = "";
					}
				}
			}
			if(word.equals("")==false) {
				treeMap.insert(new WordFrequencyClass(word));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		treeMap.inorderTraversal();
	}

}

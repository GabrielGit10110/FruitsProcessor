package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitsCtrl implements IFilesController {
	
	public FruitsCtrl() {
		super();
	}

	@Override
	public void readFile(String path, String name, String extension) throws IOException {
		File file = new File(path, name + extension);
		
		if (file.exists() && file.isFile()) {
			FileInputStream fileInput = new FileInputStream(file); // open file
			InputStreamReader reader = new InputStreamReader(fileInput); // read file
			BufferedReader buffer = new BufferedReader(reader); // put it inside a buffer
			
			String line = buffer.readLine(); // put all the buffered lines inside a String
			System.out.println("=============================================================================================");
			System.out.printf("%-35s %-40s %s%n", "NOME", "NOME_CIENTIFICO", "SUBGRUPO");
			System.out.println("=============================================================================================");
			while (line != null) {
				line = buffer.readLine();
				if (line != null) {
					String[] fruit = line.split(";");

					if (fruit[3].contains("Fruit")) {
						System.out.printf("%-35s %-40s %s%n", fruit[0], fruit[1], fruit[3]); // Implementação com tabulação correta ( ° u °)_b
//						System.out.println(fruit[0]+"\t"+fruit[1]+"\t"+fruit[2]+"\t"+fruit[3]);
						
					}

				}
				
			}
			buffer.close(); // close the buffer
			reader.close(); // close the file reader
			fileInput.close(); // close the file
		} else {
			throw new IOException("Invalid file...");
		}
		
	}

	@Override
	public void openFile(String path, String name, String extension) throws IOException{

	}

	@Override
	public void readDir(String path) throws IOException {
		
	}

	@Override
	public void createFile(String path, String name, String extension) throws IOException {

	}

}

package view;

import java.io.IOException;

import controller.FruitsCtrl;
import controller.IFilesController;

public class FrutasMain {

	public static void main(String[] args) {
		IFilesController arqCont = new FruitsCtrl();
		String dirLinux = "/tmp/CSVs/fruits";
		String file = "generic_food";
		String extension = ".csv";
		
		try {
			arqCont.readFile(dirLinux, file, extension);
		}
		catch (IOException e) {
			System.err.println("Input or Output error:");
			System.err.println(e.getMessage());
		}

	}

}

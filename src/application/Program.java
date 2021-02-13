package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		String[] produtos = new String[] {
				"TV Led, 1290.99, 1",
				"Video Game Chair, 350.50, 3",
				"Samsung Galaxy 9, 850.00, 2"
				};
		
		String[] produtos2 = new String[] {"TV Led", "Video Game Chair", "Samsung Galaxy 9"};
		
		int[] quant = new int[] {1, 3, 2};
		double[] price = new double[] {1290.99, 350.50, 850.00};
		double[] totalValue = new double[price.length];
		
		String path = "C:\\TestArquive\\teste.csv";
		String path2 = "C:\\TestArquive";
		
		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//			
//			for (String pro : produtos) {
//				
//				bw.write(pro);
//				bw.newLine();
//			}
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			String lines = br.readLine();
//			
//			while (lines != null) {
//				System.out.println(lines);
//				lines = br.readLine();
//				
//			}
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		for (int i = 0; i < price.length; i++) {
			totalValue[i] = quant[i] * price[i]; 
		}
		boolean file = new File(path2 + "\\out").mkdir();
		
		
		path2 = "C:\\TestArquive\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
			
			for (int i = 0; i < produtos2.length; i++) {
				bw.write(produtos2[i] + ", " + totalValue[i]);
				bw.newLine();
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path2))) {
			
			String lines = br.readLine();
			
			while(lines != null) {
				System.out.println(lines);
				lines = br.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
	}

}

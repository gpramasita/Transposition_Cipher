/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentcleancode;

import java.util.Objects;

/**
 *
 * @author gpramasita
 */
public class TranspositionCipher {
public static void main(String[] args) {
		String pesan = "PEGADAIAN";
		String[] pesanArray = pesan.split("");
		int column = 4;
		int row = (pesanArray.length+4)/4;
		String enkripsi = "";

		String [][] pesan2dArray = new String[row][column];
		int count = 0;
		for (int row1 = 0; row1 < pesan.length(); row1 ++){
			for (int column1 = 0; column1 < column; column1++){
				if (count == pesan.length()){
					break;
				}
				pesan2dArray[row1][column1] = pesanArray[count];
				count++;
			}
		}
		for (int row1 = 0; row1 < pesan2dArray[0].length; row1 ++){
			for (int column1 = 0; column1 < pesan2dArray.length; column1++){
				if (Objects.isNull(pesan2dArray[column1][row1])){
					System.out.print("");
				}else{
					enkripsi += pesan2dArray[column1][row1];
				}
			}
		}
		System.out.println("Pesan Enkripsi: "+enkripsi);
	}
}

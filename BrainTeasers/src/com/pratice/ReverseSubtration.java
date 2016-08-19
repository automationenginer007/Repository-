package com.pratice;

import java.awt.image.ConvolveOp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Parser;

public class ReverseSubtration {


	public static void main(String[] args) {


		for(int i=999;i<=9999;i++)
		{

			int count=0;
			int number = i;
			int reversedNumber = 0;
			int temp = 0;
			int subtractValue=0;

			while(number > 0){
				temp = number%10;
				reversedNumber = reversedNumber * 10 + temp;
				number = number/10;

			}
			//					System.out.println("Reversed Number is: " + reversedNumber);
			if(reversedNumber > i){
				subtractValue=reversedNumber-i;
			}else{
				subtractValue=i-reversedNumber;
			}
			/*System.out.println(i+"   "+reversedNumber);
			System.out.println(subtractValue);
			 */
			String originalNumber = Integer.toString(i);
			char[] orgArr = originalNumber.toCharArray();

			String subtractValue1= Integer.toString(subtractValue);
			char[] subArr = subtractValue1.toCharArray();

			for(int j=0;j<orgArr.length;j++){

				char a = orgArr[j];

				for(int k=0;k<subArr.length;k++){

					char b = subArr[k];

					if(a==b){
						subArr[k] = '-';
						count++;
						System.out.println();
						for(int ij = 0;ij < subArr.length; ij++){
							System.out.print(subArr[ij]);
						}
						System.out.println();
					}
				}
			}
			if(count==2){

				System.out.println(i+"   "+reversedNumber);
				System.out.println(subtractValue);
			}


		}

	}
}



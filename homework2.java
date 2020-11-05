package helloworld;

import java.util.Random;
import java.util.Scanner;

public class homework2 {

	public static void reverse(int number) {
		int ret = 0;
		while (number != 0) {
			ret = ret * 10 + number % 10;
			number /= 10;
		}
		System.out.println(ret);
	}

	public static void printMatrix(int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(r.nextInt(2) + " ");
			}
			System.out.println();
		}
	}

	public static void countRandom() {
		int[] randomHundred = new int[100];
		int[] countRandom = new int[10];
		for (int i = 0; i < randomHundred.length; i++) {
			randomHundred[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < randomHundred.length; i++) {
			countRandom[randomHundred[i]]++;
		}
		for (int i = 0; i < countRandom.length; i++) {
			System.out.println(i + "的出现次数为: " + countRandom[i]);
		}
	}

	public static int indexOfSmallestElement(double[] array) {
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[min]) {
				min = i;
			}
		}
		System.out.println("最小元素的下标为：" + min);
		return min;
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		System.out.println("Sum of the elements in the major diagonal is " + sum);
		return sum;
	}

	public static void main(String[] args) {
		int a, b;
		double[] array = new double[10];
		double[][] matrix = new double[4][4];
		Scanner in = new Scanner(System.in);

		// 第一题
		System.out.print("请输入一个整数：");
		a = in.nextInt();
		reverse(a);

		// 第二题
		b = in.nextInt();
		printMatrix(b);

		// 第三题
		countRandom();

		// 第四题
		System.out.print("请输入10个数字：");
		for (int i = 0; i < 10; i++) {
			array[i] = in.nextDouble();
		}
		indexOfSmallestElement(array);

		// 第五题
		System.out.println("请输入4*4的矩阵");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextDouble();
			}
		}
		sumMajorDiagonal(matrix);

		in.close();
	}

}

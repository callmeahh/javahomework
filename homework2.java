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
			System.out.println(i + "�ĳ��ִ���Ϊ: " + countRandom[i]);
		}
	}

	public static int indexOfSmallestElement(double[] array) {
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[min]) {
				min = i;
			}
		}
		System.out.println("��СԪ�ص��±�Ϊ��" + min);
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

		// ��һ��
		System.out.print("������һ��������");
		a = in.nextInt();
		reverse(a);

		// �ڶ���
		b = in.nextInt();
		printMatrix(b);

		// ������
		countRandom();

		// ������
		System.out.print("������10�����֣�");
		for (int i = 0; i < 10; i++) {
			array[i] = in.nextDouble();
		}
		indexOfSmallestElement(array);

		// ������
		System.out.println("������4*4�ľ���");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextDouble();
			}
		}
		sumMajorDiagonal(matrix);

		in.close();
	}

}

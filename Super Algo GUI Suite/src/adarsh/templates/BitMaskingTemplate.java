package adarsh.templates;

import java.util.ArrayList;

public interface BitMaskingTemplate {
	// helper functions
	String oddOrEven(int n);
	int getIthBit(int n, int i);
	void clearIthBit(int n, int i);
	void setIthBit(int n, int i, int val);
	void clearLastIBits(int n, int i);
	void clearRangeOfBits(int n, int i, int j);
	void replaceBits(int n, int num, int i, int j);
	int countSetBits(int n);
	int decimalToBinary(int n);
	int numberOfBits(int n);
	
	// challenges
	String powerOf2(int n);
	String powerOf4(int n);
	ArrayList<Integer> decodeXORed(ArrayList<Integer> encoded, int first);
	ArrayList<Integer> sortByNoOf1Bits(ArrayList<Integer> arr);
	int longestContinuousRunOf1s(int n);
	int hammingDistance(int x, int y);
	int uniqueNumber1(ArrayList<Integer> n);
	ArrayList<Integer> uniqueNumber2(ArrayList<Integer> n);
	int uniqueNumber3(ArrayList<Integer> n);
	int matrixScore(ArrayList<ArrayList<Integer>> matrix);
	int rangeBitwiseAnd(int left, int right);
	int totalHammingDistance(ArrayList<Integer> nums);
	ArrayList<Integer> decodeXORPermutation(ArrayList<Integer> encoded);
}

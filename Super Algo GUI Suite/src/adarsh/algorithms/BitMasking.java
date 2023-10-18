package adarsh.algorithms;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;

import adarsh.listeners.BitMaskingBL;
import adarsh.main.App;
import adarsh.templates.BitMaskingTemplate;

public class BitMasking {
	private App app;
	private ArrayList<JButton> features;
	public BitMaskingAlgorithms bma;
	
	public BitMasking() {}
	
	public void init(App app) {
		this.app = app;
		features = new ArrayList<JButton>();
		bma = new BitMaskingAlgorithms(this);
		initButtons();
		renderButtons();
	}
	
	private void initButtons() {
		features.add(new JButton("Odd or Even"));
		features.add(new JButton("Get Ith Bit"));
		features.add(new JButton("Clear Ith Bit"));
		features.add(new JButton("Set Ith Bit"));
		features.add(new JButton("Clear Last I Bits"));
		features.add(new JButton("Clear Range of Bits"));
		features.add(new JButton("Replace Bits"));
		features.add(new JButton("Count Set Bits"));
		features.add(new JButton("Decimal to Binary"));
		features.add(new JButton("Number of Bits"));
	}
	
	private void renderButtons() {
		for(int i = 0; i < features.size(); i++) {
			JButton b = features.get(i);
			b.setForeground(Color.RED);
			b.setBackground(new Color(255, 138, 138));
			b.setSize(new Dimension(140, 50));
			if(i%4==0) {
				b.setLocation(30, 150 + (i*30));				
			}else {
				b.setLocation(features.get(i-1).getX() + 150, features.get(i-1).getY());
			}
			b.setVisible(true);
			b.addActionListener(new BitMaskingBL(app));
			app.getFrame().add(b);
		}
	}
	
	public ArrayList<JButton> getButtons(){
		return features;
	}
	
	public class BitMaskingAlgorithms implements BitMaskingTemplate{
		private BitMasking bitMasking;
		
		public BitMaskingAlgorithms(BitMasking bitMasking) {
			this.bitMasking = bitMasking;
		}

		@Override
		public String oddOrEven(int n) {
			if((n & 1) == 0) {
				return "even";
			}
			return "odd";
		}

		@Override	
		public int getIthBit(int n, int i) {
			int mask = 1 << i;
			return ((n & mask) == 1) ? 1 : 0;
		}

		@Override
		public void clearIthBit(int n, int i) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setIthBit(int n, int i, int val) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void clearLastIBits(int n, int i) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void clearRangeOfBits(int n, int i, int j) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void replaceBits(int n, int num, int i, int j) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int countSetBits(int n) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int decimalToBinary(int n) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int numberOfBits(int n) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String powerOf2(int n) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String powerOf4(int n) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<Integer> decodeXORed(ArrayList<Integer> encoded, int first) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<Integer> sortByNoOf1Bits(ArrayList<Integer> arr) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int longestContinuousRunOf1s(int n) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int hammingDistance(int x, int y) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int uniqueNumber1(ArrayList<Integer> n) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ArrayList<Integer> uniqueNumber2(ArrayList<Integer> n) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int uniqueNumber3(ArrayList<Integer> n) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int matrixScore(ArrayList<ArrayList<Integer>> matrix) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int rangeBitwiseAnd(int left, int right) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int totalHammingDistance(ArrayList<Integer> nums) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ArrayList<Integer> decodeXORPermutation(ArrayList<Integer> encoded) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}



}


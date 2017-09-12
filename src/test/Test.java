package test;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test {
	public int gt() {
		int i=1;
		try {
			return i;
		} catch (Exception e) {
			return 0;
		}finally {
			 i=i+1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Test().gt());
	}
}

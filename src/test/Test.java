package test;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test {
	public int gt() {
		int i=199;
		
		int a=0;
		try {
			return i;
		} catch (Exception e) {
			return 0;
		}finally {
			 i=i+1;
		}
	}
	

}

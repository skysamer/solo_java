package ch7;

public class InnerEx3 {
	private int outerlv=0;
	private int outercv=0;
	
	class InstanceInner{
		int iiv=outerlv;
		int iiv2=outercv;
	}
	
	static class StaticInner{
	}
	
	void myMethod() {
		int lv=0;
		final int LV=0;
		
		class LocalInner{
			int iiv=outerlv;
			int iiv2=outercv;
			
			int liv3=lv;
			int liv4=LV;
		}
	}

}

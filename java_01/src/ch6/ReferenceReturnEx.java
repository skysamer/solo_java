package ch6;

public class ReferenceReturnEx {
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		
		Data d2=copy(d);
		System.out.printf("d.x= %d%n", d.x);
		System.out.printf("d2.x= %d%n", d2.x);
	}
	
	static Data copy(Data d) {
		Data tmp=new Data();
		tmp.x=d.x;
		return tmp;
	}

}

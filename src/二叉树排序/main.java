package ¶ş²æÊ÷ÅÅĞò;


public class main {

	public static void main(String[] args) {
		Note n = new Note();
		System.out.println("ÅÅĞòÇ°£º");
		for(int i =0; i<20;i++) {
			int a = (int)(Math.random()*100);
			System.out.print(a +",");
			n.add(a);
		}
		
		System.out.println("\nÅÅĞòºó£º");
		System.out.println(n.print());

	}

}

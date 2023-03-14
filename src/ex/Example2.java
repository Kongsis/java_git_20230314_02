package ex;

public class Example2 {
	
	public void numberTable() {
		for(int i=0; i<10; i++) {
			System.out.println();
			for(int j=2; j<10; j++) {
				if(i == 0) {
					System.out.print(j + "단"+"\t"+"\t");
				}else {
					System.out.printf("%d * %d = %d\t", j,i,(j*i));
				}
			}
		}
	}
}

package honux.calender;

public class Calender {

	public static void main(String[] args) {
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("--------------------");
		for (int j = 0; j < 4; j++){
			for (int k = 1; k < 8; k++){
				if (k==7){
					System.out.println(j*7 + k);
				} else {
					System.out.print(j*7 + k + " ");
				}
				
			}
		}
	}
}

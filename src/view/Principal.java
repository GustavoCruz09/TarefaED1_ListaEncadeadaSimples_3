package view;

import Model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista l = new Lista();
		
		int[] vt = {3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16};
		
		for(int i = 0; i < 11; i++) {
			if(i == 0) {
				l.addFirst(vt[i]);
			} else {
				try {
					l.addLast(vt[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		int tamanho = l.size();
		
		for(int i = tamanho - 1; i > 0; i--) {
			try {
				System.out.println(l.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

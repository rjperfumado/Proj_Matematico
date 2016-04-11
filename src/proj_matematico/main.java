package proj_matematico;

import com.ibm.lang.management.TotalPhysicalMemoryNotificationInfo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
			
			ExercicioJava somaInteiro = new ExercicioJava();
		
			while (somaInteiro.limiteInicio <= somaInteiro.limiteFim) {
				
				int total = somaInteiro.limiteInicio++ ;
				
			System.out.printf("\nA soma dos valores é : " + total  );  
				
								
				
			}
	}
	
}



		

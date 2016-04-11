package proj_matematico;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
			
			ExercicioJava somaInteiro = new ExercicioJava();
		
			while (somaInteiro.limiteInicio <= somaInteiro.limiteFim) {
				
				int total = somaInteiro.limiteInicio+(somaInteiro.limiteInicio++);
				
			System.out.printf("\nA soma dos valores é : " + total );  
				
								
				
			}
	}
	
}



		

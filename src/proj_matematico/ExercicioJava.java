
package proj_matematico;

public class ExercicioJava {

	private int somaInteiro;
	private int limiteInicio;
	private int limiteFim;
	private int numero1;
	private int numero2;
	private int nPar;
	private int nImpar;

	public int getSomaInteiro() {
		return somaInteiro;
	}

	public void setSomaInteiro(int somaInteiro) {
		this.somaInteiro = somaInteiro;
	}

	public int getLimiteInicio() {
		return limiteInicio;
	}

	public void setLimiteInicio(int limiteInicio) {
		this.limiteInicio = limiteInicio;
	}

	public int getLimiteFim() {
		return limiteFim;
	}

	public void setLimiteFim(int limiteFim) {
		this.limiteFim = limiteFim;

	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getnPar() {
		return nPar;
	}

	public void setnPar(int nPar) {
		this.nPar = nPar;
	}

	public int getnImpar() {
		return nImpar;
	}

	public void setnImpar(int nImpar) {
		this.nImpar = nImpar;
	}

	public long CalculaPA() {
		return (limiteInicio + limiteFim) * limiteFim / 2;
	}

}
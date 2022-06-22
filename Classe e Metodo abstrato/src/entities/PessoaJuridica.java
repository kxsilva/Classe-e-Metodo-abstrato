package entities;

public class PessoaJuridica extends Pessoa{

	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double impostoPago() {
		double imposto;
		if (numeroFuncionarios > 10) {
			imposto = super.getRendaAnual() * 14/100;
		} else {
			imposto = super.getRendaAnual() * 16/100;
		}
		return imposto;
	}

}

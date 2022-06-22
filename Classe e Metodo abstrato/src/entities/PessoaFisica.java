package entities;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	
	@Override
	public double impostoPago() {
		
		return super.getRendaAnual() * 25/100 - gastosSaude * 50/100;
	}

	
}

package entidades;

public class TrabalhadorTerceirizado extends Trabalhador {
	private Double despesas;
	public TrabalhadorTerceirizado() {
	}
	
	public TrabalhadorTerceirizado(Double despesas, String nome, Integer horas, Double valorPorHora) {
		super(nome, horas, valorPorHora);
		this.despesas = despesas;
	}
	
	public Double getDespesas() {
		return despesas;
	}

	@Override
	public final Double pagamento() {
		return horas * valorPorHora + despesas + (despesas * 0.11);
	}
}

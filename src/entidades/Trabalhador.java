package entidades;

public class Trabalhador {
	
	private String nome;
	protected Integer horas;
	protected Double valorPorHora;
	public Trabalhador() {
		super();
	}

	public Trabalhador(String nome, Integer horas, Double valorPorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento() {
		return horas * valorPorHora;
	}

}

package Exercicio1;

public class Comodo {

	private Integer id;
	private String descricao;
	private String medida;
	private Boolean possuiJanela;
	private Apartamento apartamento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public Boolean getPossuiJanela() {
		return possuiJanela;
	}
	public void setPossuiJanela(Boolean possuiJanela) {
		this.possuiJanela = possuiJanela;
	}
	public Apartamento getApartamento() {
		return apartamento;
	}
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	@Override
	public String toString() {
		return "Comodo [id=" + id + ", descricao=" + descricao + ", medida=" + medida + ", possuiJanela=" + possuiJanela
				;
	}
	
	
}

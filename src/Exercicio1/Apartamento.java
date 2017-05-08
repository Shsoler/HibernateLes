package Exercicio1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Apartamento {
	private Integer id;
	private String medida;
	private Boolean financiado;
	private BigDecimal valorCondominio;
	private String numero;
	private String piso;
	private Edificio edificio;
	private List<Comodo> comodos = new ArrayList<Comodo>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public Boolean getFinanciado() {
		return financiado;
	}
	public void setFinanciado(Boolean financiado) {
		this.financiado = financiado;
	}
	public BigDecimal getValorCondominio() {
		return valorCondominio;
	}
	public void setValorCondominio(BigDecimal valorCondominio) {
		this.valorCondominio = valorCondominio;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	public List<Comodo> getComodos() {
		return comodos;
	}
	public void setComodos(List<Comodo> comodos) {
		this.comodos = comodos;
	}
	@Override
	public String toString() {
		return "Apartamento [id=" + id + ", medida=" + medida + ", financiado=" + financiado + ", valorCondominio="
				+ valorCondominio + ", numero=" + numero + ", piso=" + piso + "]";
	}

	
}

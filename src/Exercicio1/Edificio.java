package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
	
	private Integer id;
	private String nome;
	private String endereco;
	private Integer estrelas;
	private Sindico sindico;
	private List<Apartamento> apartamentos = new ArrayList<Apartamento>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(Integer estrelas) {
		this.estrelas = estrelas;
	}
	public Sindico getSindico() {
		return sindico;
	}
	public void setSindico(Sindico sindico) {
		this.sindico = sindico;
	}
	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}
	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}
	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", estrelas=" + estrelas + "]";
	}
	

}

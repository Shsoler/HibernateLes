package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Sindico {

	private Integer id;
	private String nome;
	private List<Edificio> edificios = new ArrayList<Edificio>();
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
	public List<Edificio> getEdificios() {
		return edificios;
	}
	public void setEdificios(List<Edificio> edificios) {
		this.edificios = edificios;
	}
	@Override
	public String toString() {
		return "Sindico [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
}

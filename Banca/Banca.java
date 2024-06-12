package Banca;
import java.util.ArrayList;

public class Banca {
	
	private String nome;
	private String località;
	private ArrayList<Conto> contiAperti;

	public Banca(String nome, String località){
		this.nome = nome;
		this.località = località;
		contiAperti = new ArrayList<Conto>();
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setLocalità(String località){
		this.località = località;
	}

	public String getNome(){
		return nome;
	}

	public String getLocalità(){
		return località;
	}

	public void addConto(Conto conto){
		contiAperti.add(conto);
	}

	public void mostraConti(){
		for (Conto conto : contiAperti) {
			System.out.println();
			conto.mostraInfo();
		}
	}
}

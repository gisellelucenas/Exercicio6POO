package senai.org.br;

import java.time.LocalDate;
import java.time.Period;
 
public class Pessoa {
	private String name;
	private LocalDate datadeNascimento;
	private String datadeNascimentoPrint;
	private float altura;
	
	
	//calcular a idade da pessoa. 
	public Integer idade() {
		final LocalDate dataAtual = LocalDate.now();
		final Period periodo = Period.between(datadeNascimento, dataAtual);
		return periodo.getYears();
		
	}

	//servirá para imprimir todos os dados da pessoa.
	public String dados() {
		return "Name: " +name+  
			   "\nData Nascimento: " +datadeNascimentoPrint+ 
			   "\nIdade: "+idade()+
			   "\nAltura: " +altura;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(LocalDate datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	public String getDatadeNascimentoPrint() {
		return datadeNascimentoPrint;
	}

	public void setDatadeNascimentoPrint(String datadeNascimentoPrint) {
		this.datadeNascimentoPrint = datadeNascimentoPrint;
	}

	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	

}

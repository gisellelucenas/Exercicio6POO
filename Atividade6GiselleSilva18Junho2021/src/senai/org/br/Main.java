package senai.org.br;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Construi aqui a Classe Pessoa.
		Pessoa p1 = new Pessoa();

		// Aqui foram desenvolvidos os Objetos : Nome, Data nascimento e Altura.

		p1.setName(JOptionPane.showInputDialog("Digite seu Nome"));

		// Detalhes de DateTimeFormater adicionado para Atender ao modelo de data
		// Brasileiro .
		String dtNascimento = JOptionPane.showInputDialog("Digite sua data de Nascimento no formato dd/MM/YYYY");
		String dia = dtNascimento.substring(0, 2);
		String mes = dtNascimento.substring(3, 5);
		String ano = dtNascimento.substring(6);

		p1.setDatadeNascimentoPrint(dtNascimento);
		p1.setDatadeNascimento(LocalDate.parse(ano + "-" + mes + "-" + dia));

		p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a sua Altura")));

		JOptionPane.showMessageDialog(null, p1.dados());

	}

}

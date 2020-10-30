package exemplosBasicosemJava;

import javax.swing.JOptionPane;

public class CalculadoraBasica {
	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
		String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
		
		// Transforma string em inteiros 
		double x = Double.parseDouble(numero1);
		double y = Double.parseDouble(numero2);
		
		// Calcular as operações soma, subtração , divisão e multiplicação
		
		double soma = x + y;
		double subtr = x - y;
		double mult = x * y;
		double divisao = x / y;
		
		// Mostrar o resultado das operações 
		
		JOptionPane.showMessageDialog(null, 
				"Soma =" + soma  +"\n" +
		        "Subtração =" + subtr + "\n" +
				"Multiplicação =" + mult + "\n"	+
		        "Divisão = "+ divisao );
		}

}

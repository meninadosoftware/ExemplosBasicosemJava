package exemplosBasicosemJava;

import javax.swing.JOptionPane;

public class CalculadoraBasica {
	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro n�mero: ");
		String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo n�mero: ");
		
		// Transforma string em inteiros 
		double x = Double.parseDouble(numero1);
		double y = Double.parseDouble(numero2);
		
		// Calcular as opera��es soma, subtra��o , divis�o e multiplica��o
		
		double soma = x + y;
		double subtr = x - y;
		double mult = x * y;
		double divisao = x / y;
		
		// Mostrar o resultado das opera��es 
		
		JOptionPane.showMessageDialog(null, 
				"Soma =" + soma  +"\n" +
		        "Subtra��o =" + subtr + "\n" +
				"Multiplica��o =" + mult + "\n"	+
		        "Divis�o = "+ divisao );
		}

}

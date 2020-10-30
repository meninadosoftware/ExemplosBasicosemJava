package exemplosBasicosemJava;

import javax.swing.JOptionPane;

public class CalculoDecimoTerceiro {

	public static void main(String[] args) {
		// Declaração das variáveis 
	  String Salario, MesesTrabalhados;
	  
	    Salario = JOptionPane.showInputDialog("Digite o seu salário R$ :");
	    MesesTrabalhados = JOptionPane.showInputDialog("Digite a quantidade de meses trabalhados:");
	    
	    // Cálculo para retornar o valor do décimo terceiro
	    
	    String Resultado = String.valueOf(Float.parseFloat(Salario) / 12 * Float.parseFloat(MesesTrabalhados));
	   
	    // mensagem de resposta 
	    String mensagem  = "Seu décimo terceiro é:" + Resultado;
	    
	    JOptionPane.showMessageDialog(null, mensagem);
	    System.exit(0);
	   }

}

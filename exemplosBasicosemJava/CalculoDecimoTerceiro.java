package exemplosBasicosemJava;

import javax.swing.JOptionPane;

public class CalculoDecimoTerceiro {

	public static void main(String[] args) {
		// Declara��o das vari�veis 
	  String Salario, MesesTrabalhados;
	  
	    Salario = JOptionPane.showInputDialog("Digite o seu sal�rio R$ :");
	    MesesTrabalhados = JOptionPane.showInputDialog("Digite a quantidade de meses trabalhados:");
	    
	    // C�lculo para retornar o valor do d�cimo terceiro
	    
	    String Resultado = String.valueOf(Float.parseFloat(Salario) / 12 * Float.parseFloat(MesesTrabalhados));
	   
	    // mensagem de resposta 
	    String mensagem  = "Seu d�cimo terceiro �:" + Resultado;
	    
	    JOptionPane.showMessageDialog(null, mensagem);
	    System.exit(0);
	   }

}

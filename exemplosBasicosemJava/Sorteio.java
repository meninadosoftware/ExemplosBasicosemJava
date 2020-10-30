package exemplosBasicosemJava;

import javax.swing.JOptionPane;

public class Sorteio {

	  // declara��es das vari�veis 
	public static  Object Sorteio;
	
	private  int numero;
	// M�todo Sorteio para n�meros entre 1 e 10 
	Sorteio() {
		numero = (int) (1 + Math.random() * 10 );
		
	}
	
	// M�todos getter e setter do sorteio
	public int getNumero() {
		return numero;
	}

	public void setNumero(int n) {
		this.numero = n;
	}
	
	public static void main(String[] args) {
		  // Inicia o primeiro sorteio
		Sorteio PrimeiroSorteio = new Sorteio();
		
		int resultado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 1 e 10."));
		
		// Verifica os resultado do 1� sorteio 
		
		if(resultado ==PrimeiroSorteio.getNumero()) {
			JOptionPane.showMessageDialog(null, "Voc� ganhou o primeiro sorteio" );
		} else {
			JOptionPane.showMessageDialog(null, "Voc� perdeu o primeiro sorteio. \n O valor sorteado foi: " + PrimeiroSorteio.getNumero());
		}
		// Inicia o segundo sorteio
		
		Sorteio SegundoSorteio = new Sorteio();
		int resultado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 1 e 10"));
		
		// verificar os resultados do 2� sorteio 
		   if(resultado2 == SegundoSorteio.getNumero()) {
			   JOptionPane.showMessageDialog(null, "Voc� ganhou o segundo sorteio");
		   }else {
			   JOptionPane.showMessageDialog(null, "Voc� perdeu o segundo sorteio.\n O valor sorteado foi:"+ SegundoSorteio.getNumero());
		   }
		
		// Inicia o terceiro sorteio
			
			Sorteio TerceiroSorteio = new Sorteio();
			int resultado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 1 e 10"));
			
			// verificar os resultados do 3� sorteio 
			   if(resultado3 == TerceiroSorteio.getNumero()) {
				   JOptionPane.showMessageDialog(null, "Voc� ganhou o terceiro sorteio");
			   }else {
				   JOptionPane.showMessageDialog(null, "Voc� perdeu o terceiro sorteio.\n O valor sorteado foi:"+ TerceiroSorteio.getNumero());
			   }
			
         
	}

	

}

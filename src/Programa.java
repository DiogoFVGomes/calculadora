import javax.swing.JOptionPane;


public class Programa {

	
	public static void main(String[] args) {
		
		Integer a = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero a:"));		
		Integer b = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero b:"));
		
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.somar(a, b);
		
		JOptionPane.showMessageDialog(null, resultado);

	}

}

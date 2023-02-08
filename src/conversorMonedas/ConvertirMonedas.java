package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirPesosADolares(double valor) {
		double Dolar = valor / 4697.25;
		Dolar = (double) Math.round(Dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Dolar+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double Euro = valor / 5085.48;
		Euro = (double) Math.round(Euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +Euro+ " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double LibraEsterlina = valor / 5659.25 ;
        LibraEsterlina = (double) Math.round(LibraEsterlina *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +LibraEsterlina+ " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double Yen = valor / 35.80;
        Yen = (double) Math.round(Yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Yen+ " Yuanes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double Won = valor / 3.76;
        Won = (double) Math.round(Won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Won+ " Wons");
	}
}

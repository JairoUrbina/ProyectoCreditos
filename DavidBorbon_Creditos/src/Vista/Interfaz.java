package Vista;

import javax.swing.JOptionPane;

public class Interfaz
{
	public Interfaz()
	{
		
	}
	
	public String pedirTasaEf()
	{
		return (JOptionPane.showInputDialog(null,"Ingres� la tasa efectiva","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirValorCuota()
	{
		return (JOptionPane.showInputDialog(null,"Ingres� el valor de la cuota","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirValorAnualidad()
	{
		return (JOptionPane.showInputDialog(null,"Ingres� el valor de anual","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}

	
	public void mostrarTasaEf(double a) 
	{
		Object TasaEf = null;
		JOptionPane.showMessageDialog(null, TasaEf, "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarValorCuota(double b) 
	{
		Object vcuota = null;
		JOptionPane.showMessageDialog(null, vcuota, "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarValorAnualidad(double c) 
	{
		Object vanualidad = null;
		JOptionPane.showMessageDialog(null, vanualidad, "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}

}

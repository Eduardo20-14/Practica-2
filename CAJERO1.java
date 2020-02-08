//Eduardo Martinez Becerra
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class CAJERO1 extends JFrame implements ActionListener
	{
		int P, R, D, Divisible_100=100;
		int c1=0, c2=0, c3=0, c4=0;

		JButton boton1, boton2, boton3;
		
    public static void main(String[] args) 
    	{
    	
    	String pass="";
		do
		{
			pass=JOptionPane.showInputDialog("Contraseña: ");
			if(pass.equals("1234"))
				JOptionPane.showMessageDialog(null, "La Contraseña Es Correcta");
			else
				JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
		}while(pass.equals("1234")==false);
		
		new CAJERO1();
    }
    
    public CAJERO1()
    	{
		    	setTitle("CAJERO");
				setSize(450, 450);
				setLocationRelativeTo(null);
				setLayout(null);
				setVisible(true);
				
				boton1 = new JButton();
				boton1.setText("Depositar");
				boton1.setBackground(Color.CYAN);
				boton1.setBounds(185, 50, 100, 55);
				getContentPane().add(boton1);
				boton1.addActionListener(this);
				
				boton2 = new JButton();
				boton2.setText("Retirar");
				boton2.setBackground(Color.GREEN);
				boton2.setBounds(185, 150, 100, 55);
				getContentPane().add(boton2);
				boton2.addActionListener(this);
				
				boton3 = new JButton();
				boton3.setText("Consultar");
				boton3.setBackground(Color.MAGENTA);
				boton3.setBounds(185, 250, 100, 55);
				getContentPane().add(boton3);
				boton3.addActionListener(this);
    	
    }
    
    public void actionPerformed(ActionEvent evento)
		{
				if(evento.getSource()==boton1)
				{
					//Depositar
					P = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto?:  "));
					//D = P;
					if(P%Divisible_100==0 && P>0){
						D = P;
						JOptionPane.showMessageDialog(null, "Depositado Correctamente");
					}else
					JOptionPane.showMessageDialog(null, "Solo Multiplos De 100");
				}
			
				if(evento.getSource()==boton2)
				{
					//Retirar
					R = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto Desea Retirar?:  "));
					
					if(R<5500 && R<=D && R%Divisible_100==0 && R>0){
						D = P-R;
						JOptionPane.showMessageDialog(null, "Retiro Realizado Correctamente");
						JOptionPane.showMessageDialog(null, "Retiraste: "+R);
						
						if(R>=1000){
							c1= (int) R / 1000;
							R = R % 1000;
						}
						if(R>=500){
							c2= (int) R / 500;
							R = R % 500;
						}
						if(R>=200){
							c3= (int) R / 200;
							R = R % 200;
						}
						if(R>=100){
							c4= (int) R / 100;
							R = R % 100;
						}	
						JOptionPane.showMessageDialog(null, " De 1000:  "+c1+" \nDe 500: "+c2+" \nDe 200: "+c3+" \nDe 100: "+c4);
						
					}else
						JOptionPane.showMessageDialog(null, "Error");
				}
				if(evento.getSource()==boton3)
				{
					//Conultar
					JOptionPane.showMessageDialog(null, "Saldo Disponible: "+D);
				}

		}
    
}


// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Wireframe");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(500,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("<h1>Color Picker</h1>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<th>Name</th>");
		sb.append("<th>Hex</th>");
		sb.append("<th>RGB</th>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>Persian Green</td>");
		sb.append("<td>#00A693</td>");
		sb.append("<td>0,166,147</td>");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("<td>Venice Blue</td>");
		sb.append("<td>#055989</td>");
		sb.append("<td>5,89,137</td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>Pale Blue</th>");
		sb.append("<td>#73D1E4</td>");
		sb.append("<td>115,209,228</td>");
		sb.append("</tr>");
		sb.append("</table>");
		sb.append("</body>");
		sb.append("</head>");
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String htmlText = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		System.out.println(htmlText);
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}


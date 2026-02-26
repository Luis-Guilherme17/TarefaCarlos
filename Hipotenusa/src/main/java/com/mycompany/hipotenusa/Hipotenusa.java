
package com.mycompany.hipotenusa;

import javax.swing.JOptionPane;

public class Hipotenusa {

    public static void main(String[] args) {

    int cateto1, cateto2;
        
    cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o primeiro cateto: "));
     
    cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o segundo cateto: "));

    int hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);

    JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
    
   }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Johan Herrera
 *         Maria Camila Guzman 
 *         Alejandra Alvarado 
 */
public class Areas {
    
    double base;
    double altura;
    double radio;
    double areaCuadrado;
    double areaCirculo;
    double pi=3.1416;
    
    public Areas(){
        
    }
    
    public double datos(String mensaje){
        return Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
    }
     public void areaCuadrado(){
         areaCuadrado=this.base*this.altura;
     }
     public void areaCirculo(){
         areaCirculo=this.pi*(this.radio*this.radio);
     }
     public void resultado(String mensaje){
         JOptionPane.showMessageDialog(null, mensaje);
     }
   
}

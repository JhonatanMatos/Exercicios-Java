/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void Tabuada(int numero)
    {        
        for (int i=0;i<=10;i++)
        {            
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        Tabuada(7);
    }
    
    
}

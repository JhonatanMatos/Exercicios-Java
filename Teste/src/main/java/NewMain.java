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
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa denise = new Pessoa("Denise");
        Pessoa gabriel = new Pessoa("Gabriel");
        
        denise.DizerOlaPara(gabriel);
        gabriel.DizerOlaPara(denise);
        denise.PerguntarComoEsta(gabriel);
    }
    
}

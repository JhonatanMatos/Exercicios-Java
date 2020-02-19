/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Pessoa {
    private String nome;
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public Pessoa (String nome)
    {
        this.setNome(nome);
    }
    public void DizerOlaPara(Pessoa pessoa)
    {
        System.out.println(this.getNome() + ": Olá " + pessoa.getNome() + "!");
    }
    public void PerguntarComoEsta(Pessoa pessoa)
    {
        System.out.println(this.getNome() + ": Como você Está ?");
    }
}


package com.mycompany.exemplodepessoa;

public class ExemploDePessoa {

    public static void main(String[] args) {

        Pessoa umaPessoa = new Pessoa();
        
        umaPessoa.nome = "Carlos";
        umaPessoa.sexo = "Masculino";
        umaPessoa.pais = "Brasil";
        
        umaPessoa.anda ();
        umaPessoa.fala ();
        umaPessoa.corre ();
        umaPessoa.estuda ();
        umaPessoa.brinca ();
        umaPessoa.caracteristicas();
        
        umaPessoa = null;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneclienti;

/**
 *
 * @author angelo
 */
public class Cliente {
    private final String nome;
    private final String cognome;
    private final String codiceFiscale;
    private final String indirizzo;
    private final String gay="gayz";
    
    //costruttore
    public Cliente(String nome, String cognome, String codiceFiscale, String indirizzo) {
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
        this.indirizzo=indirizzo;
    }
    
    //metodi getter
    public String getNome() {
        return(nome);
    }
    public String getCognome() {
        return(cognome);
    }
    public String getCodiceFiscale() {
        return(codiceFiscale);
    }
    public String getIndirizzo() {
        return(indirizzo);
    }
    
    public String stampaCliente() {
        return("Cliente: " + nome + " " + cognome + " | CF: " + 
                codiceFiscale + " | Indirizzo: " + indirizzo);
    }
}

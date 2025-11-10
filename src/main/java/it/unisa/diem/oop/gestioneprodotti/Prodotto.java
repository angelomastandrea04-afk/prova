/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;

/**
 *
 * @author angelo
 */
public class Prodotto {
    private final int codice;
    private final String descrizione;
    private final double costo;
    private final String dataProduzione;
    
    //costruttore
    Prodotto(int cod, String descr, double cost, String data) {
        codice=cod;
        descrizione=descr;
        costo=cost;
        dataProduzione=data;
    }
    
    //metodi getter
    public int getCodice() {
        return(codice);
    }
    public String getDescrizione() {
        return(descrizione);
    }
    public double getCosto() {
        return(costo);
    }
    public String getDataProduzione() {
        return(dataProduzione);
    }
    
    public String stampaProdotto(){
        String costoForm = String.format("%.2f", costo);
        return (codice + ": " + descrizione + " (Costo: " + 
                costoForm + " €) --- Data Produzione: " + 
                dataProduzione);
    }
}

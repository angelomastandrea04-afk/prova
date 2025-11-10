/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;

import it.unisa.diem.oop.gestioneclienti.Cliente;

/**
 *
 * @author angelo
 */
public class Fattura {
    private final Prodotto[] prodotti; //final perché il reference non cambia mai
    private int riemp;
    static private int count = 0; //numero istanze create dalla classe
    private final int idFattura;
    private final Cliente destinatarioFattura; /*senza aver importato Cliente, 
                                                avrei dovuto mettere sempre
                                    it.unisa.diem.oop.gestioneclienti.Cliente
                                                al posto di Cliente*/
    private final String dataEmissione;
    private final double percentualeTassa;
    
    //costruttore
    public Fattura(int maxProdotti, Cliente destinatario, String dataEmissione, double percTassa) {
        prodotti = new Prodotto[maxProdotti];
        riemp=0;
        idFattura= ++count;
        destinatarioFattura=destinatario;
        this.dataEmissione=dataEmissione;
        percentualeTassa=percTassa;       
    }
    
    //metodi getter
    public int getRiemp() {
        return(riemp);
    }
    public int getCount() {
        return(count);
    }
    public int getIdFattura() {
        return(idFattura);
    }
    public Cliente getDestinatarioFattura() {
        return(destinatarioFattura);
    }
    public String getDataEmissione() {
        return(dataEmissione);
    }
    public double getPercentualeTassa() {
        return(percentualeTassa);
    }
    
    public void aggiungiProdotto(Prodotto p) {
        if (riemp < prodotti.length) {
            prodotti[riemp] = p;
            riemp++;
        } else {
            System.out.println("Impossibile aggiungere un nuovo prodotto.");
        }
    }
    
    public double calcolaImponibile() {
        double imponibile=0;
        for(int i=0; i<riemp; i++) {
            imponibile+=prodotti[i].getCosto();
        }
        return(imponibile);
    }
    
    public double calcolaTotale() {
        double imponibile=calcolaImponibile();
        return(imponibile + imponibile * percentualeTassa);
    }
    
    public String stampaFattura() {
        StringBuffer str= new StringBuffer();
        str.append("===== FATTURA ID: " + idFattura + " (" + dataEmissione + ") =====\n");
        
        str.append(destinatarioFattura.stampaCliente() + '\n');
        
        for(int i=0; i<riemp; i++) {
            str.append(prodotti[i].stampaProdotto() + '\n');
        }
        str.append("-------------------\n");
        
        str.append("Totale da pagare: €" + String.format("%.2f", calcolaTotale()) + "\n");
        
        return(str.toString());
    }
}

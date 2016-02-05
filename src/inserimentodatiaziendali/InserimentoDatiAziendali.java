/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserimentodatiaziendali;

import static inserimentodatiaziendali.EasyInput.*;

/**
 *
 * @author eliasforna
 */
public class InserimentoDatiAziendali {

    //Attributi Anagrafici
        protected int indexDefaultArrayNumero = 11;
	protected String nomeSocietà = " ";
	protected String nome = " ";
	protected String cognome = " ";
	protected char sesso = ' ';
	protected String codiceFiscale = " ";
	protected String partitaIva = " ";
        protected String numeroTelefonoFisso = " ";
        protected String[] numeroTelefonoFissoArray = new String [indexDefaultArrayNumero];
        protected String numeroCellulare = " ";
        protected String[] numeroCellulareArray = new String [indexDefaultArrayNumero];
        
    //Attributi Residenza
	protected String indirizzoResidenza = " ";
	protected int numeroCivicoResidenza = 0;
	protected String capResidenza = " ";
	protected String paeseResidenza = " ";
	protected String provinciaResidenza = " ";
	protected String nazioneResidenza = " ";
    //Attributi Attività
        protected String nomeAttività = " ";
	protected String indirizzoAttività = " ";
	protected int numeroCivicoAttività = 0;
	protected String capAttività = " ";
	protected String paeseAttività = " ";
	protected String provinciaAttività = " ";
	protected String nazioneAttività = " ";
    //Attributi Calcolo Ore Lavorative
        protected double totalePrezzoOre = 0.0;
        protected double totalePrezzoIva = 0.0;
	protected static int prezzoIVA = 0;
	protected double totaleOre = 0.0;
	protected static double prezzoOra = 0.0;
    //Attributi Calcolo Kilometri Lavorativi
        protected double totalePrezzoKM = 0.0; 
	protected double kilometriTot = 0.0;
	protected static double prezzoAlKm = 0.38;
    //Attributi Costi Aggiuntivi
	protected  double pedaggiAutoStradali = 0.0;
	protected double prezzoViveri = 0.0;
	protected double prezzoPernottamenti = 0.0;
	protected double prezzoVoli = 0.0;
	protected double prezzoSosteParcheggi = 0.0;
	
        //METODI INSERIMENTO
        
        //Inserimento Dati Anagrafici Cliente
	public String insNomeSocieta()
	{
		nomeSocietà = inputS("Nome Società:");
		return nomeSocietà;
	}
        
        public String insNome()
        {
            nome = inputS("Nome:");
            return nome;
        }
        
        public String insCognome()
        {
            cognome = inputS("Cognome:");
            return cognome;
        }
        
        public char insSesso()
        {
            sesso = inputC("Sesso:");
            return sesso;
        }
        
        public String insCodiceFiscale()
        {
            codiceFiscale = inputS("Codice Fiscale:");
            return codiceFiscale;
        }
        
        public String insPartitaIva()
        {
            partitaIva = inputS("Partita Iva:");
            return partitaIva;
        }
        
        public String insNumeroTelefonoFisso()
        {
            numeroTelefonoFisso = inputS("Telefono Fisso:");
            return numeroTelefonoFisso;
        }
        
        public String[] insNumeriTelefono()
        {
            for(int i = 1;i < indexDefaultArrayNumero; i++)
            {
                numeroTelefonoFissoArray[i] = inputS("Numero Telefono" + " " + i);
            }
            return numeroTelefonoFissoArray;
        }
        
        public String insNumeroCellulare()
        {
            numeroCellulare = inputS("Numero Cellulare:");
            return numeroCellulare;
        }
        
        public String[] insNumeriCellulari()
        {
            for(int i = 0; i < indexDefaultArrayNumero; i++)
            {
                numeroCellulareArray[i] = inputS("Numero Cellulare" + " " + i); 
            }
            return numeroCellulareArray;
           
        }
        
        //Inserimento Dati di Residenza Cliente
        
        public String insIndirizzoResidenza()
        {
            indirizzoResidenza = inputS("Indirizzo di Residenza:");
            return indirizzoResidenza;
        }
        
        public int insNumeroResidenza() 
        {
            numeroCivicoResidenza = inputI("Numero Civico:");
            return numeroCivicoResidenza;
        }
        
        public String insCapResidenza()
        {
            capResidenza = inputS("CAP:");
            return capResidenza;
        }
        
        public String insPaeseResidenza()
        {
            paeseResidenza = inputS("Paese Residenza:");
            return paeseResidenza;
                    
        }
        
        public String insProvincia()
        {
            provinciaResidenza = inputS("Provincia Residenza:");
            return provinciaResidenza;
        }
        
        public String insNazione()
        {
            nazioneResidenza = inputS("Nazione Residenza:");
            return nazioneResidenza;
        }
        
        //Inserimento Dati Locazione Azienda
        
        public String insNomeAttività()
        {
            nomeAttività = inputS("Nome Attività");
            return nomeAttività;
        }
        
        public String insIndirizzoAttività()
        {
            indirizzoAttività = inputS("Indirizzo Attività:");
            return indirizzoAttività;
        }
        
        public String insCAPAttività()
        {
            capAttività = inputS("CAP Attività");
            return capAttività;
        }
        
        public String insPaeseAttività()
        {
            paeseAttività = inputS("Paese Attività:");
            return paeseAttività;
        }
        
        public String insProvinciaAttività()
        {
            provinciaAttività = inputS("Provincia Attività:");
            return paeseAttività;
        }
        
        public String insNazioneAttività()
        {
            nazioneAttività = inputS("Nazione Attività:");
            return nazioneAttività;
        }
        
        //Inserimento per Calcolo Ore Lavorative
        
        public int insPercIVA()
        {
            prezzoIVA = inputI("Percentuale Iva:"); 
            return prezzoIVA;
        }
        
        public double insTotaleOre()
        {
            totaleOre = inputD("Totale Ore:");
            return totaleOre;
        }
        
        public double insPrezzoOra()
        {
            prezzoOra = inputD("Prezzo Ora:");
            return prezzoOra;
        }
        
        //Inserimento per Calcolo prezzo totale dei KM effuttuati
        
        public double insKilometriTotali()
        {
            kilometriTot = inputD("Kilometri Totali:");
            return kilometriTot;
        }
        
        //Inserimento dei costi supplementari
        
        public double insPedaggiAutoStradali()
        {
            pedaggiAutoStradali = inputD("Pedaggi Autostradali (€)");
            return pedaggiAutoStradali;
        }
        
        public double insPrezzoViveri()
        {
            prezzoViveri = inputD("Prezzo Viveri:");
            return prezzoViveri;
            
        }
        
        public double insPrezzoVoli()
        {
            prezzoVoli = inputD("Prezzo Voli:");
            return prezzoVoli;
        }
        
        public double insPrezzoPernottamenti()
        {
            prezzoPernottamenti = inputD("Prezzo Pernottamenti:");
            return prezzoPernottamenti;
        }
        
        public double insPrezzoSosteParcheggi()
        {
            prezzoSosteParcheggi = inputD("Prezzo Soste e Parcheggi");
            return prezzoSosteParcheggi;
        }
        
        //METODI DI STAMPA
        
        //Stampa Dati Anagrafici Cliente 
        public void outNomeSocietà()
        {
            System.out.println("Nome Società:" + " " + nomeSocietà);
        }
        
        public void outNome()
        {
            System.out.println("Nome:" + " " +nome);
        }
        
        public void outCognome()
        {
            System.out.println("Cognome:" + " " + cognome);
        }
        
        public void outSesso()
        {
            System.out.println("Sesso:" + " " + sesso);
        }
        
        public void outCodiceFiscale()
        {
            System.out.println("Codice Fiscale:" + " " + codiceFiscale);
        }
        
        public void outPartitaIva()
        {
            System.out.println("PartitaIva:" + " " +partitaIva );
        }
        
        public void outNumeroTelefonoFisso()
        {
            System.out.println("Telefono Fisso:" + " " +numeroTelefonoFisso);
        }
        
        public void outNumeriTelefono()
        {
            for( int i = 1; i < this.indexDefaultArrayNumero; i++)
            {
                System.out.println("Numero Telefono:" + " " + i + " " + numeroTelefonoFissoArray[i]);
            }
        }
        
        public void outNumeroCellulare()
        {
          System.out.println("Telefono Cellulare:" + " " + numeroCellulare);  
        }
        
        public void outNumeriCellulare()
        {
            for(int i = 1;i < indexDefaultArrayNumero; i++)
            {
                System.out.println("Telefono Cellulare:" + " " + i + " " + numeroCellulareArray[i]);
            }
        }
        
        //Stampa Dati di Residenza
        
        public void outIndirizzoResidenza()
        {
            System.out.println("Indirizzo Residenza:" + " " + indirizzoResidenza);
        }
        
        public void outNumeroCivico()
        {
            System.out.println("Numero Civico:" + " " + numeroCivicoResidenza);
        }
        
        public void outCapResidenza()
        {
            System.out.println("CAP:" + " " + capResidenza);
        }
        
        public void outPaeseResidenza()
        {
            System.out.println("Paese Residenza:" + " " + paeseResidenza);
        }
        
        public void outProvinciaResidenza()
        {
            System.out.println("Provincia Residenza:" + " " + provinciaResidenza);
        }
        
        public void outNazioneResidenza()
        {
            System.out.println("Nazione Residenza:" + " " + nazioneResidenza);
        }
        
        //Stampa Dati Attività
        
        public void outNomeAttività()
        {
            System.out.println("Nome Attività:" + " " +nomeAttività);
        }
        
        public void outIndirizzoAttività()
        {
             System.out.println("Indirizzo:" + " " +indirizzoAttività);
        }
        
        public void outNumeroCivicoAttività()
        {
            System.out.println("Numero Civico:" + " " +numeroCivicoAttività);
        }
        
        public void outCapAttività()
        {
            System.out.println("CAP:" + " " +capAttività);
        }
        
        public void outPaeseAttività()
        {
            System.out.println("Paese:" + " " +paeseAttività);
        }
                
        public void outProvinciaAttività()
        {
            System.out.println("Provincia:" + " " +provinciaAttività);
        }
        
        public void outNazioneAttività()
        {
            System.out.println("Nazione:" + " " +nazioneAttività);
        }
        
        //CALCOLI AZIENDALI
        
        public double calcPrezzoOre()
        {
            double TotalePrezzoOre = 0.0;
            TotalePrezzoOre = totaleOre * prezzoOra;
            return TotalePrezzoOre;
        }
        
        public double calcPrezzoIva(double TotalePrezzo)
        {
            double TotPrezzoIva = 0.0;
            TotPrezzoIva = (TotalePrezzo * prezzoIVA)/100; 
            return TotPrezzoIva;
        }
        
        public double calcPrezzoKM()
        {
            double TotPrezzoKM = 0.0;
            TotPrezzoKM = kilometriTot * prezzoAlKm;
            return TotPrezzoKM;
        }
        
        public double calcSomma(double numero1, double numero2)
        {
            double TotaleSomma = 0.0;
            TotaleSomma = numero1 + numero2;
            return TotaleSomma;
        }
        
        public double calcSommaValori(int numeroValori)
        {
            
            double Valori [] = new double [numeroValori];
            double totaleSomma = 0.0;
            
            for(int i = 1; i < Valori.length + 1;i++)
            {
                totaleSomma = Valori[i] + totaleSomma;
            }
            return totaleSomma;
        }
        
        public double calcSottrazione(double numero1, double numero2)
        {
            double TotaleSottrazione = 0.0;
            
            TotaleSottrazione = numero1 - numero2;
            
            return TotaleSottrazione;
        }
        
        
        
        
        //Stampa Medoti di Calcolo Aziendale
        
        public double outPrezzoOre()
        {
            System.out.println("Costo Totale Ore:" + " " + totalePrezzoOre);
            return totalePrezzoOre;
        }
        
        public void outPrezzoKM()
        {
            System.out.println("Costo Totale Ore:" + " " + totalePrezzoKM);
        }
        
        public void outPrezzoIva()
        {
            System.out.println("Costo Totale + IVA:" + " " + totalePrezzoIva);
        }
        
        
        
        
        
                
      
                
      
        
    
}

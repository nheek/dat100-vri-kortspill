package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.constructor("KortSamling"));
		samling = new Kort[MAKS_KORT];
		antall = 0;
		// TODO - END
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få
	 * tilgang til antallet ved å bruke metoden getAntallKort(). Metoden er
	 * først og fremst ment å brukes i testklasser. Om man trenger
	 * kortene utenfor, anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		
		return samling;
		
	}
	
	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.method());
		return antall;
		
		// TODO - END
	}
	
	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		
		// TODO - START
				
		// throw new UnsupportedOperationException(TODO.method());
		return antall == 0;
		// TODO - END
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.method());
		samling = Arrays.copyOf(samling, samling.length + 1);
		samling[samling.length - 1] = kort;
		antall += 1;
		// TODO - END
		
	}
	
	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {
		
		// TODO - START
		// Husk: bruk Regler.MAKS_KORT_FARGE for å få antall kort per farge
		
		//throw new UnsupportedOperationException(TODO.method());
		int counter = 0;
		
        for (int x = 1; x < Regler.MAKS_KORT_FARGE + 1; x++) {
            samling[counter] = new Kort(Kortfarge.Hjerter, x);
            counter++;
            antall++;
        }
        
        for (int x = 1; x < Regler.MAKS_KORT_FARGE + 1; x++) {
            samling[counter] = new Kort(Kortfarge.Klover, x);
            counter++;
            antall++;
        }
        
        for (int x = 1; x < Regler.MAKS_KORT_FARGE + 1; x++) {
            samling[counter] = new Kort(Kortfarge.Ruter, x);
            counter++;
            antall++;
        }
        
        for (int x = 1; x < Regler.MAKS_KORT_FARGE + 1; x++) {
            samling[counter] = new Kort(Kortfarge.Spar, x);
            counter++;
            antall++;
        }
        
		// TODO - END
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.method());
		samling = new Kort[0];
		antall = 0;
		// TODO - END
	}
	
	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.method());
		Kort seeLast = erTom() ? null : samling[samling.length - 1];
		
		return seeLast;
		// TODO - END
		
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.method());
		Kort takeLast;
		
		if (!erTom()) {
		    takeLast = samling[samling.length - 1];
		    samling = Arrays.copyOf(samling, samling.length - 1);
		    antall --;
		} else {
		    takeLast = null;
		}
		
		return takeLast;
		// TODO - END
	}
	
	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		
		// TODO - START
		
		
		//throw new UnsupportedOperationException(TODO.method());
		
		for (Kort eachCard : samling) {
			if (eachCard != null && eachCard.equals(kort)) {
				return true;
			}
		}
		
		return false;
		// TODO - END
		
	}

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting med samilingen
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */
			 
	public boolean fjern(Kort kort) {
		
		// TODO - START
		
		// throw new UnsupportedOperationException(TODO.method());
		System.out.println(samling.length);
		samling.leggTilAlle();
		
		return false;
		// TODO - END
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		
		// TODO - START
		
		//throw new UnsupportedOperationException(TODO.method());
		return samling;
		// TODO - END
	
	}
}

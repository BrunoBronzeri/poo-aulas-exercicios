/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mauriferrandin
 */
public class Carta implements Comparable<Carta> {
    // constantes para serem usadas na definicao dos naipes mantendo a uniformidade do texto/
    // Exemplo: parar criar um objeto desta classe representando o 3 de paus use/:
    // Carta c = new Carta(3, Carta.PAUS);
    public static final int PAUS     = 4;
    public static final int COPAS    = 3;
    public static final int ESPADAS  = 2;
    public static final int OUROS    = 1;
    
    private int numero; // numeros de 1 a 12
    private int naipe; // {Ouros, Espadas, Copas, Paus - use as constantes acima}




    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Carta(int numero, int naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }


    public int getNaipe() {
        return naipe;
    }


    public void setNaipe(int naipe) {
        this.naipe = naipe;
    }


    @Override
    public String toString() {
        String[] naipestexto = {"Ouros", "Espadas", "Copas", "Paus"};
        return "Carta{" + "numero=" + numero + ", naipe=" + naipestexto[naipe - 1] + '}';
    }


	@Override
	public int compareTo(Carta c2) {
		if (this.getNaipe() > c2.getNaipe()) {
			return -1;
		} else if (this.getNaipe() < c2.getNaipe()) {
			return 1;
		} else {
			if (this.getNumero() > c2.getNumero()) {
				return 1;
			} else if (this.getNumero() < c2.getNumero()) {
				return -1;
			} else {
				return 0;
			}
		}	
	}


}
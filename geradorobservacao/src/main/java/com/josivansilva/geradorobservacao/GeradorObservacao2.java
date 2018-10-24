package com.josivansilva.geradorobservacao;


import java.util.Iterator;
import java.util.List;

public class GeradorObservacao2 { 

	/**
	 * Textos pré-definidos
	 */
	private static final String UMA_NOTA = "Fatura da nota fiscal de simples remessa: "; //Identificador da entidade
			
	/**
	 * Gera observações, com texto pré-definido, incluindo os números das notas fiscais, recebidos no parâmetro.
	 * 
	 * @param lista a lista
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public String geraObservacao (List lista) { 
		if (!lista.isEmpty()) {
			return retornaCodigos (lista) + ".";
		}		
		return "";		
	}

	/**
	 * Cria observação.
	 * 
	 * @param lista a lista
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String retornaCodigos (List lista) {
		String texto;
		if (lista.size() >= 2) {
			texto = "Fatura das notas fiscais de simples remessa: ";
		} else {
			texto = UMA_NOTA;
		}
		
		//Acha separador
		StringBuilder sbCod = new StringBuilder();
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
			Integer cod = iterator.next();
			String str = "";
			if( sbCod.toString() == null || sbCod.toString().length() == 0 ) {
				str =  "";
			} else if (iterator.hasNext()) {
				str =  ", ";
			} else {
				str =  " e ";
			}					
			
			sbCod.append (str + cod);
		}
		
		return texto + sbCod.toString();
	}
}
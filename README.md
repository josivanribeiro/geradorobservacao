Refactoring "GeradorObservacao.java"

Classe: com.josivansilva.geradorobservacao.GeradorObservacao2.java
Unit Test Class: com.josivansilva.geradorobservacao.GeradorObservacaoTest2.java


1) Na linha 10, usar modificador de acesso "private";
2) Na linha 10, declarar nome de atributo com letra maiúscula (padrão de constante): "UMA_NOTA";
3) Nas linhas 9, 14 e 25, os comentários estão com problema de character encoding (acentuação), corrigí-los;
4) Na linha 13, remover o atributo "texto" e adicioná-lo como variável local no método retornaCodigos();
5) Os métodos geraObservacao() e retornaCodigos() devem usar a mesma padronização de chaves (curly braces);
6) Na linha 43, renomear variável "cod" para "sbCod";
7) Na linha 57, alterar:

		de: 
		return texto + sbCod;
		
		para:		
		return texto + sbCod.toString();
		
8) Na linha 45, renomear a variável "c" para "cod";
9) Na linha 46, renomear a variável "s" para "str";
10) Das linhas 47 a 52, refatorar:

		de:
		if( sbCod.toString() == null || sbCod.toString().length() <= 0 )
				s =  "";
				else if( iterator.hasNext() )
					s =  ", ";
				else
					s =  " e ";
		
		para:
		if( sbCod.toString() == null || sbCod.toString().length() == 0 ) {
				str =  "";
		} else if (iterator.hasNext()) {
			str =  ", ";
		} else {
			str =  " e ";
		}
		
11) A partir da linha 20, adicionar:

	@SuppressWarnings("rawtypes")
	public String geraObservacao (List lista) { 


12) A partir da linha 33, adicionar:

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String retornaCodigos (List lista) {



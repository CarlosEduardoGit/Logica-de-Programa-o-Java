
public class CaracteresEspeciais {

	public static void main(String[] args) {
		
		/*
		|---------------------------------------|
		|Representação |      Significado       |
		|---------------------------------------|
		|    \n        | Pular linha            |
		|--------------|------------------------|
		|    \r	       | Retorno de Carro       |
		|--------------|------------------------|
		|    \b        | Retrocesso             |
		|--------------|------------------------|
		|    \t        | Tabulação              |
		|--------------|------------------------|
		|    \f        | Nova página            |
		|--------------|------------------------|
		|    \'        | Apóstrofe              |
		|--------------|------------------------|
		|    \"        | Aspas                  |
		|--------------|------------------------|
		|    \\        | Barra Invertida        |
		|--------------|------------------------|
		|    \u223d    | Caractere Unicode 233d |
		|--------------|------------------------|
		|    \g37      | Octal 37               |
		|--------------|------------------------|
		|    \fca      | Hexadecimal FCA        |
		|---------------------------------------|
		
		*/
		
		//---- Não Formatado ----

		System.out.println("Caracteres Especiais");

		System.out.println("É um símbolo que produz um efeito próprio, mas que não possui uma forma visual. São usados na formatação de mensagens e dados e representados pela combinação deuma  (barra invertida) com um caracte extra, formando as sequências de escape.");

		System.out.println("Outros exemplos: *Apóstrofe *Aspas *Segunda Feira");
		
		
		//---- Formatado ----

		System.out.println("\n\n\n\t\t\t\tCaracteres Especiais\n");

		System.out.println("\tÉ um símbolo que produz um efeito próprio, "
		   + "mas que não possui uma forma visual. \r\nSão usados na formatação de mensagens e dados e representados pela combinação de\r\n"
		   + "uma \\ (barra invertida) com um caracte extra, formando as sequências de escape.\n\n");

		System.out.println("Outros exemplos:\n\n"
		   + "* copo d\'água\n"
		   + "* \"Aspas\" \n"
		   + "* Segunda\u223dFeira");

	}

}





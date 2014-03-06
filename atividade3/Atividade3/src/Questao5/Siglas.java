package Questao5;

public class Siglas {

	private String[] nomesEstado = {"Paraiba", "Sao Paulo",  "Rio de Janeiro","Santa Catarina", "Goiás", 
			"Pernambuco", "Ceara", "Rio Grande do Norte", "Pará", "Mato Grosso", "Tocantins"};
	private String[] siglas = {"PB","SP","RJ","SC","GO","PI","PE","CE","RN","PA","MG","TO","AL","RJ","MS","ES","SE","AM","RO",
			"AP","RR"};

	public String recuperarNomeEstado(String sigla){
		for (int i = 0; i < siglas.length; i++) {
			if(sigla.equals(siglas[i]))
					return nomesEstado[i];
			}
		return null;
	}
}

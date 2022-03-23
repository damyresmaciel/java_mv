package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		ItemCafe suco = new ItemCafe("Suco");
		ItemCafe bolo = new ItemCafe("Bolo");
		ItemCafe mamao = new ItemCafe("Mamão");
		ItemCafe cafe = new ItemCafe("café");

		Colaborador geraldo = new Colaborador("Geraldo", "959.636.340-91");		
		Colaborador andre = new Colaborador("Andre", "959.636.340-91");
		Colaborador paula = new Colaborador("Paula", "959.636.340-91");
		Colaborador sabrina = new Colaborador("Sabrina", "789.064.804-90");

		Map<Colaborador, List<ItemCafe>> itens = new HashMap<>();
		
		List<ItemCafe> itensCafeGeraldo = new ArrayList<>();
		itensCafeGeraldo.add(cafe);
		itensCafeGeraldo.add(bolo);

		
		List<ItemCafe> itensCafeAndre = new ArrayList<>();
		itensCafeAndre.add(mamao);
		itensCafeAndre.add(suco);
		
		List<ItemCafe> itensCafeSabrina = new ArrayList<>();
		itensCafeSabrina.add(mamao);
		itensCafeSabrina.add(suco);
		
		List<ItemCafe> itensCafePaula = new ArrayList<>();
		itensCafePaula.add(mamao);
		itensCafePaula.add(suco);
		
		itens.put(geraldo, itensCafeGeraldo);
		itens.put(andre, itensCafeAndre);
		itens.put(sabrina, itensCafeSabrina);
		itens.put(paula, itensCafePaula);
		
		System.out.println(itens);


	}

}

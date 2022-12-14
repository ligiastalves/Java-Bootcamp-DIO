package collections.map;

import java.util.*;

/*Dados os modelos de carros e seus respectivos consumos, faça:
modelo(key), consumo (value)

modelo: gol - consumo: 14,4 km/l
modelo: uno - consumo: 15,6 km/l
modelo: mobi - consumo: 16,1 km/l
modelo: hb20 - consumo: 14,5 km/l
modelo: kwid - consumo: 15,6 km/l
 */
public class ExemploMap {

    public static void main(String[] args) {


        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumo: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tcson está no dicionario: " + carrosPopulares.containsKey("tucson"));
        //true ou false

        System.out.println("Exiba o sonsumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: "); // nao existe metodo

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); //retorna um Set
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values(); //retorna Collection
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();//retorna um Set do tipo entry getKey e getValue
        String modeloMaisEficiente = ""; // variavel de controle

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        String modeloMenosEficiente = ""; //variavel de controle
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumo: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a media de consumo deste dicionario de carros: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares.isEmpty());

    }
}
package software.ulpgc.kata3;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EsqueletoLoader loader = new TsvFileEsqueletoLoader(new File("Skelet.txt"));
        List<Esqueleto> esqueletos = loader.load();
        Map<String, Integer> chart = new HashMap<>();
        for (Esqueleto esqueleto: esqueletos){
            String numHuesos = esqueleto.getNumHuesos();
            chart.put(numHuesos, chart.getOrDefault(numHuesos,0)+1);
        }
        for (String key: chart.keySet()){
            System.out.println(key + ":" + chart.get(key));
        }
    }
}

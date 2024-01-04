package software.ulpgc.kata3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvFileEsqueletoLoader implements EsqueletoLoader {
    private final File file;

    public TsvFileEsqueletoLoader(File file) {
        this.file = file;
    }
    @Override
    public List<Esqueleto> load(){
        try {
            return load(new FileReader(file));
        }catch (IOException err){
            throw new RuntimeException(err);
        }
    }

    private List<Esqueleto> load(FileReader reader) throws IOException{
        return load(new BufferedReader(reader));
    }

    private List<Esqueleto> load (BufferedReader reader) throws IOException{
        reader.skip(1);
        List<Esqueleto> esqueletos = new ArrayList<>();
        while (true){
            String line = reader.readLine();
            if(line == null) return esqueletos;
            esqueletos.add(toEsqueleto(line));
        }
    }

    private Esqueleto toEsqueleto(String line) {
        return  toEsqueleto(line.split("\t"));
    }

    private Esqueleto toEsqueleto(String[] fields){
        return new Esqueleto(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                fields[4]
        );
    }
}

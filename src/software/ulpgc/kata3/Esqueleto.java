package software.ulpgc.kata3;

public class Esqueleto {
    private final String nombre;
    private final String numHuesos;
    private final String numMemes;
    private final String tipoMemes;
    private final String primeraAparicion;

    public Esqueleto(String nombre, String numHuesos, String numMemes, String tipoMemes, String primeraAparicion) {
        this.nombre = nombre;
        this.numHuesos = numHuesos;
        this.numMemes = numMemes;
        this.tipoMemes = tipoMemes;
        this.primeraAparicion = primeraAparicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumHuesos() {
        return numHuesos;
    }

    public String getNumMemes() {
        return numMemes;
    }

    public String getTipoMemes() {
        return tipoMemes;
    }

    public String getPrimeraAparicion() {
        return primeraAparicion;
    }


    @Override
    public String toString() {
        return "Esqueleto{" +
                "Nombre = " + nombre + '\'' +
                ", numero de huesos = " + numHuesos + '\'' +
                ", apariciones en Memes =" + numMemes + '\'' +
                ", formato predominante = " + tipoMemes + '\'' +
                ", primera aparicion = " + primeraAparicion + '\'' +
                "}";
    }
}



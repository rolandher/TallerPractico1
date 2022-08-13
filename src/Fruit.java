import java.util.ArrayList;

/**
 * Clase para saber el nombre de la fruta
 */
public class Fruit {

    String name;
    private float averageWeight;
    ArrayList<String> colors;
    /**
     * Metodo para saber el nombre de la fruta
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Metodo para saber el tipo o color de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }
}


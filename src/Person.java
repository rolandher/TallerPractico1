import java.util.Date;
    /**
    * Aplicación para ver el nombre de la persona y sus atributos.
    */
public class Person {

    String name;
    String lastName1;
    String lastName2;
    Date dateBirth;
    float height;
    String email;

    /**
     * Metodo para establecer el nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Metodo para obtener el nombre de la persona
     */
    public String getName() {
        return this.name;
    }


}



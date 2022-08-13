/**
 * Representa al usuario y sus respectivas caracteristicas
 */
public class Doctor {
    //Atributos
    int id = 0; //Autoincrement
    String name;
    String email;
    private String speciality;
    /**
     * Metodo constructor
     */
    public Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }
    /**
     * Metodo para saber el nombre del doctor y su especialidad.
     */
    public Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
    }
    /**
     * Metodo para mostrar el nombre del doctor.
     */
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    /**
     * Metodo para mostrar la identificación del doctor.
     */
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
    /**
     * Metodo para saber la funcion del doctor
     */
    public String getSpeciality() {
        return speciality;
    }
}

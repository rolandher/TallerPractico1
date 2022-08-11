/**
 * Representa y sus respectivas caracteristicas
 */
public class Doctor {
    //Atributos
    int id = 0; //Autoincrement
    String name;
    String email;
    private String speciality;

    public Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    public Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    public String getSpeciality() {
        return speciality;
    }
}

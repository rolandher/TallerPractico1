public class Animal {

    private String raza;
    private String name;
    private int age;

    public Animal(String nuevoNombre) {
        name = nuevoNombre; //Se le da un nombre al animal
    }

    //Método para obtener la edad del animal
    public int getAge() {
        return age;
    }

    //Método para establecer la edad del animal
    public void setAge(int nuevaEdad) {
        age = nuevaEdad;
    }

    //Método para obtener el nombre del animal
    public String getName() {
        return name;
    }
}

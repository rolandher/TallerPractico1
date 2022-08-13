
    /**
    * Representa atributos para un animal
    */
    public class Animal {

    private String race;
    private String name;
    private int age;
    /**
     * Metodo para obtener el nombre del animal
     */
    public Animal(String newName) {
        name = newName;
    }

    /**
     * Método para obtener la edad del animal
     */
    public int getAge() {
        return age;
    }
    /**
     * Método para establecer la edad del animal
     */
       public void setAge(int newAge) {
        age = newAge;
    }
    /**
     * Método para obtener el nombre del animal
     */
     public String getName() {
        return name;
    }
}

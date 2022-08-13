    /**
    * Clase para abrir una cuenta bancaria
    */
public class BankAccount {

    private int accountNumber;
    boolean activated;
    /**
     * Metodo para saber si se encuentra activa la cuenta o no
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Metodo para obtener el numero de cuenta
     */
    public boolean isActivated() {
        return activated;
    }
}

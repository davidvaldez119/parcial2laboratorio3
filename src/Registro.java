public class Registro {
    private double temperatura;
    private int dni;
    private Persona persona;

    public Registro(double temperatura, int dni) {
        this.temperatura = temperatura;
        this.dni = dni;
    }
    public double tempe(){
        double temp=(Math.random()*36+39);
    return tempe();}


    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getDni() {
        return dni;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

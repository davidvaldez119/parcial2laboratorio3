import java.util.HashMap;

public class Persona<barrio1> extends Registro {
    private String nombreYapellido;
    private int edad;
    private String barrio;
    private int dni;
    private String ocupacion;
    private boolean positivo;
    private Registro reg;


    public Persona(double temperatura, int dni, String nombreYapellido, int edad, String barrio, int dni1, String ocupacion, boolean positivo) {
        super(temperatura, dni);
        this.nombreYapellido = nombreYapellido;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni1;
        this.ocupacion = ocupacion;
        this.positivo = positivo;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

    public void RegistroPersona(Persona persona, int test){
       // Persona persona1= new Persona();
        HashMap<Double,Persona>hash=new HashMap<>();
        double testi=0;
        for(double registro: hash.keySet()){
             testi=  Math.random();
            if((persona.positivo==true)&&(test!=0)){
                hash.put(testi,persona);
            }
            try {
                throw new Exception(String.valueOf(test));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
    public HashMap testear(){

     HashMap<Integer,Registro>hash=new HashMap<>();
     if(reg.tempe()>37){
     for(Integer key:hash.keySet()) {
         hash.put(key, reg);
     }}
     return hash;
    }
    //no lo agrego a un archivo lo voy a agregar a un array
    public void aislar(Persona per , int kit){
        if(per.tempe()>38){

             }try{
            String barrio2 = null;
            int test;
            per.barrio=barrio2;
            test = kit;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    }



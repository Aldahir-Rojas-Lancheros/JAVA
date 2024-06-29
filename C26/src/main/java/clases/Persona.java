package clases;

class Persona {

    Persona() {
    }

    Persona(String nombre) {
        this.nombre = nombre;
    }

    Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    private String programa;
    private String nombre;
    private String cedula;
    private String tipoDocumento;
    private String grupoSanguineoCompleto;
    private int edad;
    private String telefono;
    private String nombreAcudiente;
    private String telefonoAcudientel;


    public String getPrograma(){
        return programa;
    }

    public void setPrograma(String programa){
        this.programa=programa;
    }
}

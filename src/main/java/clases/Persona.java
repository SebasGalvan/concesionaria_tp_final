package clases;

public class Persona {
    private Long id;
    private String dni;
    private String firsName;
    private String LastName;;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public Persona(String dni, String firsName, String lastName) {
        this.dni = dni;
        this.firsName = firsName;
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", firsName='" + firsName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}

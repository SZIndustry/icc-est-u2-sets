package models;

public class Contact {
    private String Name;
    private String Apellido;
    private String Telefono;
    public Contact(String name, String apellido, String telefono) {
        Name = name;
        Apellido = apellido;
        Telefono = telefono;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    
}

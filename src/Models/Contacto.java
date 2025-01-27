package Models;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto: " + nombre +  apellido + " - "  + telefono ;
    }

    public boolean equals(Object obj) {
        if (this == obj) // referencias de memora
            return true;
        if (obj == null) // obj es null
            return false;
        if (getClass() != obj.getClass())
            return false;

        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre)
                && apellido.equals(other.apellido) 
                && telefono.equals(other.telefono);
    }

    // @Override
    // public int hashCode() {
    // // Por simplicidad, combinamos los hash de nombre y apellido
    // return nombre.hashCode() + apellido.hashCode();
    // }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono); // include telefono
    }
}

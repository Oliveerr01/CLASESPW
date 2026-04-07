package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   //estos 2 @ me crea el constructor y el getter y setter.
@AllArgsConstructor
@NoArgsConstructor
public class Comprador {
    private String nombre, apellido, correo, direccion;
    private int telefono;

    public Comprador(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
}

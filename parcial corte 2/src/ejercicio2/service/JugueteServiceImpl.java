package ejercicio2.service;

import ejercicio2.IJuguete;

public class JugueteDTOImpl implements IJuguete {
    private int id;
    private String name;
    private String categoria;
    private String precio;
    private String cantidad;

    public JugueteDTOImpl(int id, String name, String categoria, String precio, String cantidad) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}

}

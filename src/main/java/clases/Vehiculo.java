package org.example;

public class Vehiculo {
    private Long id;
    private Integer year;
    private String marca;
    private String modelo;
    private Double km;
    private Double precio;
    private Double precioHora;
    private Boolean disponibilidad;

    public Vehiculo(Integer year, String marca, String modelo, Double km, Double precio, Double precioHora, Boolean disponibilidad) {
        this.id = id;
        this.year = year;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;
        this.precioHora = precioHora;
        this.disponibilidad = disponibilidad;
    }

    public Long getId() {
        return id;
    }
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", year=" + year +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                ", precio=" + precio +
                ", precioHora=" + precioHora +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}


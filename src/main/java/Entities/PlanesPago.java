package Entities;

public class PlanesPago {

    private Long idPlan;
    private Double entrega;
    private Integer cuotas;

    public PlanesPago() {
    }

    public PlanesPago(Long idPlan, Double entrega, Integer cuotas) {
        this.idPlan = idPlan;
        this.entrega = entrega;
        this.cuotas = cuotas;
    }

    public Long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public Double getEntrega() {
        return entrega;
    }

    public void setEntrega(Double entrega) {
        this.entrega = entrega;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "PlanesPago{" +
                "idPlan=" + idPlan +
                ", entrega=" + entrega +
                ", cuotas=" + cuotas +
                '}';
    }
}

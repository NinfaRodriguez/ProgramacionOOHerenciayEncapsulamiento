public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombutible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;

    }

    public String getTipoCombustible(){
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }

    @override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: "+ tipoCombustible);
    }

    @override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("Limpiando el asiento del conductor y del copiloto.....");
        System.out.println("Limpiendo los asientos traceros.....");
        System.out.println("Limpiando la balijera.....");
    }

    public void CalcularCostoMantenimiento(double costoPorKM, double kilometrosRecorridos){
        double costoTotal = costoPorKM * kilometrosRecorridos;
        System.out.println("El costo total por el mantenimiento del auto es: "+ costoTotal);
    }

}

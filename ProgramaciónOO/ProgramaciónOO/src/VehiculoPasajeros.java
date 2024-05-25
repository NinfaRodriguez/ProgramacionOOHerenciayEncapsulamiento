public class VehiculoPasajeros extends Vehiculo {

    protected int numPasajeros;

    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: "+ numPasajeros);
    }

    
}

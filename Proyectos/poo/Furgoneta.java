package poo;

public class Furgoneta extends Auto{
    private int capacidad_extra;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_extra){
        super();
            this.capacidad_extra = capacidad_extra;
            this.plazas_extra = plazas_extra;

    }
    public String dimeDatosFurgoneta(){

        return "La capacidad de carga es: " + capacidad_extra + " Y las plazas son: " + plazas_extra;
    }



}

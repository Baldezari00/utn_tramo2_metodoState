package org.example.estrategias;

public class EstrategiaMensual implements EstrategiaDeSueldo {
    private Integer sueldoMensual;
    @Override
    public Integer calcularSueldo() {
        return 7* this.sueldoMensual;
    }
}

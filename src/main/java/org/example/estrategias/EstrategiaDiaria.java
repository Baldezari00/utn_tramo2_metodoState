package org.example.estrategias;

public class EstrategiaDiaria implements EstrategiaDeSueldo {
    public Integer sueldoDiario;
    @Override
    public Integer calcularSueldo() {
        return sueldoDiario;
    }
}

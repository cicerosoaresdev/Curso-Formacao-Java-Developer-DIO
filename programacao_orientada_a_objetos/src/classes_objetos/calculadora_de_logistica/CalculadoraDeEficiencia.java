package classes_objetos.calculadora_de_logistica;

public class CalculadoraDeEficiencia {
    double distancia;
    double consumoDoVeiculo;
    double precoDoCombustivel;
    double valorPedagio;
    double pesoDaCarga;
    int qtdeUnidadesTransportadas;

// Calcular o custo do combustivel
    public double calcularCPC(){
        double custoCombustivel =
                (this.distancia / this.consumoDoVeiculo)
                        * this.precoDoCombustivel;

        return custoCombustivel;

    }

    public double calcularCustoViagem(){
        return calcularCPC() + this.valorPedagio;
    }


// Calcular o custo por unidades
    public double calcularCPU(){
        return calcularCustoViagem() / this.qtdeUnidadesTransportadas;
    }
// calcular o custo por quilograma
    public double calcularCPKg(){
        if (pesoDaCarga == 0){
            return  0.0;
        }
return calcularCustoViagem() / this.pesoDaCarga;
    }


}

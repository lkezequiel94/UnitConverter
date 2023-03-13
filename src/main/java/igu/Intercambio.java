package igu;


public class Intercambio {

    private double valor, resultado, resulTemp, valorTemp;
    private int divInit, divFin, tempInit, tempFin;

    public int getTempFin() {
        return tempFin;
    }

    public void setTempFin(int tempFin) {
        this.tempFin = tempFin;
    }

    public double getValorTemp() {
        return valorTemp;
    }

    public void setValorTemp(double valorTemp) {
        this.valorTemp = valorTemp;
    }

    public int getTempInit() {
        return tempInit;
    }

    public void setTempInit(int tempInit) {
        this.tempInit = tempInit;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivInit() {
        return divInit;
    }

    public void setDivInit(int divInit) {
        this.divInit = divInit;
    }

    public int getDivFin() {
        return divFin;
    }

    public void setDivFin(int divFin) {
        this.divFin = divFin;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Intercambio() {

    }

    //Cambiar divisas
    double dolarEuro = 0.94;
    double dolarPesoArg = 373;
    double dolarPesoUY = 39;
    double dolarGuarani = 7163.46;
    double dolarBoliviano = 6.9;
    double euroDolar = 1.06;
    double euroPesoArg = dolarPesoArg * euroDolar;
    double euroPesoUY = 41.51;
    double euroGuarani = 7626.58;
    double euroBoliviano = 7.32;
    double pesoArgDolar = 1 / dolarPesoArg;
    double pesoArgEuro = 1 / euroPesoArg;
    double pesoArgPesoUY = 0.11;
    double pesoArgGuarani = 19.31;
    double pesoArgBoliviano = dolarBoliviano / dolarPesoArg;
    double PesoUYDolar = 0.0255;
    double PesoUYEuro = 0.02;
    double PesoUYpesoArg = 5.12;
    double PesoUYGuarani = 182.74;
    double PesoUYBoliviano = 0.18;
    double GuaraniDolar = 0.0001;
    double GuaraniEuro = 0.00013;
    double GuaranipesoArg = 0.051;
    double GuaraniPesoUY = 0.0055;
    double GuaraniBoliviano = 0.00096;
    double BolivianoDolar = 0.15;
    double BolivianoEuro = 0.14;
    double BolivianopesoArg = dolarPesoArg / dolarBoliviano;
    double BolivianoPesoUY = 5.70;
    double BolivianoGuarani = 1041.81;

    public double convertirDivisa() {
        if (divInit == 1 && divFin == 1) {
            resultado = valor;
            return resultado;
        } else if (divInit == 1 && divFin == 2) {
            resultado = valor * dolarEuro;
            return resultado;
        } else if (divInit == 1 && divFin == 3) {
            resultado = valor * dolarPesoArg;
            return resultado;
        } else if (divInit == 1 && divFin == 4) {
            resultado = valor * dolarPesoUY;
            return resultado;
        } else if (divInit == 1 && divFin == 5) {
            resultado = valor * dolarGuarani;
            return resultado;
        } else if (divInit == 1 && divFin == 6) {
            resultado = valor * dolarBoliviano;
            return resultado;
        } else if (divInit == 2 && divFin == 1) {
            resultado = valor * euroDolar;
            return resultado;
        } else if (divInit == 2 && divFin == 2) {
            resultado = valor;
            return resultado;
        } else if (divInit == 2 && divFin == 3) {
            resultado = valor * euroPesoArg;
            return resultado;
        } else if (divInit == 2 && divFin == 4) {
            resultado = valor * euroPesoUY;
            return resultado;
        } else if (divInit == 2 && divFin == 5) {
            resultado = valor * euroGuarani;
            return resultado;
        } else if (divInit == 2 && divFin == 6) {
            resultado = valor * euroBoliviano;
            return resultado;
        } else if (divInit == 3 && divFin == 1) {
            resultado = pesoArgDolar;
            return resultado;
        } else if (divInit == 3 && divFin == 2) {
            resultado = pesoArgEuro;
            return resultado;
        } else if (divInit == 3 && divFin == 3) {
            resultado = valor;
            return resultado;
        } else if (divInit == 3 && divFin == 4) {
            resultado = pesoArgPesoUY;
            return resultado;
        } else if (divInit == 3 && divFin == 5) {
            resultado = pesoArgGuarani;
            return resultado;
        } else if (divInit == 3 && divFin == 6) {
            resultado = pesoArgBoliviano;
            return resultado;
        } else if (divInit == 4 && divFin == 1) {
            resultado = PesoUYDolar;
            return resultado;
        } else if (divInit == 4 && divFin == 2) {
            resultado = PesoUYEuro;
            return resultado;
        } else if (divInit == 4 && divFin == 3) {
            resultado = PesoUYpesoArg;
            return resultado;
        } else if (divInit == 4 && divFin == 4) {
            resultado = valor;
            return resultado;
        } else if (divInit == 4 && divFin == 5) {
            resultado = PesoUYGuarani;
            return resultado;
        } else if (divInit == 4 && divFin == 6) {
            resultado = PesoUYBoliviano;
            return resultado;
        } else if (divInit == 5 && divFin == 1) {
            resultado = GuaraniDolar;
            return resultado;
        } else if (divInit == 5 && divFin == 2) {
            resultado = GuaraniEuro;
            return resultado;
        } else if (divInit == 5 && divFin == 3) {
            resultado = GuaranipesoArg;
            return resultado;
        } else if (divInit == 5 && divFin == 4) {
            resultado = GuaraniPesoUY;
            return resultado;
        } else if (divInit == 5 && divFin == 5) {
            resultado = valor;
            return resultado;
        } else if (divInit == 5 && divFin == 6) {
            resultado = GuaraniBoliviano;
            return resultado;
        } else if (divInit == 6 && divFin == 1) {
            resultado = BolivianoDolar;
            return resultado;
        } else if (divInit == 6 && divFin == 2) {
            resultado = BolivianoEuro;
            return resultado;
        } else if (divInit == 6 && divFin == 3) {
            resultado = BolivianopesoArg;
            return resultado;
        } else if (divInit == 6 && divFin == 4) {
            resultado = BolivianoPesoUY;
            return resultado;
        } else if (divInit == 6 && divFin == 5) {
            resultado = BolivianoGuarani;
            return resultado;
        } else if (divInit == 6 && divFin == 6) {
            resultado = valor;
            return resultado;

        } else {
            return resultado;
        }
    }

    // Convertir temperatura
    public double convertirTemp() {
        if (tempInit == 0 && tempFin == 0) {
            resulTemp = valorTemp;
            return resulTemp;
        } else if (tempInit == 0 && tempFin == 1) {
            resulTemp = (valorTemp * 9 / 5) + 32;
            return resulTemp;
        } else if (tempInit == 0 && tempFin == 2) {
            resulTemp = (valorTemp + 273.15);
            return resulTemp;
        } else if (tempInit == 1 && tempFin == 0) {
            resulTemp = (valorTemp - 32) * 5 / 9;
            return resulTemp;
        } else if (tempInit == 1 && tempFin == 1) {
            resulTemp = valorTemp;
            return resulTemp;
        } else if (tempInit == 1 && tempFin == 2) {
            resulTemp = (valorTemp - 32) * 5/9 + 273.15;
            return resulTemp;
        } else if (tempInit == 2 && tempFin == 0) {
            resulTemp = (valorTemp - 273.15);
            return resulTemp;
        } else if (tempInit == 2 && tempFin == 1) {
            resulTemp = (valorTemp - 273.15) * 9 / 5 + 32;
            return resulTemp;
        } else {
            resulTemp = valorTemp;
            return resulTemp;
        }
    }
}
 
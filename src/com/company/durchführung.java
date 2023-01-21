package com.company;
public class durchführung {
    public Double ergebnis = 0.;
    private double number1;
    private double number2;
    durchführung(double number1,double number2,int Auswahl){
        this.number1 = number1;
        this.number2 = number2;
        aufrufendeFunktion(Auswahl);
    }
    private void aufrufendeFunktion(int Auswahl){
        switch (Auswahl) {
            case 1: addition();
            break;
            case 2: substraktion();
            break;
            case 3: multipliKation();
            break;
            case 4: Division();
            break;
            default:
            }
    }

    private void Division() {
        this.ergebnis = this.number1 / this.number2;
    }

    private void multipliKation() {
        this.ergebnis = this.number1 * this.number2;
    }

    private void substraktion() {
        this.ergebnis = this.number1 - this.number2;
    }

    private void addition() {
        this.ergebnis = this.number1 + this.number2;
    }
}

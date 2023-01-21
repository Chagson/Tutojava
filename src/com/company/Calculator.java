package com.company;

public class Calculator {
    Calculator(){
        Frage fragen = new Frage();
        durchführung Berechnung = new durchführung(fragen.getNumber1(), fragen.getNumber2(), fragen.getAuswahl());
        printErgebnis(fragen.getNumber1(), fragen.getNumber2(), fragen.getAuswahl(), Berechnung.ergebnis);
    }
    public int weiterMachen(){
        Frage newQuestion = new Frage(0);
        if(newQuestion.weiterMachen() == 1){
            Calculator nochmal = new Calculator();
            return newQuestion.weiterMachen();
        } else{
            return newQuestion.weiterMachen();
        }
    }
    public void printErgebnis(double number1,double number2,int auswahl , double Ergebnis){
        switch (auswahl){
            case 1: System.out.println("die Addition von " + number1 + " und " + number2 + " ergibt " + Ergebnis);
            break;
            case 2: System.out.println("die substraktion von " + number2 + " auf " + number1 + " ergibt " + Ergebnis);
            break;
            case 3: System.out.println("die Multiplikation von " + number1 + " mit " + number2 + " ergibt " + Ergebnis);
            break;
            case 4: System.out.println("die Division von " + number1 + " durch " + number2 + " ergibt " + Ergebnis);
            default:
        }
    }
}

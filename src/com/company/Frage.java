package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Frage {
    Scanner sc = new Scanner(System.in);
    private double number1 = 0;
    private double number2 = 0;
    private int Auswahl = 0;
    Frage(int b){

    }
    Frage(){
        auswahlOperation();
        setNumbers();
    }
    public int weiterMachen(){
        int i = 0;
        System.out.println("wollen sie weiter machen? 1/0 ");
        i = sc.nextInt();
        return i;
    }
    private void setNumbers(){
        System.out.println("schön , sie haben sicher festgestellt,dass es sich hier nur um ein kleines Algorithmus handelt" +
                "wir hätten gern zwei zahlen von ihnen.");
        try {
            System.out.println("..........erste Zahl.........");
            this.number1 = sc.nextDouble();
            System.out.println("..........zweite Zahl.........");
            this.number2 = sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("das War kein Double ! nochmal oder nicht 1/0");// ich möchte hier anmerken, dass ich meine eigene Klassen schaffen konnte. dass hier ist nur ein Beispiel
            int i = 0;
            i = sc.nextInt();
            if( i==1 ) {
                setNumbers();
            } else { throw e;}
        }
    }
    private void auswahlOperation(){
        System.out.println("welche Operation würden sie gern durchführen?");
        System.out.println("..........1-Addition...............");
        System.out.println("..........2-Substraktion...........");
        System.out.println("..........3-Multiplikation.........");
        System.out.println("..........4-Division...............\n");

        try {
            this.Auswahl = sc.nextInt();
            if (Auswahl > 4 && Auswahl <=0 ){
                System.out.println("sie haben keine Gültige Operation ausgewählt! \n" +
                        "wollen sie es nochmal versuchen? 1/0");
                int i = 0;
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
                if(i == 1){
                    auswahlOperation();
                } else { InputMismatchException e = new InputMismatchException();//nur weil ich keine eigene Fehlerbehandlung machen möchte
                    throw e;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("das War kein Intenger! nochmal oder nicht 1/0");
            int i = 0;
            i = sc.nextInt();
            if( i==1 ) {
                setNumbers();
            } else { throw e;}
        }
    }
    public int getAuswahl(){
        return this.Auswahl;
    }
    public double getNumber1(){
        return this.number1;
    }
    public double getNumber2(){
        return this.number2;
    }
}

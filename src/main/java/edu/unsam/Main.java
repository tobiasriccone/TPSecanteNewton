package edu.unsam;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        double puntoDePartida = -1;
        double epsilon = 0.01;
        newtonSecante(puntoDePartida, epsilon);
    }

    public static double f(double x){
        return pow(x, 3) - x + 1;
    }

    public static double fD(double x){
        return 3 * pow(x, 2) - 1;
    }

    public static void newtonSecante(double ptoPartida, double epsilon){
        double aproximacionNewton = newton(ptoPartida);
        double error = abs(aproximacionNewton - ptoPartida);
        double aproximacionSecante;
        int i;
        for ( i = 1 ; error > epsilon ; i++ ) {
            aproximacionSecante = secante(aproximacionNewton);
            i++;
            aproximacionNewton = newton(aproximacionSecante);
            error = abs(aproximacionNewton - aproximacionSecante);
        }
        System.out.print("\n\nRaíz aproximada: " + aproximacionNewton + "\nIteraciones: " + i);
    }

    public static double secante(double puntoDePartida){
        System.out.print("\nSECANTE");
        double segundoPunto = puntoDePartida - 1;
        System.out.print("\n\tx0: " + puntoDePartida + "\n\tx0-1: " + segundoPunto);
        double aproximacion = puntoDePartida - (f(puntoDePartida) * (puntoDePartida - segundoPunto)) / (f(puntoDePartida) - f(segundoPunto));
        System.out.print("\n\tAproximación: " + aproximacion);
        double error = abs(puntoDePartida - aproximacion);
        System.out.print("\n\tError: " + error);
        return aproximacion;
    }

    public static double newton(double puntoDePartida){
        System.out.print("\nNEWTON");
        System.out.print("\n\tPunto de partida: " + puntoDePartida);
        double aproximacion = puntoDePartida - f(puntoDePartida) / fD(puntoDePartida);
        System.out.print("\n\tAproximación: " + aproximacion);
        double error = abs(puntoDePartida - aproximacion);
        System.out.print("\n\tError: " + error);
        return aproximacion;
    }

}
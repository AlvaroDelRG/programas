import java.io.*;
import java.util.Scanner;

/**
 * La clase TransponerAcordes se encarga de subir un semitono
 * la nota introducida.
 * Como ampliación, me gustaría hacer que, al seguir pulsando intro,
 * siguiese transponiendo.
 * 
 * @author Álvaro Del Río
 * @version 23 Julio 2019
 */
public class TransponerAcordes
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println();
        System.out.println("1. Introduzca una nota (# para sharp, b para flat) y pulse Intro, "
            + "\n   ésta se transpondrá un semitono hacia arriba. ");
        System.out.println("2. Si sigue pulsando Intro, la "
            + "\n   última nota transpuesta seguirá transponiéndose.");
            
        System.out.println("\nPara salir, pulse q + Intro.\n");
        String notaAnterior = "";
        
        while (true) {
            String nota = teclado.nextLine();
            
            if(nota.isEmpty()) nota = notaAnterior;
            else System.out.println();
            String nota1 = nota.toUpperCase();
            if (nota1.equals("Q")) break;
            
            switch(nota1) {
                case "A": System.out.println("A#");
                          notaAnterior = "A#";
                break;
                case "A#": System.out.println("B");
                           notaAnterior = "B";
                break;
                case "BB": System.out.println("B");
                           notaAnterior = "B";
                break;
                case "B": System.out.println("C");
                          notaAnterior = "C";
                break;
                case "C": System.out.println("C#");
                          notaAnterior = "C#";
                break;
                case "C#": System.out.println("D");
                           notaAnterior = "D";
                break;
                case "DB": System.out.println("D");
                           notaAnterior = "D";
                break;
                case "D": System.out.println("D#");
                          notaAnterior = "D#";
                break;
                case "D#": System.out.println("E");
                           notaAnterior = "E";
                break;
                case "EB": System.out.println("E");
                           notaAnterior = "E";
                break;
                case "E": System.out.println("F");
                          notaAnterior = "F";
                break;
                case "F": System.out.println("F#");
                          notaAnterior = "F#";
                break;
                case "F#": System.out.println("G");
                           notaAnterior = "G";
                break;
                case "GB": System.out.println("G");
                           notaAnterior = "G";
                break;
                case "G": System.out.println("G#");
                           notaAnterior = "G#";
                break;
                case "G#": System.out.println("A");
                           notaAnterior = "A";
                break;
                case "AB": System.out.println("A");
                           notaAnterior = "A";
                break;
                
                default: System.out.println("Nota no reconocida! Prueba en el rango [C,B#]\n");
            }
        }
        System.out.println();
        System.out.print("Later, bish!\n\n");
        
    }
}

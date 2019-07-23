package musica;
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
        
        System.out.println("Introduzca una nota y pulse Intro, "
            + "\nésta se transpondrá un semitono hacia arriba. ");
        System.out.println("Si sigue pulsa espacio + Intro, la "
            + "\núltima nota seguirá transponiéndose.");
            
        System.out.println("\nPara salir, pulse q + Intro.\n");
        
        while (true) {
            String nota = teclado.next();
            String nota1 = nota.toUpperCase();
            if (nota1.equals("Q")) break;
            
            switch(nota1) {
                case "A": System.out.println("A#\n");
                break;
                case "A#": System.out.println("B\n");
                break;
                case "BB": System.out.println("B\n");
                break;
                case "B": System.out.println("C\n");
                break;
                case "C": System.out.println("C#\n");
                break;
                case "C#": System.out.println("D\n");
                break;
                case "DB": System.out.println("D\n");
                break;
                case "D": System.out.println("D#\n");
                break;
                case "D#": System.out.println("E\n");
                break;
                case "EB": System.out.println("E\n");
                break;
                case "E": System.out.println("F\n");
                break;
                case "F": System.out.println("F#\n");
                break;
                case "F#": System.out.println("G\n");
                break;
                case "GB": System.out.println("G\n");
                break;
                case "G": System.out.println("G#\n");
                break;
                case "G#": System.out.println("A\n");
                break;
                case "AB": System.out.println("A\n");
                break;

                default: System.out.println("Nota no reconocida.");
            }
        }
        System.out.println();
        System.out.print("Later, bish!");
        
    }
}

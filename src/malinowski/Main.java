package malinowski;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CCircle koło= new CCircle() {};
        double wyn=koło.calculate();
        System.out.print(wyn);
        System.out.print(koło.toString());
        System.out.println();
        System.out.println();
        System.out.println();

        CFigure[] figury = new CFigure[6];
        figury[0]=new CCircle(){};
        figury[1]=new CCircle(){};
        figury[2]=new CRectangle() {};
        figury[3]=new CRectangle() {};
        figury[4]=new CRectPipe(){};
        figury[5]=new CRectPipe(){};
        for (CFigure e:figury) {
            System.out.print(e.calculate());
            System.out.println();
        }
        System.out.println();System.out.println();System.out.println();
        for (CFigure e:figury) {
            System.out.print(e.info());
            System.out.println();
        }

        System.out.println();System.out.println();System.out.println();


        CRectangle kwad = new CRectangle(){};
        CCircle kolo= new CCircle() {};
        System.out.print(kwad.info());
        System.out.println();
        System.out.print(kolo.info());
        System.out.println();System.out.println();System.out.println();
        ArrayList<CFigure> lista = new ArrayList<>();
        int odp;
        Scanner s = new Scanner(System.in);
        int count = 0;

        do{
            System.out.println("Wybierz figure: \n[1] kolo\n[2] prostokat\n[3] rura");
            int w = Integer.parseInt(s.nextLine());
            switch (w) {
                case 1 -> {
                    System.out.println("\nPodaj D:");
                    float d = Float.parseFloat(s.nextLine());
                    CCircle user1 = new CCircle(d){};
                    lista.add(user1);
                }
                case 2 -> {
                    System.out.println("\nPodaj A:");
                    float A = Float.parseFloat(s.nextLine());
                    System.out.println("\nPodaj B:");
                    float B = Float.parseFloat(s.nextLine());
                    CRectangle user2 = new CRectangle(A, B){};
                    lista.add(user2);
                }
                case 3 -> {
                    System.out.println("\nPodaj A:");
                    float a = Float.parseFloat(s.nextLine());
                    System.out.println("\nPodaj B:");
                    float b = Float.parseFloat(s.nextLine());
                    System.out.println("\nPodaj A1:");
                    float a1 = Float.parseFloat(s.nextLine());
                    System.out.println("\nPodaj B1:");
                    float b1 = Float.parseFloat(s.nextLine());
                    CRectPipe user3 = new CRectPipe(a, b, a1, b1);
                    lista.add(user3);
                }
                default -> System.out.println("\nZly wybor\n");
            }

            System.out.println("Czy nadal chcesz zakonczyc? [1->tak] ");
            odp = Integer.parseInt(s.nextLine());
        } while (odp != 1);
        for (CFigure e: lista) {
            System.out.println("\n"+e.info()+e);
        }
    }





}
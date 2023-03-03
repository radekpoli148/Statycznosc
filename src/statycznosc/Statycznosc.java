/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statycznosc;

public class Statycznosc {

    public static void main(String[] args) {
        //Matematyka test = new Matematyka(); //taka komenda jest nie potrzebna
        //wystarczy jedynie:
        double wynik = Matematyka.dodaj(10, 20);
        System.out.println(wynik);
        
        Klient a = new Klient("Arkadiusz");
        Klient b = new Klient("Aleksandra");
        Klient c = new Klient("Marek");
        
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        
        System.out.println(Klient.nastepnyId);
    }
    
}

class Matematyka
{
    static final double PI = 3.14;
    static double dodaj(double a, double b)
    {
        return a + b;
    }
}

class Klient
{
    Klient(String imie)
    {
        this.imie = imie;
        
        id = nastepnyId;
        
        nastepnyId++;
    }
    String imie;
    int id = 0;
    static int nastepnyId = 1;
}
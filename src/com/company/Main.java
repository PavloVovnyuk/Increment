package com.company;

public class Main {
    static int i = 10;

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                i = i++;
            }
        }).start();
        new Thread(() -> {
            while (true) {
                System.out.println(i);
            }
        }).start();
    }

    /*Stos operandów{
    mozemy zobaczyc instrukcje JDK, jak jest wykonywany dany cod.
    javap -v (dokladnie pokaze co za czym  wyonywane)

    Najpierw 10 Trafia na stos operandow (tutaj wykonujasie wszystkie operacje ze znienna)
    tylko potem ona zostaje zapisana do tablicy zmiennych lokalnych

    10

    */
    /*Tablica zmiennych lokalnych
    10
     */
}

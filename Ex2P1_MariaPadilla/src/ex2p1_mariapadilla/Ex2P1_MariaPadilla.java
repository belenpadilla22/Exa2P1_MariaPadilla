
package ex2p1_mariapadilla;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Ex2P1_MariaPadilla {
    static Random ran=new Random();
    static Scanner leer=new Scanner (System.in);
    static ArrayList < Personajes> listas =new ArrayList <>();
    static ArrayList < Items> mochilas =new ArrayList <>();

    
    public static void main(String[] args) {
        // Fila 1, asiento 2

        int c=0;
        Personajes m=new Personajes();
        Items b=new Items ();// se obtenienen al cruzar los cuartos de castillo
        System.out.println(" Te has encontrado a 3 Heartless! ");
        listas.add(new Personajes ("Sora",300,300,75,15.0));
        listas.add(new Personajes ( "Donald ", 150,450,45,10.0));
        listas.add(new Personajes ( "Goofy", 450,100,100,50.0));
        mochilas.add(new Items (" Pocion ", 50,0));
          for (int i = 0; i <listas.size(); i++) {
            System.out.println(listas.get(i).toString()); 
            
        }
        while (c<20){
            
        c++;
       
        
        int random=1+ran.nextInt(5);
       // System.out.println(random);
        
        switch (random){
            case 1:
                int enemigos=1+ran.nextInt(3);
                double heartless=(75*enemigos);
                double atkheart = 25*enemigos;
                while (enemigos>0 || listas.size()>0){
                    System.out.println(" Elige el personaje: ");
                     int perso=leer.nextInt();
                     Personajes elegir =listas.get(perso);
                    menu();   
                     System.out.println(" Ingrese una opcion: ");
                    int opcion=leer.nextInt();
                     switch (opcion){
                         case 0 :
                             String nombre=" ";
                        if (opcion==0){
                            nombre = "Sora";
                        
                        }
                         if (opcion==1){
                            nombre = "Donald";
                        
                        }
                          if (opcion==2){
                            nombre = "Goofy";
                        
                        }
                        System.out.println(nombre+ " ataco ");
                        System.out.println(nombre+ " Recibio el golpe ");
                        System.out.println(heartless);
                        Personajes temp = listas.get(perso);
                        heartless = heartless - temp.getAttackPoints();
                             System.out.println(heartless);
                        temp.setHP(temp.getHP()-(atkheart-(atkheart*(temp.getDefensePoints()/100))));
                        listas.remove(perso);
                        listas.add(temp);
                        System.out.println(listas.get(2).toString());
                        
                       
                        
                        break;
                    case 1:
                        System.out.println("1. Blizzard 50 MP- 50 DMG ");
                        System.out.println("2. Firaga 25MP-25DMG ");
                        System.out.println("3. Gravity 75MP- 100 DMG ");
                        System.out.println(" Ingrese una opcion ");
                        int option=leer.nextInt();
                         nombre=" ";
                        if (opcion==0){
                            nombre = "";
                        
                        }
                         if (opcion==1){
                            nombre = "Donald";
                        
                        }
                          if (opcion==2){
                            nombre = "Goofy";
                        
                        }
                        int MP=0;
                        int DMG=0;
                        if (option==1){
                            MP=50;
                            DMG=50;
                        
                        }
                        if (option==2){
                            MP=25;
                            DMG=25;
                        
                        }
                        if (option==3){
                            MP=75;
                            DMG=100;
                        
                        }
                        elegir.setMP(elegir.getMP()-MP);
                        atkheart-=DMG;
                        System.out.println(nombre+" uso ");
                        System.out.println( nombre+" Recibio el golpe ");
                        System.out.println(nombre+" Los heartless les quedan "+atkheart);
                        
                        
                        break;
                    case 2:
                        mochilas.add(new Items("Pocion",50,0));
                        mochilas.add(new Items("Ether", 0,50));
                        mochilas.add(new Items("Elixir", 100,100));
                        for (int i = 0; i <mochilas.size(); i++) {
                             System.out.println(mochilas.get(i).toString()); 
            
                  }
                        System.out.println(" Elige un item : ");
                        int item=leer.nextInt();
                         Items eleccion =mochilas.get(item);
                         elegir.setHP(eleccion.getHPpoints()+elegir.getHP());
                       
                        break;
                    }    
                }          
                break;
                
            case 2:
                System.out.println(" Entraste a un cuarto con un cofre con pocion ");
                mochilas.add(new Items("Pocion",50,0));
                break;
            case 3:
                System.out.println(" Entraste a un cuarto con un cofre que contiene un Ether ");
                mochilas.add(new Items("Ether", 50,0));
                break;  
            case 4:
                System.out.println(" Entraste a un cuarto con un cofre que contiene un Elixir ");
                mochilas.add(new Items("Elixir", 50,0));
                break;
                
            case 5:
                break;
        
        }
        
   
    }
        System.out.println(" No valido ");
    
   
        }
    public static void menu (){
        System.out.println("------ MENU------");
        System.out.println(" 0.- Attack ");
        System.out.println(" 1.- Magic ");
        System.out.println(" 2.- Items ");
        System.out.println(" 3.- Party ");
 
    
    }
        
}

package ex2p1_mariapadilla;

import java.util.ArrayList;

public class Personajes {

    String nombre;
    double HP;
    int MP, AttackPoints;
    double DefensePoints;

    public Personajes() {
    }

    public Personajes(String nombre, double HP, int MP, int AttackPoints, double DefensePoints) {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.AttackPoints = AttackPoints;
        this.DefensePoints = DefensePoints;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAttackPoints() {
        return AttackPoints;
    }

    public void setAttackPoints(int AttackPoints) {
        this.AttackPoints = AttackPoints;
    }

    public double getDefensePoints() {
        return DefensePoints;
    }

    public void setDefensePoints(int DefensePoints) {
        this.DefensePoints = DefensePoints;
    }

    public void party(ArrayList<String> nombres) {
        nombres.add(" SORA = 300 ");
    }

    @Override
    public String toString() {
        return "" +nombre + "\nHP=" + HP + ", \nMP=" + MP + ",\nAttackPoints=" + AttackPoints + ", \nDefensePoints=" + DefensePoints + "\n";
    }
   
    
}

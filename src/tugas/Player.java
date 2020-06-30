package tugas;

import java.util.Scanner;

public class Player {
    String name;
    String job;
    int basic;
    int skill;
    int health;
    int mana;
    int speed;
    int atk;
    int defense;
    int dmg;
    int hp;

    Scanner scanner = new Scanner(System.in);
    Scanner basicAtk = new Scanner(System.in);


    public Player(){
    }

    public Player(String id, String pw) {
        System.out.println("LOGIN");
        System.out.println("Username \t:" + pw);
        System.out.println("Password \t:" + id);
    }




    void createPlayer(){
        System.out.print("Create Name : ");
        name = scanner.nextLine();
        System.out.print("Select Job : ");
        job = scanner.nextLine();
    }

    void status(String String ){
        System.out.println(String);
        System.out.println("Name \t\t: " + name);
        System.out.println("Job Skill \t: " + job);
        System.out.println(String);
        System.out.println("ATK \t\t: " + atk);
        System.out.println("DEFF \t\t: " + defense);
        System.out.println("Speed \t\t: " + speed);
        System.out.println("HP \t\t\t: " + health);
        System.out.println(String);
    }

    void attack(){
        System.out.println("Player Launch Attack...");
        System.out.println("Damage 50");
    }
    int attack(int dmg){
        System.out.println(name + " Player Launch Attack...");
        System.out.println("Damage" + dmg);
        return dmg;
    }
    void attack(String attack){
        System.out.println(name + " Launch " + attack + "...");
        System.out.println("Damage 50");
    }
    void attack(String attack, int dmg){
        System.out.println(name + " Launch " + attack + "...");
        System.out.println("Damage " + dmg);
    }

    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }

    void healing(){
           if(health >1) {
               System.out.println("Healing +100");
           }
           else if(health == health) {
               System.out.println("HP full");
           }
    }

    void getAtk(int dmg){
        System.out.println(name + " terkena Serangan musuh");
        health = health - dmg;
        System.out.println("HP \t:" + health);
    }

    void skill(){
        System.out.println("1.Basic Attack");
        System.out.println("2.Skill");
        System.out.print("Pilih serangan : ");
        basic = basicAtk.nextInt();
        if (basic == 1){
            System.out.println("Basic Attack damage 30 ");
        }else if(basic == 2){
            System.out.println("Skill");
            System.out.println("1.Slash");
            System.out.println("2.Steal");
            System.out.print("Pilih Skill : ");
            skill = basicAtk.nextInt();
            if (skill == 1){
                System.out.println("Damage : 80 " );
            }else if(skill == 2){
                System.out.println("No Damage");
                System.out.println("get 10 gold");
            }else{
                System.out.println("Pilih Skill");
            }
        }else{
            System.out.println("Tentukan Pilihan Attack");
        }
    }

    boolean isDead(){
        if(health <=0) return true;
        return false;
    }
}

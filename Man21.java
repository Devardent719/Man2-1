
import java.util.Random;

public class Man21{
    public static void main(String[] args){
        Man man = new Man("Mark");
    }
}
class Man{
    public Man(String _name){
        Name = _name;
        isLife = true;
        
        Age = rand.nextInt(35) + 15;
        Health = rand.nextInt(90) + 10;
        //System.out.println(Age + " " + Health);
        //Talk();
    }

    private final Random rand = new Random();

    private String Name;
    private int Age;
    private int Health;
    private boolean isLife;

    public void Talk(){
        int randTalk = rand.nextInt(1, 4);
        String str = "";

        switch(randTalk){
            case 1:
                str = "Привет, меня зовут " + Name + ", рад познакомиться";
                break;
            case 2:
                str = "Мне " + Age + ". А тебе?";
                break;
            case 3:
                if (Health > 50) 
                    str = "Да я здоров как бык!"; 
                else 
                    str = "Со здоровьем у меня хреново, дожить бы до " + (Age + 10);
            break;
        }
    }
    public void Go(){
        if(isLife){
            if(Health > 40){
                String outStr = Name + " мирно прогуливается по городу";
                System.out.println(outStr);
            }
            else{
                String outStr = Name + " болен и не может гулять по городу";
                System.out.println(outStr);
            }
        }  
        else{
            String outStr = Name + " неможет идти, он умер";
            System.out.println(outStr);
        }
    }
    public void Kill(){
        isLife = false;
    }
    public boolean isAlive(){
        return isLife;
    }
}

import java.util.Random;
import java.util.Scanner;

public class Man21{
    public static void main(String[] args){
        Man man = null;
        Scanner scan = new Scanner(System.in);

        boolean Infiniti = true;
        String command = "";

        while(Infiniti){
            System.out.print("Введите команду: ");

            command = scan.nextLine();
            switch(command){
                case "exit":
                    Infiniti = false;
                break;
                case "help":
                    System.out.println("Список команд: \n---");
                    System.out.println("1.create man \n2.kill \n3.talk \n4.go");
                    break;
                case "create man":
                    System.out.print("Введите имя нового человека: ");
                    String name = scan.nextLine();

                    man = new Man(name);
                    System.out.println("Человек успешно создан");
                    break;
                case "kill":
                    if(man != null){
                        man.Kill();
                    }
                    else{
                        System.out.println("Нет созданного человека");
                    }
                    break;
                case "talk":
                    if(man != null){
                        man.Talk();
                    }
                    else{
                        System.out.println("Нет созданного человека");
                    }
                    break;
                case "go":
                    if(man != null){
                        man.Go();
                    }
                    else{
                        System.out.println("Нет созданного человека");
                    }
                    break;
                default:
                    System.out.println("Ваша команда не определена");
            }
        }
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
        System.out.println(str);
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

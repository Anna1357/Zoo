package org.itstep;

import java.util.Scanner;
public class AnimalAccounting {
    private static Scanner scanner;
    private final Zoo zoo=new Zoo();

    public AnimalAccounting() {
        scanner = new Scanner( System.in );
    }
    public  void start() {
        int menu;
        do {
            System.out.println("Введите номер команды: ");
            menu=menu();

            switch (menu) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    showAnimals();
                    break;
                case 3:
                    deleteAnimal();
                    break;
                case 4:
                    addExp();
                    break;
                case 5:
                    calcExpToday();
                    break;
                case 6:
                    calcAllExp();
                    break;
            }
        } while (menu!=0);
    }
    private  void addAnimal(){
        String name;
        int age;
        int weight;
        int number;
        int years;
        System.out.println("Enter name");
        name = scanner.next();
        System.out.println("Enter age");
        age = scanner.nextInt();
        System.out.println("Enter weight");
        weight = scanner.nextInt();
        System.out.println("Enter number");
        number = scanner.nextInt();
        System.out.println("Enter time in the zoo");
        years = scanner.nextInt();
        Animals animal=null;
        System.out.println("Введите вид животного: ");
        System.out.println(" 1 - DinoDog\n"+
                "2 - Gaduka\n"+
                "3 - Lion\n"+
                "4 - Pantera\n"+
                "5 - Piton\n"+
                "6 - Udav\n"+
                "7 - Wolf");
        int numb=getIntInRange(1,7);
        switch (numb){
            case 1: {
                animal=new Dogdingo(name, age, weight, number, years,"dingoDog");
            }
            break;
            case 2: {
                animal=new Gaduka(name, age, weight, number, years,"gaduka");
            }
            break;
            case 3: {
                animal=new Lion(name, age, weight, number, years,"lion");
            }
            break;
            case 4: {
                animal=new Pantera(name, age, weight, number, years,"Pantera");
            }
            break;
            case 5: {
                animal=new Piton(name, age, weight, number, years,"Piton");
            }
            break;
            case 6: {
                animal=new Udav(name, age, weight, number, years,"Udav");
            }
            break;
            case 7: {
                animal=new Wolf(name, age, weight, number, years,"Wolf");
            }
            break;
            default: {
                System.out.println("Error");
            }
        }
        zoo.add( animal );
    }

    private  void calcAllExp(){
        System.out.println("Расходы за весь период: $"+zoo.getAllExp());
    }
    private  void calcExpToday(){
        Date date=getDate();
        System.out.println("Расходы за текущий день: "+zoo.getExpForDay( date ));
    }

    private Date getDate() {
        System.out.println("Введите день: ");
        int day=getIntInRange( 1,31 );
        System.out.println("Введите месяц: ");
        int month=getIntInRange( 1,12 );
        System.out.println("Введите год: ");
        int year=getIntInRange( 1980,2100 );
        return new Date(day,month,year);
    }

    private  void addExp(){
        System.out.println("Добавление расходов на день ");
        System.out.println("Введите кличку животного: ");
        String name = scanner.nextLine();
        System.out.println("Введите сумму расходов: ");
        double money=Double.parseDouble( scanner.nextLine() );
        System.out.println("Введите дату: ");
        Date date=getDate();
        zoo.addExp( name,new Expen( money,date ) );
    }
    private  void deleteAnimal(){
        System.out.println("Удаление животного по имени ");
        System.out.println("Введите кличку живтного : ");
        String name=scanner.nextLine();
        zoo.deleteByName( name );
    }
    private  void showAnimals(){
        for(Animals animal:zoo.getAnimals()){
            System.out.println(animal);
        }
    }


    private int menu(){
        System.out.println(
                "1 - Добавить новое животное\n" +
                        "2 - Вывести всех животных\n" +
                        "3 - Удалить животное по имени\n" +
                        "4 - Добавить расход еды за текущий день по текущему животному\n" +
                        "5 - Посчитать расходы на еду за этот день\n" +
                        "6 - Посчитать расходы на еду за весь период\n"+
                        "0 - Exit" );
        return getIntInRange(0,6);
    }

    private static int getIntInRange(int a, int b) {
        int menu=0;
        do{
            System.out.println(">>>");
            String input=scanner.nextLine();
            try{
                menu=Integer.parseInt( input );
            }catch (Throwable ex){
                System.out.println("Необходимо ввести число от "+a+" до "+b);
            }
        }while(menu <a|| menu>b);
        return menu;
    }
}


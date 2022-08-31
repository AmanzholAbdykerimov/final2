package com.company;

import Dao.UserDao;
import Gender.Gender;
import Model.User;
import Service.UserService;
import Service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) throws MyException {
        UserServiceImpl pult =new UserServiceImpl();
        User user1=new User(1,"Tursunbek",23, Gender.Male);
        User user2=new User(2,"Kubat",24,Gender.Male);
        User user3=new User(3,"jamiyla",21,Gender.Fomale);
        pult.addUser(user1);
        pult.addUser(user2);
        pult.addUser(user3);
        System.out.print("Birinchi polzovatel=  ");
        pult.searchID(1);
        System.out.print("polzovatelder=  ");
        pult.allUsers();
        pult.deleteID(2);
        System.out.print("Udalenieden kiyin   ");
        pult.allUsers();

    }
}

/*1) Жаны проект тузунуз.
        2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
        3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, Gender, Genderди enum кылып башка пакетке
         тузуп койсонуз болот. id бул жон эле userдин уникалдуу свойствасы болот.
        4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер, бул класс биздин база данныхыбыз болот.
        5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
        6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.
        7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат
        жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
        8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
        9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
        10) Аларды биздин базага кошунуз.
        11) 1 деген id менен userди таап консольго чыгарыныз.
        12) Эгер ал id жок болсо анда RunTimeException кармасын.
        13) Exception ди озунуздор тузунуздорю
        14) Баардык userлерди консольго чыгарыныз.
        15) 2 деген id менен userди очурунуз.
        16) Баардык userлерди консольго чыгарыныз.*/
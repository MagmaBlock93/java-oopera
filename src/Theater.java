import person.Actor;
import person.Director;
import person.Gender;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;

public class Theater {

    Actor actorA = new Actor("Имя Актера А","Фамилия Актера А", Gender.MALE, 180);
    Actor actorB = new Actor("Имя Актера Б","Фамилия Актера Б", Gender.FEMALE, 160);
    Actor actorC = new Actor("Имя Актера В","Фамилия Актера В", Gender.FEMALE, 170);

    Director directorA = new Director("Имя Режиссера А", "Фамилия Режиссера А", Gender.MALE, 180, 4);
    Director directorB = new Director("Имя Режиссера Б", "Фамилия Режиссера Б", Gender.FEMALE, 190, 9);

    Person musicAuthor = new Person("Имя АвтораМузыки", "Фамилия АвтораМузыки", Gender.MALE, 170);

    Person choreographer = new Person("Имя Хореографа", "Фамилия Хореографа", Gender.FEMALE, 180);

    Show show = new Show("Спектакль", directorA,120);
    Ballet ballet = new Ballet("Балет", directorB, 180, "Текст Либретто А", musicAuthor, choreographer);
    Opera opera = new Opera("Опера", directorA, 240, "Текст Либретто Б", musicAuthor, 20);

    public static void main(String[] args) {
        Theater theater = new Theater();

        theater.showHandler();
        theater.balletHandler();
        theater.operaHandler();


    }

    private  void showHandler(){
        System.out.println("Начинаем работу со спектаклем");
        System.out.println("Добавляем актера");
        show.addNewActor(actorA);
        System.out.println("Добавляем этого же актера");
        show.addNewActor(actorA);
        System.out.println("Добавляем другого актера");
        show.addNewActor(actorB);
        System.out.println("Выводим список актеров");
        show.printListOfActors();
        System.out.println("Выводим режиссера");
        show.printDirectorInfo();
        System.out.println("Заменяем одного актера на другого");
        show.replaceActor(actorC,"Фамилия Актера Б");
        System.out.println("Выводим новый список актеров");
        show.printListOfActors();
        System.out.println("Работа со спектаклем закончена\n");
    }

    private void balletHandler(){
        System.out.println("Начинаем работу с балетом");
        System.out.println("Добавляем актера");
        ballet.addNewActor(actorB);
        System.out.println("Добавляем другого актера");
        ballet.addNewActor(actorC);
        System.out.println("Выводим список актеров");
        ballet.printListOfActors();
        System.out.println("Выводим текст Либретто");
        ballet.printLibretto();
        System.out.println("Работа с балетом закончена\n");
    }

    private void operaHandler(){

        System.out.println("Начинаем работу с оперой");
        System.out.println("Добавляем актера");
        opera.addNewActor(actorA);
        System.out.println("Добавляем другого актера");
        opera.addNewActor(actorC);
        System.out.println("Выводим список актеров");
        opera.printListOfActors();
        System.out.println("Выводим текст Либретто");
        opera.printLibretto();
        System.out.println("Работа с оперой закончена\n");

        System.out.println("Заменяем актера в опере на несуществующего");
        opera.replaceActor(null, "Фамилия Актера А");

    }
}

package show;

import person.Actor;
import person.Director;

import java.util.HashMap;

public class Show {
    private int duration;
    private String title;
    Director director;
    HashMap<String, Actor> listOfActors = new HashMap<>();

    public Show(String title, Director director, int duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public void printDirectorInfo(){
        System.out.println(String.format("Имя режиссера: %s",director.getName()));
    }

    public void printListOfActors(){
        System.out.println("Список Актеров:");
        for (Actor actor : listOfActors.values()){

            System.out.println(String.format("%s %s (рост %d)",actor.getName(),actor.getSurname(),actor.getHeight()));
        }
    }

    public void addNewActor(Actor actor){
        if (!listOfActors.containsValue(actor)){
            listOfActors.put(actor.surname,actor);
            System.out.println("Актер успешно добавлен!");
        } else {
            System.out.println("Такой актер уже участвует в постановке!");
        }
    }

    public void replaceActor(Actor newActor, String oldActorSurname){
        listOfActors.replace(oldActorSurname,newActor);
        System.out.println("Актер успешно заменен!");
    }
}

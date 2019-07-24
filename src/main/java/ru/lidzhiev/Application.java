package ru.lidzhiev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lidzhiev.Music.ClassicMusic;
import ru.lidzhiev.Music.Music;
import ru.lidzhiev.entity.TodoList;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        SessionFactory factory;
        factory = new Configuration().configure().buildSessionFactory();
        try(Session session = factory.openSession()) {
            List<TodoList> list = session.createQuery("from TodoList").list();
            for (TodoList t: list
                 ) {

                System.out.println(t.getId());
                System.out.println(t.getDescription());
                System.out.println(t.getTargetDate());
            }
        }

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("MusicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();


    }
}

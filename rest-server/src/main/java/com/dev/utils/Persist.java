
package com.dev.utils;

import com.dev.objects.Message;
import com.dev.objects.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class Persist {

    private final SessionFactory sessionFactory;

    @Autowired
    public Persist (SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public User getUserByUsername (String username) {
        User found = null;
        Session session = sessionFactory.openSession();
        found = (User) session.createQuery("FROM User WHERE username = :username")
                .setParameter("username", username)
                .uniqueResult();
        session.close();
        return found;
    }

    public void saveUser (User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.close();
    }



    public User getUserByUsernameAndToken (String username, String token) {
        User found = null;
        Session session = sessionFactory.openSession();
        found = (User) session.createQuery("FROM User WHERE username = :username " +
                        "AND token = :token")
                .setParameter("username", username)
                .setParameter("token", token)
                .uniqueResult();
        session.close();
        return found;
    }

    public List<User> getAllUsers () {
        Session session = sessionFactory.openSession();
        List<User> allUsers = session.createQuery("FROM User ").list();
        session.close();
        return allUsers;
    }

    public User getUserByToken (String token) {
        Session session = sessionFactory.openSession();
        User user = (User) session.createQuery("From User WHERE token = :token")
                        .setParameter("token", token)
                                .uniqueResult();
        session.close();
        return user;
    }

    public List<Message> getMessagesByToken (String token) {
        Session session = sessionFactory.openSession();
        List<Message> messages = session.createQuery("FROM Message WHERE recipient.token = :token ")
                .setParameter("token", token)
                .list();
        session.close();
        return messages;
    }

    public List<Message> getConversation (String token, int recipientId) {
        Session session = sessionFactory.openSession();
        List<Message> messages = session.createQuery(
                "FROM Message WHERE " +
                        "(sender.token = :token AND recipient.id = :id)" +
                        " OR " +
                        "(sender.id = :id2 AND recipient.token = :token2) ORDER BY id")
                .setParameter("token", token)
                .setParameter("token2", token)
                .setParameter("id", recipientId)
                .setParameter("id2", recipientId)
                .list();
        session.close();
        return messages;
    }

    public User getUserById (int id) {
        Session session = sessionFactory.openSession();
        User user = (User) session.createQuery("FROM User WHERE id = :id")
                .setParameter("id", id)
                .uniqueResult();
        session.close();
        return user;
    }

    public void saveMessage (Message message) {
        Session session = sessionFactory.openSession();
        session.save(message);
        session.close();
    }

}

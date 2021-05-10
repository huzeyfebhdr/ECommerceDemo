package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class DemoUserDao implements UserDao {

    List<User> users = new ArrayList<User>();


    @Override
    public void add(User user) {
        users.add(user);
        System.out.println("Kullanıcı eklendi: "+user.getFirstName());


    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println("Kullanıcı silindi: "+user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı güncellendi: "+user.getFirstName());
    }

    @Override
    public User getId(int id) {
        for(User user:users){
            if (user.getId()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getMail(String eMail) {
        for(User user:users){
            if (user.getEmail()==eMail){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}

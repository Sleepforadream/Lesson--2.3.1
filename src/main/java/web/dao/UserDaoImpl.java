//package web.dao;
//
//import jakarta.persistence.TypedQuery;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import web.model.User;
//
//import java.util.List;
//
//@Repository
//public class UserDaoImpl implements UserDao {
//
//    private SessionFactory sessionFactory;
//
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public void addUser(User user) {
//        sessionFactory.getCurrentSession().persist(user);
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return sessionFactory.getCurrentSession().createQuery("from User", User.class).getResultList();
//    }
//
//    @Override
//    public User getUserById(int userId) {
//        TypedQuery<User> getByIdQuery = sessionFactory.getCurrentSession().createQuery("from User where id=:parameterId", User.class);
//        getByIdQuery.setParameter("parameterId", userId);
//
//        return getByIdQuery.getSingleResult();
//    }
//
//    @Override
//    public void updateUser(int id, User user) {
//        User updateUser = getUserById(id);
//        updateUser.setName(user.getName());
//        updateUser.setSurname(user.getSurname());
//        updateUser.setAge(user.getAge());
//        sessionFactory.getCurrentSession().merge(updateUser);
//    }
//
//    @Override
//    public void deleteUser(int userId) {
//        sessionFactory.getCurrentSession().remove(getUserById(userId));
//    }
//}

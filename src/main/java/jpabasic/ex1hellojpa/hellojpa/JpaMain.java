package jpabasic.ex1hellojpa.hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    /**
     * Init Commit
     */

    @PersistenceContext
    static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setId(100L);
            member.setName("HelloJPA");
            em.persist(member);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
    }
}

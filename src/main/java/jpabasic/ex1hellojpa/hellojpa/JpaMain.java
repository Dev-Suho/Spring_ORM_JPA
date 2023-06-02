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
            /*
            // 영속
            Member member = new Member(200L, "member200");
            em.persist(member);
            em.flush();
             */

            // 준영속
            Member member = em.find(Member.class, 150L);
            member.setName("AAAAA");
            em.detach(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
    }
}

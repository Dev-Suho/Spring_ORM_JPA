package jpabasic.ex1hellojpa.hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

public class JpaMain {

    /**
     * Init Commit
     */

    @PersistenceContext
    static EntityManager em;

    public static void main(String[] args) {
        try {
            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                    .setFirstResult(5)
                    .setMaxResults(8)
                    .getResultList();
        } catch (Exception e) {
        }
    }
}

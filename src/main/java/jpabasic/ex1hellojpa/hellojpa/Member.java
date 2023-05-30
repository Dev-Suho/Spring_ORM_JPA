package jpabasic.ex1hellojpa.hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
        @Id
        private Long id;
        private String name;
}

package jpabasic.ex1hellojpa.domainV5;

import jpabasic.ex1hellojpa.domainV3.DeliveryStatus;
import jpabasic.ex1hellojpa.domainV3.OrderV3;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private OrderV3 orderV3;
}

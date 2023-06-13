package jpabasic.ex1hellojpa.domainV5;

import jpabasic.ex1hellojpa.domainV3.DeliveryStatus;
import jpabasic.ex1hellojpa.domainV3.OrderV3;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private OrderV3 orderV3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public OrderV3 getOrderV3() {
        return orderV3;
    }

    public void setOrderV3(OrderV3 orderV3) {
        this.orderV3 = orderV3;
    }
}

package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class Orderitem extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name= "ORDER_ITEM_ID")
    private Long id;

//    @Column(name="ORDER_ID")
//    private Long orderId;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

//    @Column(name="ITEM_ID")
//    private Long itemId;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    private int orderPrice;
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public Long getItemId() {
//        return itemId;
//    }
//
//    public void setItemId(Long itemId) {
//        this.itemId = itemId;
//    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

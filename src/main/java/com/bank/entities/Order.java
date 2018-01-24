package com.bank.entities;

import com.bank.utils.enums.OrderType;

import javax.persistence.*;

/**
 * Created by bobyk on 1/24/18.
 */
@Entity
@Table(name="orders")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "userId")
    private long userId;
    @Column(name = "orderType")
    private OrderType orderType;
    @Column(name = "amount")
    private long amount;
    @Column(name = "comment")
    private String comment;

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getAmount() {
        return amount;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public String getComment() {
        return comment;
    }
}

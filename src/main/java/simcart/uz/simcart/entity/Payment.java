package simcart.uz.simcart.entity;

import simcart.uz.simcart.entity.enums.PayType;
import simcart.uz.simcart.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment extends AbsEntity {

    @ManyToOne
    private SimCard simCard;

    @Enumerated(EnumType.STRING)
    private PayType payType;

    private double amount;

    private String payerName;

    private String payerId;
    //chek nomeri
}

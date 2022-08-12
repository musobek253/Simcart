package simcart.uz.simcart.entity;

import simcart.uz.simcart.entity.enums.PacketType;
import simcart.uz.simcart.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Packet extends AbsEntity {

    @Enumerated(EnumType.STRING)
    private PacketType packetType;

    private String name;

    private int amount;

    private int price;

    private int duration; //5 kunlik

    private Timestamp expireDate;

    @ManyToMany
    private List<SimCard> simCardList;

}

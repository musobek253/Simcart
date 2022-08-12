package simcart.uz.simcart.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import simcart.uz.simcart.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filial extends AbsEntity {

    private String name;


    //user
    @JsonIgnoreProperties
    @OneToOne(fetch = FetchType.LAZY)
    //    @JsonIgnore
    private Staff director;

    //staffs xodimlar ro'yxati
    @OneToMany(mappedBy = "filial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Staff> staffList;

}

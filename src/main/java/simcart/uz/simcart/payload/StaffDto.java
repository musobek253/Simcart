package simcart.uz.simcart.payload;

import lombok.Data;

@Data
public class StaffDto {
    private String fullName;
    private String userName;
    private Integer roleId;

    private Integer filialId;
    private String position; //hr
    private String password;
}

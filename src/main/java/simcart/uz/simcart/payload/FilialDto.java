package simcart.uz.simcart.payload;

import lombok.Data;

import java.util.List;

@Data
public class FilialDto {

    private String name;

    private StaffDto staffDto;

    private List<String> staffUsernames;


}

package lk.ijse.dep.web.dto;

import lk.ijse.dep.web.entity.Gender;
import lk.ijse.dep.web.entity.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
@Data @AllArgsConstructor @NoArgsConstructor
public class MemberDTO implements Serializable {
    Integer id;
    Name name;
    String contact_no;
    Gender gender;
}

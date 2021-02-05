package lk.ijse.dep.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
@Embeddable
@Data @AllArgsConstructor @NoArgsConstructor
public class Name implements Serializable {
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
}

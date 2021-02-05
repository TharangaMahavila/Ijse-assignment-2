package lk.ijse.dep.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
@Data @AllArgsConstructor @NoArgsConstructor
public class IssueDTO implements Serializable {
    Integer memberId;
    Integer bookId;
    Date date;
}

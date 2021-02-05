package lk.ijse.dep.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "issue")
public class Issue implements SuperEntity{
    @EmbeddedId
    private
    IssuePK issuePK;
    private Date date;

    public Issue(int memberId, int bookId, Date date) {
        this.issuePK = new IssuePK(memberId,bookId);
        this.date = date;
    }
}

package lk.ijse.dep.web.dao;

import javax.persistence.EntityManager;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
public interface SuperDAO {
    public abstract void setEntityManager(EntityManager entityManager) throws Exception;
}

package lk.ijse.dep.web.dao;

import lk.ijse.dep.web.entity.SuperEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
public class CrudDAOImpl<T extends SuperEntity,K extends Serializable> implements CrudDAO<T,K>{

    private EntityManager em;
    private Class<T> entityClass;

    public CrudDAOImpl() {
        entityClass =(Class<T>) (((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
    }

    @Override
    public void save(T entity) throws Exception {
        em.persist(entity);
    }

    @Override
    public void update(T entity) throws Exception {
        em.merge(entity);
    }

    @Override
    public void delete(K key) throws Exception {
        em.remove(key);
    }

    @Override
    public List<T> getAll() throws Exception {
        return em.createQuery("SELECT b from "+entityClass.getName()+" b").getResultList();
    }

    @Override
    public T get(K key) throws Exception {
        return em.find(entityClass,key);
    }

    @Override
    public void setEntityManager(EntityManager entityManager) throws Exception {
        this.em = entityManager;
    }
    protected EntityManager getEntityManager(){
        return this.em;
    }
}

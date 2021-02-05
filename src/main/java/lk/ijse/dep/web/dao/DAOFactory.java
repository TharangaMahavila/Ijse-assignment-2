package lk.ijse.dep.web.dao;

import lk.ijse.dep.web.dao.custom.impl.BookDAOImpl;
import lk.ijse.dep.web.dao.custom.impl.IssueDAOImpl;
import lk.ijse.dep.web.dao.custom.impl.MemberDAOImpl;
import lk.ijse.dep.web.entity.SuperEntity;

/**
 * @author:Tharanga Mahavila <tharangamahavila@gmail.com>
 * @since : 2021-02-05
 **/
public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory(){

    }
    public static DAOFactory getInstance(){
        return (daoFactory==null)?(daoFactory = new DAOFactory()):daoFactory;
    }
    public <T extends SuperDAO>T getDAO(DAOTypes types){
        switch (types){
            case MEMBER:
                return (T) new MemberDAOImpl();
            case BOOK:
                return (T) new BookDAOImpl();
            case ISSUE:
                return (T) new IssueDAOImpl();
            default:
                return null;

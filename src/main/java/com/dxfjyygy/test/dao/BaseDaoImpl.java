package com.dxfjyygy.test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by longjinwen on 2017/3/22.
 */
public class BaseDaoImpl  implements BaseDao{
    @Autowired
    private SessionFactory sessionFactory;
    Session getSession(){
        return  sessionFactory.getCurrentSession();
    }

    public <T> T findObject(String hql) {
        return null;
    }

    public <T> T findObject(String hql, Object... objects) {
        return null;
    }

    public <T> T findObject(Class<T> cls, Serializable id) {
        return null;
    }

    public <T> T findObjectBySql(String sql) {
        return null;
    }

    public <T> T findObjectBySql(String sql, Object... objects) {
        return null;
    }

    public <T> List<T> findList(String hql) {
        return null;
    }

    public <T> List<T> findList(String hql, Object... objects) {
        return null;
    }

    public <T> List<T> findList(Class<T> cls) {
        return null;
    }

    public <T> List<T> findListBySql(String sql) {
        return null;
    }

    public <T> List<T> findListBySql(String sql, Object... objects) {
        return null;
    }

    public <T> void saveObject(T obj) {

    }

    public <T> void updateObject(T obj) {

    }

    public <T> void saveOrUpdateObject(T obj) {

    }

    public int executeSql(String sql) {
        return 0;
    }

    public int executeSql(String sql, Object... objects) {
        return 0;
    }

    public int coutObjects(String hql) {
        return 0;
    }

    public int countObjects(String hql, Object... objects) {
        return 0;
    }

    public <T> PageList<T> findPageList(String hql, int page, int rows) {
        return null;
    }

    public <T> PageList<T> findPageList(String hql, int page, int rows, Object... objects) {
        return null;
    }
}

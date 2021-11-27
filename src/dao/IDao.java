/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author HP
 */
import java.util.List;

/**
 *
 * @author HP
 */
public interface IDao<T> {

public int insert(T ogj);
public int update(T ogj);
public int delete(int code);




public List<T> findAll();
public T findByCode(int code);

    

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author SOFT06
 */
public class ConeccionBD {

    public ObjectContainer coneccionBD(String dataBase) {
        ObjectContainer db = Db4o.openFile(dataBase);
        return db;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.sql.Connection;

/**
 *
 * @author CS
 */
public interface SecureDatabaseAccess {
    Connection getDatabaseConnection();
}

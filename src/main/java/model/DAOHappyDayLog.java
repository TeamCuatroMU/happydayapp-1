
package model;

import model.HappyDayLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Devin Walter
 */
public class DAOHappyDayLog {
    
    protected final static boolean DEBUG = true;
    
    public static void addUser(HappyDayLog newUser){
        final String QUERY = "insert into users (email, firstname, lastname, username, birthmonth, birthyear) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(QUERY);){
            statement.setString(1, newUser.getEmail());
            statement.setString(2, newUser.getFirst());
            statement.setString(3, newUser.getLast());
            statement.setString(4, newUser.getUser());
            statement.setString(5, newUser.getMonth());
            statement.setInt(6, newUser.getYear());
                
    } catch (SQLException ex){
        Logger.getLogger(DAOHappyDayLog.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}

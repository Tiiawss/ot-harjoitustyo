/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar.users;

/**
 *
 * @author nytiia
 */
import java.util.List;
import Calendar.domain.Todo;

public interface TodoDao {

    Todo create(Todo todo) throws Exception;

    List<Todo> getAll();

    void setDone(int id) throws Exception;

}
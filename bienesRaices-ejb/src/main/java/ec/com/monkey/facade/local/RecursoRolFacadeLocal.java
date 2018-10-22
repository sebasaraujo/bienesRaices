/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkey.facade.local;

import ec.com.monkey.modelo.RecursoRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisp.araujo
 */
@Local
public interface RecursoRolFacadeLocal {

    void create(RecursoRol recursoRol);

    void edit(RecursoRol recursoRol);

    void remove(RecursoRol recursoRol);

    RecursoRol find(Object id);

    List<RecursoRol> findAll();

    List<RecursoRol> findRange(int[] range);

    int count();
    
}

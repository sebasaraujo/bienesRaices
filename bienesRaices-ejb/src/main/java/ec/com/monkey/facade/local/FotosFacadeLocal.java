/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkey.facade.local;

import ec.com.monkey.modelo.Fotos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisp.araujo
 */
@Local
public interface FotosFacadeLocal {

    void create(Fotos fotos);

    void edit(Fotos fotos);

    void remove(Fotos fotos);

    Fotos find(Object id);

    List<Fotos> findAll();

    List<Fotos> findRange(int[] range);

    int count();
    
}

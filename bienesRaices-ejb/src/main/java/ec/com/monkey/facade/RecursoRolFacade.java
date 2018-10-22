/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkey.facade;

import ec.com.monkey.facade.local.RecursoRolFacadeLocal;
import ec.com.monkey.modelo.RecursoRol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author luisp.araujo
 */
@Stateless
public class RecursoRolFacade extends AbstractFacade<RecursoRol> implements RecursoRolFacadeLocal {

    @PersistenceContext(unitName = "bienesRaicesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecursoRolFacade() {
        super(RecursoRol.class);
    }
    
}

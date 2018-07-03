package org.ecc.pmp.model;
// Generated Jan 3, 2018 1:14:58 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Emp.
 * @see org.ecc.pmp.model.Emp
 * @author Hibernate Tools
 */
//@Stateless
@Path("/message")
@RequestScoped
public class EmpHome {

	private static final Log log = LogFactory.getLog(EmpHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Emp transientInstance) {
		log.debug("persisting Emp instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Emp persistentInstance) {
		log.debug("removing Emp instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Emp merge(Emp detachedInstance) {
		log.debug("merging Emp instance");
		try {
			Emp result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
	@GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
	public Emp findById(@PathParam("id") long id) {
		log.debug("getting Emp instance with id: " + id);
		try {
			Emp instance = entityManager.find(Emp.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

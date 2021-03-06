package org.ecc.pmp.model;
// Generated Nov 12, 2017 10:26:32 PM by Hibernate Tools 5.2.5.Final

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
 * Home object for domain model class Dept.
 * @see org.ecc.pmp.model.Dept
 * @author Hibernate Tools
 */
//@Stateless
@Path("/message")
@RequestScoped
public class DeptHome {

	private static final Log log = LogFactory.getLog(DeptHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Dept transientInstance) {
		log.debug("persisting Dept instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Dept persistentInstance) {
		log.debug("removing Dept instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Dept merge(Dept detachedInstance) {
		log.debug("merging Dept instance");
		try {
			Dept result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
	@GET
    @Path("/{deptid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Dept findById(@PathParam("deptid") int id) {
		log.debug("getting Dept instance with id: " + id);
		try {
			Dept instance = entityManager.find(Dept.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

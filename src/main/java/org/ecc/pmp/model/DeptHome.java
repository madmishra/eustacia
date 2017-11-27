package org.ecc.pmp.model;
// Generated Nov 26, 2017 4:50:49 PM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Dept.
 * @see org.ecc.pmp.model.Dept
 * @author Hibernate Tools
 */
@Stateless
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

	public Dept findById(long id) {
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

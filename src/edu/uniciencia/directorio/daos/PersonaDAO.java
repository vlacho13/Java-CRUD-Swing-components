package edu.uniciencia.directorio.daos;

import edu.uniciencia.directorio.datos.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonaDAO {

    private EntityManager getEm() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DirectorioPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }

    public List<Persona> getListaPersonas() {
        List<Persona> resultado = new ArrayList<>();
        EntityManager em = getEm();
        resultado = em.createQuery("SELECT o FROM Persona o").getResultList();
        return resultado;
    }

    public Persona buscarPersona(String numero) {

        EntityManager em = getEm();
        Persona p = em.find(Persona.class, numero);
        return p;
        //        BUSQUEDA POR OTRO CAMPO
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DirectorioPU");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        try {
//            StringBuilder sql = new StringBuilder();
//            sql.append(" select o from Persona o where o.id=:num ");
//            List<Persona> lista = em.createQuery(sql.toString()).setParameter("num", numero).getResultList();
//            Persona p = lista.get(0);
//            return p;
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
        //       return null;
    }

    public void agregarPersona(Persona p) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void eliminarPersona(String numero) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            Persona p = em.find(Persona.class, numero);
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void actualizarPersona(Persona p) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}


package edu.uniciencia.directorio.daos;

import edu.uniciencia.directorio.datos.Municipio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MunicipioDAO {
    
    private EntityManager getEm() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DirectorioPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }    

    public List<Municipio> getListaMunicipios() {
        List<Municipio> resultado = new ArrayList<>();
        EntityManager em = getEm();
        resultado = em.createQuery("SELECT o FROM Municipio o").getResultList();
        return resultado;
    }

    public Municipio buscarMunicipio(String numero) {
        EntityManager em = getEm();
        Municipio p = em.find(Municipio.class, numero);
        return p;
    }

    public void agregarMunicipio(Municipio p) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void eliminarMunicipio(String numero) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            Municipio p = em.find(Municipio.class, numero);
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void actualizarMunicipio(Municipio p) {
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

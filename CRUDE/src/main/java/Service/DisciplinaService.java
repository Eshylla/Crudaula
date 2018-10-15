package Service;

import java.util.Collection;
import Classes.Disciplina;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import Classes.DisciplinaDAO;
import Util.TransacionalCdi;

@ApplicationScoped
public class DisciplinaService implements Serializable, Service<Disciplina> {

	@Inject
	private DisciplinaDAO disciplinaDAO;

	@Override
	@TransacionalCdi
	public void save(Disciplina disciplina) {
		disciplinaDAO.save(disciplina);
	}

	@Override
	@TransacionalCdi
	public void update(Disciplina disciplina) {
		disciplinaDAO.update(disciplina);
	}

	@Override
	@TransacionalCdi
	public void remove(Disciplina disciplina) {
		disciplinaDAO.remove(disciplina);
	}

	@Override
	public Disciplina getByID(long disciplinaId) {
		return disciplinaDAO.getByID(disciplinaId);
	}

	@Override
	public List<Disciplina> getAll() {
		return disciplinaDAO.getAll();
	}

}

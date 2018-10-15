package Service;

import java.util.Collection;
import Classes.Aluno;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import Classes.AlunoDAO;
import Util.TransacionalCdi;

@ApplicationScoped
public class AlunoService implements Serializable, Service<Aluno> {

	@Inject
	private AlunoDAO alunoDAO;

	@Override
	@TransacionalCdi
	public void save(Aluno aluno) {
		alunoDAO.save(aluno);
	}

	@Override
	@TransacionalCdi
	public void update(Aluno aluno) {
		alunoDAO.update(aluno);
	}

	@Override
	@TransacionalCdi
	public void remove(Aluno aluno) {
		alunoDAO.remove(aluno);
	}

	@Override
	public Aluno getByID(long alunoId) {
		return alunoDAO.getByID(alunoId);
	}

	@Override
	public List<Aluno> getAll() {
		return alunoDAO.getAll();
	}

}

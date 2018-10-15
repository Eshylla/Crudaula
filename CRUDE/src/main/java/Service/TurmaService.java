package Service;

import java.util.Collection;
import Classes.Turma;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

	
    import Classes.TurmaDAO;
import Util.TransacionalCdi;

	@ApplicationScoped
	public class TurmaService implements Serializable, Service<Turma> {

		@Inject
		private TurmaDAO turmaDAO;

		@Override
		@TransacionalCdi
		public void save(Turma turma) {
			turmaDAO.save(turma);
		}

		@Override
		@TransacionalCdi
		public void update(Turma turma) {
			turmaDAO.update(turma);
		}

		@Override
		@TransacionalCdi
		public void remove(Turma turma) {
			turmaDAO.remove(turma);
		}


		@Override
		public Turma getByID(long turmaId) {
			return turmaDAO.getByID(turmaId);
		}

		
		@Override
		public List<Turma> getAll() {
			return turmaDAO.getAll();
		}

	}


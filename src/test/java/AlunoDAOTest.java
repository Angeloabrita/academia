/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.Before;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

import com.angeloabrita.academia.model.Aluno;
import com.angeloabrita.academia.dao.AlunoDAO;
import com.angeloabrita.academia.until.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author angel
 */
public class AlunoDAOTest {

    private SessionFactory sessionFactory;
    private AlunoDAO alunoDAO;

     @Before
    public void setUp() {
        // Configura o Hibernate para usar o banco de dados H2
        sessionFactory = HibernateUtil.getSessionFactory();
        alunoDAO = new AlunoDAO();
    }

     @After
    public void tearDown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @Test
    public void testSalvarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("João da Silva");
        aluno.setFoneCelular("123456789");
        aluno.setEmail("joao.silva@example.com");
        aluno.setDataNascimento(LocalDate.of(1990, 1, 1));
        aluno.setCep("12345-678");
        aluno.setLogradouro("Rua Teste");
        aluno.setPeso(70.0);
        aluno.setAltura(1.75);
        aluno.setFrequenciaSemanal(3);

        alunoDAO.salvar(aluno);
       
        Aluno alunoSalvo = alunoDAO.buscarPorNome(aluno.getNome());
        
    //verifica se o aluno foi salvo e se consta no banco    
    assertNotNull("O aluno salvo não deve ser nulo. Verifique se o aluno foi realmente salvo no banco de dados.", alunoSalvo);
    assertEquals("O nome do aluno salvo deve ser igual ao nome do aluno criado.", aluno.getNome(), alunoSalvo.getNome());
}
    
    @Test
    public void testListarTodos() {
       
        // Usar o método listarTodos para recuperar os registros
        List<Aluno> alunos = alunoDAO.listarTodos();

        // Verificar se a lista retornada contém os registros esperados
        assertNotNull("A lista de alunos não deve ser nula.", alunos);
        assertTrue("A lista de alunos deve conter pelo menos dois alunos.", alunos.size() >= 2);

     
    }
}
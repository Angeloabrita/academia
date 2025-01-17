/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


/**
 *
 * @author angel
 */
import com.angeloabrita.academia.until.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.angeloabrita.academia.dao.AlunoDAO;
import com.angeloabrita.academia.model.Aluno;
import com.angeloabrita.academia.services.AlunoService;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AlunoServiceTest {

    @Mock
    private AlunoDAO alunoDAO;

    @InjectMocks
    private AlunoService alunoService;

    @Test
    public void testSalvarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Gael Silva");
        aluno.setFoneCelular("11999998888");
        aluno.setEmail("joao.silva@email.com");
        aluno.setDataNascimento(LocalDate.of(1990, 1, 1));
        aluno.setCep("01001000");
        aluno.setLogradouro("Rua Teste, 123");
        aluno.setPeso(70.0);
        aluno.setAltura(1.75);
        aluno.setFrequenciaSemanal(3);

        // Configure o mock para não fazer nada quando salvar for chamado
        //doNothing().when(alunoDAO).salvar(any(Aluno.class)); 

        // Chamando o método salvar do objeto alunoService
       // alunoService.salvar(aluno);
       
        // Verifique se o método salvar do DAO foi chamado exatamente uma vez
       // verify(alunoDAO, times(1)).salvar(aluno);
    }
    
     @Test
    public void testListarTodos() {
        
        // Criar uma lista de alunos mockada
        List<Aluno> alunosMock = new ArrayList<>();
        alunosMock.add(new Aluno()); // Adicione alunos mockados à lista

        // Configurar o mock para retornar a lista mockada
        when(alunoDAO.listarTodos()).thenReturn(alunosMock);

        // Chamar o método listarTodos() do serviço
        List<Aluno> alunos = alunoService.listarTodos();

        // Verificar se o método listarTodos() do DAO foi chamado
        verify(alunoDAO, times(1)).listarTodos();

        /// Verificar se a lista retornada não é nula e contém alunos
        assertTrue(alunoService.isListaDeAlunos(alunos));
    }

   
}
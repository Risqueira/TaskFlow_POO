
package javaapplication10;

/**
 *
 * @author aluno.saolucas
 */
public class JavaApplication10 {
private TarefaDAO dao = new TarefaDAO();
    
    public void salvar(Tarefa t)throws SQLException{
        dao.salvar(t);
    }
    public Tarefa buscar(int id)throws SQLException{
        return dao.buscarPorId(id);
    }
    public List<Tarefa> listar()throws SQLException{
        return dao.listar();
    }
    public void atualizar(Tarefa t)throws SQLException{
        dao.atualizar(t);
    }
    public void remover(int id)throws SQLException{
        dao.remover(id);
        fe
                fesfs
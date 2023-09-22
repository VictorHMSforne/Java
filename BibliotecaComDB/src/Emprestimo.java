import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Emprestimo {
    private Timestamp data_emprestimo;
    private Timestamp data_devolucao;

    public Emprestimo(Timestamp data_emprestimo, Timestamp data_devolucao) {
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public Timestamp getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Timestamp data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Timestamp getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Timestamp data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}

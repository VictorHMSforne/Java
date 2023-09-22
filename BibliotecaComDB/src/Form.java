import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    String TxtNome;
    String TxtData;
    String TxtCpf;
    String TxtEndereco;
    String TxtFone;
    String CbxSexo;

    private JPanel MainPanel;
    private JLabel lblPsqCliente;
    private JLabel lblPNome;
    private JTextField txtPNome;
    private JButton btnPesquisar;
    private JTable tblCliente;
    private JLabel lblDCliente;
    private JLabel lbLID;
    private JLabel lblDNome;
    private JLabel lblNascimento;
    private JLabel lblSexo;
    private JLabel lblCpf;
    private JLabel lblEndereco;
    private JLabel lblFone;
    private JComboBox cbxSexo;
    private JTextField txtID;
    private JTextField txtDNome;
    private JTextField txtDataNasci;
    private JTextField txtCPF;
    private JTextField txtEndereco;
    private JTextField txtFone;
    private JButton btnExcluir;
    private JButton btnAlterar;
    private JButton btnNovo;
    private JButton btnCadastrar;
    private JButton btnSair;




    public Form(){
        setContentPane(MainPanel);
       setTitle("CADASTRO DE CLIENTES");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1000,2000);
       setLocationRelativeTo(null);
       setVisible(true);

       cbxSexo.addItem("");
       cbxSexo.addItem("Masculino");
       cbxSexo.addItem("Feminino");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String Txtid = txtID.getText();
                //String sexoSelecionado = (String) cbxSexo.getSelectedItem(); caso queira add em uma Var

               TxtNome = txtDNome.getText();
               System.out.println(TxtNome);
               TxtData = txtDataNasci.getText();
               TxtCpf = txtCPF.getText();
               TxtEndereco = txtEndereco.getText();
               TxtFone = txtFone.getText();
               CbxSexo = (String) cbxSexo.getSelectedItem();

                if(/*Txtid.isEmpty() &&*/CbxSexo.isEmpty() && TxtNome.isEmpty() && TxtData.isEmpty() && TxtCpf.isEmpty() && TxtEndereco.isEmpty() && TxtFone.isEmpty()){
                    JOptionPane.showMessageDialog(Form.this,"Preencha os Campos!!!");
                }
                else{
                    JOptionPane.showMessageDialog(Form.this,"Cliente Cadastrado!!!");
                }

            }
        });
    }

    public static void main(String[] args) {
        new Form();
    }
}

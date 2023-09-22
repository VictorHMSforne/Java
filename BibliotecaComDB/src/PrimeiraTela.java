import javax.swing.*;
import java.awt.*;

public class PrimeiraTela extends JFrame {
    JLabel lblNome = new JLabel("Nome");
    JLabel lblEndereco = new JLabel("Endereço");
    JLabel lblSexo = new JLabel("Sexo");
    JTextField txtNome =new JTextField(null,20);
    JTextField txtEndereco = new JTextField(null, 30);
    JButton btnGravar = new JButton("Gravar");
    JButton btnFechar = new JButton("Fechar");

    String [] sexos = {"Masculino", "Feminino"};
    JComboBox cbxSexo = new JComboBox(sexos);
    public PrimeiraTela(){
        /*setSize(100,100); //largura e altura
        setVisible(true);*/
        setLayout(new FlowLayout()); // posiciona os componentes um após o outro
        //OS COMPONENTES SÃO APRESENTADOS NA TELA NESSE MOMENTO
        setLayout(new GridLayout(4,2));
        getContentPane().add(lblNome);
        getContentPane().add(lblEndereco);
        getContentPane().add(txtNome);
        getContentPane().add(txtEndereco);
        getContentPane().add(lblSexo);
        getContentPane().add(cbxSexo);
        getContentPane().add(btnGravar); // Adicionei o primeiro botão
        getContentPane().add(btnFechar);
        setVisible(true);
        pack();

    }


}

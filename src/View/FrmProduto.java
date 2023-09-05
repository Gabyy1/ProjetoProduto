package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import DAO.ProdutoDAO;


public class FrmProduto {

	public static void main(String[] args) {

		ProdutoDAO pDao = new ProdutoDAO();

		JFrame f = new JFrame();
		f.setTitle("Cadastro de Produtos");
		f.setSize(600, 500);
		f.setLocation(500, 150);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));

		JLabel l = new JLabel("Código:");
		p.add(l);

		JTextField t = new JTextField(9);
		p.add(t);

		JLabel l1 = new JLabel("Nome:");
		p.add(l1);


		JTextField t1 = new JTextField(15);
		p.add(t1);

		JLabel l2 = new JLabel("Data de validade:");
		p.add(l2);

		JTextField t2 = new JTextField(9);
		p.add(t2);

		JButton b = new JButton("CADASTRAR");
		b.setLocation(200,500);
		b.setSize(100,100);

		JButton b1 = new JButton("EXCLUIR");
		b1.setLocation(200,500);
		b1.setSize(100,100);

		b.addActionListener(new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {

				String codigo = t.getText();
				String nome = t1.getText();
				String data = t2.getText();
				System.out.println(codigo + nome + data);
				try {
					pDao.cadastrarProduto(codigo, nome, data);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});



		p.add(b, b1);
		f.add(p);
		f.setVisible(true);



}
}

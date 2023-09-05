package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ProdutoDAO {

	public void cadastrarProduto(String codigo, String nome, String tipo) throws SQLException, ClassNotFoundException {

		GenericDAO c = new GenericDAO();
		Connection conn = c.getConnection();
		String sql = "insert into Produto values (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		try {
			System.out.println(codigo + nome + tipo);

				ps = conn.prepareStatement(sql);
				System.out.println(codigo + nome + tipo);
				ps.setString(1, codigo);
				ps.setString(2, nome);
				ps.setString(3, tipo);
				System.out.println("bbbbbbbbbbb");

				ps.execute();
				ps.close();

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ProdutoDAO" + e);
		}
	}

}

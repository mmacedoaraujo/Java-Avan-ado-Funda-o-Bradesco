package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BancoAcesso {

	public static void main(String[] args) {

		String sql = "Select CODIGO, NOME, SEXO from PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Connection con = DriverManager.getConnection(url, "system", "2058");
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

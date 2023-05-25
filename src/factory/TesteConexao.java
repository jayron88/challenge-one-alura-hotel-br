package factory;
import java.sql.Connection;

public class TesteConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionFactory con = new ConnectionFactory();
		Connection conn = con.recuperarConexao();
		
		System.out.println("FEchada conexão");
	}

}

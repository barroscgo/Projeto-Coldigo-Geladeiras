package br.com.coldigogeladeiras.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.coldigogeladeiras.jdbcinterface.ProdutoDAO;
import br.com.coldigogeladeiras.modelo.Produto;

public class JDBCProdutoDAO implements ProdutoDAO{
	
	private Connection conexao;
	
	public JDBCProdutoDAO(Connection conexao) {
		this.conexao = conexao;
	}
	public boolean inserir(Produto produto) {
		
		String comando = "INSERT INTO produtos"
							+"(id, categoria, modelo, capacidade, valor, marcas_id)"
							+"VALUES (?,?,?,?,?,?)";
		PreparedStatement p;
		
		try {
			//prepara o comando para execução no BD em que nos conectamos
			p = this.conexao.prepareStatement(comando);
			
			//Substitui no comando os "?" pelos valores do produto
			p.setInt(1, produto.getId());
			p.setString(2, produto.getcategoria());
			p.setString(3, produto.getmodelo());
			p.setInt(4, produto.getcapacidade());
			p.setFloat(5, produto.getvalor());
			p.setInt(6, produto.getmarcaId());
			
			//Executa o comando no BD
			p.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}

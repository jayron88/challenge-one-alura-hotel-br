package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.Reserva;

public class ReservaController {
	
	private ReservaDAO reservaDAO;
	
	public ReservaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}
	
	public void salvar(Reserva reserva) {
		this.reservaDAO.salvar(reserva); 
	}
	
	public List<Reserva> listar() {
		return this.reservaDAO.listar();
	}
	
	public List<Reserva> buscarId(Integer id) {
		return this.reservaDAO.buscarId(id);
	}
	
	public void editar(Integer id, Date dataE, Date dataS) {
		this.reservaDAO.editar(id, dataE, dataS);
	}
	
	public void deletar(Integer id) {
		this.reservaDAO.deletar(id);
	}

}
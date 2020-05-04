package Conexion;

import java.util.List;

import Dao.GenericDao;
import Dao.UsuarioDao;
import Dto.Usuario;

public class Controlador {

	public Controlador() {
		// TODO Auto-generated constructor stub
	}

	public void registrarUsuario(String usuario, String email, String contraseña, String nombre) {
		Usuario usu = new Usuario(usuario, email, contraseña, nombre);
		GenericDao<Usuario> usDao = new UsuarioDao();
		usDao.insert(usu);
	}

	public Usuario buscarUsuario(String nombre) {

		GenericDao<Usuario> us = new UsuarioDao();
		Usuario u = us.find(nombre);
		return u;
	}
	
	public boolean login(String usuario,String password){
    	System.out.println(usuario + "hpta" + password);
		GenericDao<Usuario> usDao= new UsuarioDao();
		System.out.println("que mierda");
		List<Usuario> us=usDao.list();
		for( Usuario usu:us) {
			if(usu.getUsuario().equals(usuario)&&usu.getClave().equals(password)) {
			
				return true;
			}		
			
		}
		return false;
			
		
	}

}

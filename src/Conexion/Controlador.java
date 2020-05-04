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
		System.out.println("busco el usuario");
		Usuario u = us.find(nombre);
		System.out.println("lo encontre");
		return u;
	}
	
	public boolean login(String usuario,String password){
    	System.out.println(usuario + "entonces" + password);
		GenericDao<Usuario> usDao= new UsuarioDao();
		System.out.println("ome");
		List<Usuario> us=usDao.list();
		for( Usuario usu:us) {
			if(usu.getUsuario().equals(usuario)&&usu.getClave().equals(password)) {
			
				return true;
			}		
			
		}
		return false;
			
		
	}
	
     public void eliminarUsuario(String usuario) {
		
		GenericDao<Usuario> usDao= new UsuarioDao();
		Usuario u = usDao.find(usuario);
		System.out.println(u);
		usDao.delete(u);
		
	  }
	
	  public void ActualizarUsuario(String usuario) {
		Usuario u = new Usuario(usuario);
		GenericDao<Usuario> usDao= new UsuarioDao();
		usDao.update(u);
		
	   }
	
    
    public List<Usuario> ListarUsuario() {
		GenericDao<Usuario> usDao= new UsuarioDao();
		List<Usuario> u =  usDao.list();
		return u;
		
	}
	
	
	
	
	
	
	

}

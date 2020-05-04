package Dao;

import Conexion.Conexion;
import Dto.Usuario;

public class UsuarioDao 
extends Conexion<Usuario> 
implements GenericDao<Usuario> {

	public UsuarioDao() {
		super(Usuario.class);
	}

}

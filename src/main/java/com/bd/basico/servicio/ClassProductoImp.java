package com.bd.basico.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.bd.basico.modelo.TblProducto;
import com.bd.basico.repositorio.IProductoRepositorio;

public class ClassProductoImp implements IProductoServicio{

	@Autowired
	private IProductoRepositorio iproductorepository;

	@Override
	public List<TblProducto> ListadoProductos() {
		
		// DEVUELVE LISTADO
		return (List<TblProducto>) iproductorepository.findAll();
	}

	@Override
	public void RegistrarProducto(TblProducto producto) {
		
		// REGISTRA LOS DATOS
		iproductorepository.save(producto);		
	}

	@Override
	public TblProducto BuscarPorId(Integer id) {
		
		// BUSCA PRODUCTO POR CODIGO
		return iproductorepository.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(Integer id) {
		
		// ELIMINA PRODUCTO POR CODIGO
		iproductorepository.deleteById(id);
	}
	
}

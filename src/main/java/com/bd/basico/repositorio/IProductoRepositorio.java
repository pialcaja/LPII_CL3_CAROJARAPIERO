package com.bd.basico.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.bd.basico.modelo.*;

public interface IProductoRepositorio extends CrudRepository<TblProducto,Integer>{

}

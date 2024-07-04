package com.bd.basico.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bd.basico.modelo.TblProducto;
import com.bd.basico.servicio.IProductoServicio;

@Controller
@RequestMapping("/vistas")
public class ProductoController {

	//inyeccion de dependencia...

			@Autowired
			private IProductoServicio iproductoservicio;

			//creamos el metodo listado..

			@GetMapping("ListadoProductos")

			public String ListadoProductos(Model modelo) {

				//recuperamos el listado de autos..

				List<TblProducto> listado=iproductoservicio.ListadoProductos();

				for(TblProducto lis:listado) {

			System.out.println("codigo "+lis.getIdproductocl3()+" "+" nombre "+lis.getNombrecl3());

				}

				//enviamos la data hacia la vista..

				modelo.addAttribute("listado",listado);

				//retornamos

				return "/Vistas/ListadoProductos";

				

			}  //fin del metodo listado auto...

			

			//creamos los respectivos para metodos para registrar...

			@GetMapping("/RegistrarProducto")

			public String RegistrarProducto(Model modelo) {

				//realizamos la respectiva instancia...

				TblProducto producto = new TblProducto();

				//enviamos a la vista...

				modelo.addAttribute("regproducto",producto);

				//retornamos

				return "/Vistas/RegistrarProducto";

				

			}  //fin del metodo registrar.

			

			//realizamos el mapeo con postmapping

			@PostMapping("/GuardarCliente")

			public String GuardarAuto(@ModelAttribute TblProducto  producto,Model modelo) {

				iproductoservicio.RegistrarProducto(producto);

				System.out.println("Producto registrado en la bd");

				//retornamos al listado...

				return "redirect:/Vistas/ListadoProductos";	

			}  //fin del metodo string...

			

			//*****************crearmos el metodo editar...

			@GetMapping("/editar/{id}")

			public String Editar(@PathVariable("id") Integer idproducto,Model modelo) {

				TblProducto producto = iproductoservicio.BuscarPorId(idproducto);

				//enviamos hacia la vista...

				modelo.addAttribute("regproducto",producto);

				//retornamos el frmcrearcliente...

				return "/Vistas/RegistrarProducto";	

			}  //fin del metodo editar...
			
			
			public String eliminar(@PathVariable("id") Integer idproducto,Model modelo) {

				//aplicamos inyeccion de dependencia...

				iproductoservicio.Eliminar(idproducto);

				//actulizar el listado

				List<TblProducto> listado = iproductoservicio.ListadoProductos();

				//enviamos a la vista

				modelo.addAttribute("listado",listado);

				//redireccionamos

				return "redirect:/Vistas/ListadoProductos";		

			}   //fin del metodo eliminar...
}

package com.emanoel.aprendendospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emanoel.aprendendospring.domain.Categoria;
import com.emanoel.aprendendospring.domain.Pedido;
import com.emanoel.aprendendospring.services.CategoriaService;
import com.emanoel.aprendendospring.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
	
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
}

}

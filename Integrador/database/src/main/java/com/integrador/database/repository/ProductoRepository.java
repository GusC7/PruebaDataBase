package com.integrador.database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.integrador.database.modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {

}

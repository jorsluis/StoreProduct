package com.example.StoreProduct.persistence.mapper;

import com.example.StoreProduct.domain.Product;
import com.example.StoreProduct.persistence.entity.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-06T19:38:18-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public Product toProduct(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        Product product = new Product();

        product.setIdPro( producto.getIdProducto() );
        product.setCateg( producto.getCategoria() );
        product.setNombre( producto.getNombre() );
        product.setIdCategoria( producto.getIdCategoria() );
        product.setCodigoBarras( producto.getCodigoBarras() );
        product.setPrecioVenta( producto.getPrecioVenta() );
        product.setCantidadStock( producto.getCantidadStock() );
        product.setEstado( producto.getEstado() );

        return product;
    }

    @Override
    public List<Product> toProducts(List<Producto> producto) {
        if ( producto == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( producto.size() );
        for ( Producto producto1 : producto ) {
            list.add( toProduct( producto1 ) );
        }

        return list;
    }

    @Override
    public Producto toProducto(Product product) {
        if ( product == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setIdProducto( product.getIdPro() );
        producto.setCategoria( product.getCateg() );
        producto.setNombre( product.getNombre() );
        producto.setIdCategoria( product.getIdCategoria() );
        producto.setCodigoBarras( product.getCodigoBarras() );
        producto.setPrecioVenta( product.getPrecioVenta() );
        producto.setCantidadStock( product.getCantidadStock() );
        producto.setEstado( product.getEstado() );

        return producto;
    }
}

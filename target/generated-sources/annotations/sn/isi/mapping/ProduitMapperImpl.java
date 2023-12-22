package sn.isi.mapping;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import sn.isi.dto.Produit;
import sn.isi.entities.ProduitEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-22T02:40:08+0000",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ProduitMapperImpl implements ProduitMapper {

    @Override
    public Produit toProduit(ProduitEntity produitEntity) {
        if ( produitEntity == null ) {
            return null;
        }

        Produit produit = new Produit();

        produit.setId( produitEntity.getId() );
        produit.setNom( produitEntity.getNom() );
        produit.setQtStock( produitEntity.getQtStock() );

        return produit;
    }

    @Override
    public ProduitEntity fromProduit(Produit produit) {
        if ( produit == null ) {
            return null;
        }

        ProduitEntity produitEntity = new ProduitEntity();

        produitEntity.setId( produit.getId() );
        produitEntity.setNom( produit.getNom() );
        produitEntity.setQtStock( produit.getQtStock() );

        return produitEntity;
    }
}

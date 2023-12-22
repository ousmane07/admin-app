package sn.isi.mapping;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import sn.isi.dto.AppRoles;
import sn.isi.entities.AppRolesEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-22T02:40:08+0000",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AppRolesMapperImpl implements AppRolesMapper {

    @Override
    public AppRoles toAppRoles(AppRolesEntity appRolesEntity) {
        if ( appRolesEntity == null ) {
            return null;
        }

        AppRoles appRoles = new AppRoles();

        appRoles.setId( appRolesEntity.getId() );
        appRoles.setNom( appRolesEntity.getNom() );

        return appRoles;
    }

    @Override
    public AppRolesEntity fromAppRoles(AppRoles appRoles) {
        if ( appRoles == null ) {
            return null;
        }

        AppRolesEntity appRolesEntity = new AppRolesEntity();

        appRolesEntity.setId( appRoles.getId() );
        appRolesEntity.setNom( appRoles.getNom() );

        return appRolesEntity;
    }
}

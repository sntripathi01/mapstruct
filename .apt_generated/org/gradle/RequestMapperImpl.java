package org.gradle;

import javax.annotation.Generated;
import org.gradle.xml.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-01-13T14:47:42+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 3.11.1.v20150902-1521, environment: Java 1.8.0_31 (Oracle Corporation)"
)
public class RequestMapperImpl implements RequestMapper {

    @Override
    public org.gradle.type.User map(User user) {
        if ( user == null ) {
            return null;
        }

        org.gradle.type.User user_ = new org.gradle.type.User();

        user_.setName( user.getName() );

        return user_;
    }
}

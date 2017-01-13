package org.gradle;

import org.gradle.type.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RequestMapper {

    RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);

    User map(org.gradle.xml.User user);

}

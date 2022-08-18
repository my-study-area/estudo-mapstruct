package br.com.estudo.estudo_mapstruct.mappers;

import br.com.estudo.estudo_mapstruct.dtos.Mutuario1Dto;
import br.com.estudo.estudo_mapstruct.dtos.Mutuario1StringDto;
import br.com.estudo.estudo_mapstruct.entidades.Mutuario1;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface Mutuario1Mapper {
    Mutuario1Mapper INSTANCE = Mappers.getMapper(Mutuario1Mapper.class);

    Mutuario1Dto toDto(Mutuario1 mutuario1);

    Mutuario1StringDto toDtoString(Mutuario1 mutuario1);
}

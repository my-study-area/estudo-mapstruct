package br.com.estudo.estudo_mapstruct.mappers;

import br.com.estudo.estudo_mapstruct.dtos.Contrato1Dto;
import br.com.estudo.estudo_mapstruct.dtos.Contrato1DtoString;
import br.com.estudo.estudo_mapstruct.dtos.Mutuario1Dto;
import br.com.estudo.estudo_mapstruct.entidades.Contrato1;
import br.com.estudo.estudo_mapstruct.entidades.Mutuario1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface Contrato1Mapper {
    Contrato1Mapper INSTANCE = Mappers.getMapper(Contrato1Mapper.class);

    @Mapping(target = "mutuarioId", source = "contrato1.mutuario1.id")
    Contrato1Dto toDto(Contrato1 contrato1);

    @Mapping(target = "mutuarioId", source = "contrato1.mutuario1.id")
    Contrato1DtoString toDtoString(Contrato1 contrato1);
}

package br.com.estudo.estudo_mapstruct;

import br.com.estudo.estudo_mapstruct.entidades.*;
import br.com.estudo.estudo_mapstruct.mappers.Contrato1Mapper;
import br.com.estudo.estudo_mapstruct.mappers.Mutuario1Mapper;
import br.com.estudo.estudo_mapstruct.repository.Contrato2Respository;
import br.com.estudo.estudo_mapstruct.repository.ContratoRespository;
import br.com.estudo.estudo_mapstruct.repository.Mutuario2Repository;
import br.com.estudo.estudo_mapstruct.repository.MutuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class EstudoMapstructApplication implements CommandLineRunner {

    private final MutuarioRepository mutuarioRepository;

    private final ContratoRespository contratoRespository;

    private final Mutuario1Mapper mutuario1Mapper;

    private final Contrato1Mapper contrato1Mapper;

    private final Mutuario2Repository mutuario2Repository;

    private final Contrato2Respository contrato2Respository;


    public EstudoMapstructApplication(MutuarioRepository mutuarioRepository, ContratoRespository contratoRespository, Mutuario1Mapper mutuario1Mapper, Contrato1Mapper contrato1Mapper, Mutuario2Repository mutuario2Repository, Contrato2Respository contrato2Respository) {
        this.mutuarioRepository = mutuarioRepository;
        this.contratoRespository = contratoRespository;
        this.mutuario1Mapper = mutuario1Mapper;
        this.contrato1Mapper = contrato1Mapper;
        this.mutuario2Repository = mutuario2Repository;
        this.contrato2Respository = contrato2Respository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EstudoMapstructApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ola Mundo!");

        Mutuario1 mutuario1 = new Mutuario1("Joao", "999.999.999-99");
        mutuarioRepository.save(mutuario1);
        System.out.println("Mutuario salvo" + mutuario1);

        Contrato1 contrato1 = new Contrato1(BigDecimal.TEN, LocalDate.now(), mutuario1);
        contratoRespository.save(contrato1);
        System.out.println(contrato1);

        System.out.println("");
        System.out.println(mutuario1Mapper.toDto(mutuario1));
        System.out.println(mutuario1Mapper.toDtoString(mutuario1));
        System.out.println(contrato1Mapper.toDto(contrato1));
        System.out.println(contrato1Mapper.toDtoString(contrato1));

        Mutuario2Id mutuario2Id = new Mutuario2Id("001", "002", "003", "111.111.111-11");
        Mutuario2 mutuario2 = new Mutuario2(mutuario2Id, "Maria", "rua 1");
        mutuario2Repository.save(mutuario2);
        System.out.println("");
        System.out.println(mutuario2);

        Contrato2Id contrato2Id = new Contrato2Id("001", "002", "003", 1111L);
        Contrato2 contrato2 = new Contrato2(contrato2Id, BigDecimal.TEN, "111.111.111-11", LocalDate.now(), mutuario2);
        contrato2Respository.save(contrato2);
        System.out.println("");
        System.out.println(contrato2);
    }
}

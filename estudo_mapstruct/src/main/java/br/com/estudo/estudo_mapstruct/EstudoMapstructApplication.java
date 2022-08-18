package br.com.estudo.estudo_mapstruct;

import br.com.estudo.estudo_mapstruct.entidades.Contrato1;
import br.com.estudo.estudo_mapstruct.entidades.Mutuario1;
import br.com.estudo.estudo_mapstruct.repository.ContratoRespository;
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

    public EstudoMapstructApplication(MutuarioRepository mutuarioRepository, ContratoRespository contratoRespository) {
        this.mutuarioRepository = mutuarioRepository;
        this.contratoRespository = contratoRespository;
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

    }
}

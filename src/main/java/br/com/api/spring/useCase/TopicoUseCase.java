package br.com.api.spring.useCase;

import br.com.api.spring.dto.TopicoDto;
import br.com.api.spring.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicoUseCase {

    @Autowired
    TopicoRepository repository;

    public List<TopicoDto> listarTopicos(String nomeCurso) {
        if(nomeCurso == null){
            return TopicoDto.converter(repository.findAll());
        }
        else{
            return TopicoDto.converter(repository.findByCurso_Nome(nomeCurso));
        }

    }
}

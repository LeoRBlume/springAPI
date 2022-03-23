package br.com.api.spring.controller;

import br.com.api.spring.dto.TopicoDto;
import br.com.api.spring.useCase.TopicoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TopicosController {

    @Autowired
    TopicoUseCase useCase;

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> listaTopicos(String nomeCurso) {
        return useCase.listarTopicos(nomeCurso);
    }

}

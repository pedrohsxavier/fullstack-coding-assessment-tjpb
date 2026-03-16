package com.backend.ms.service;

import com.backend.ms.model.Solicitacao;
import com.backend.ms.repository.SolicitacaoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SolicitacaoService {

    private final SolicitacaoRepository repository;

    public SolicitacaoService(SolicitacaoRepository repository) {
        this.repository = repository;
    }

    public List<Solicitacao> listarTodas() {
        return repository.findAll();
    }

    public Solicitacao criar(Solicitacao solicitacao) {
        solicitacao.setDataCriacao(LocalDateTime.now());
        solicitacao.setStatus("ABERTA");
        return repository.save(solicitacao);
    }
}
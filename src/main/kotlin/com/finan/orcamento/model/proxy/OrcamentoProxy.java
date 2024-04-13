package com.finan.orcamento.model.proxy;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.UsuarioModel;
import com.finan.orcamento.model.enums.IcmsEstados;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class OrcamentoProxy extends OrcamentoModel {
    private final Long id;
    private IcmsEstados icmsEstados;
    private BigDecimal valorOrcamento;
    private BigDecimal valorICMS;
    private UsuarioModel usuario;
    private int qtdItens;
    private BigDecimal descontoOrcamento;
    private OrcamentoModel orcamentoModel;

    public OrcamentoProxy(Long id, IcmsEstados icmsEstados, BigDecimal valorOrcamento, BigDecimal valorICMS, UsuarioModel usuario, int qtdItens, BigDecimal descontoOrcamento, OrcamentoModel orcamentoModel){
        this.id = id;
        this.icmsEstados = icmsEstados;
        this.valorOrcamento = valorOrcamento;
        this.valorICMS = valorICMS;
        this.usuario = usuario;
        this.qtdItens = qtdItens;
        this.descontoOrcamento = descontoOrcamento;
        this.orcamentoModel = orcamentoModel;
    }
    @Override
    public BigDecimal getDescontoOrcamento(){
        if(this.descontoOrcamento == null){
            this.descontoOrcamento = orcamentoModel.getDescontoOrcamento();

        }
        return this.descontoOrcamento;
    }
    //construtor

}

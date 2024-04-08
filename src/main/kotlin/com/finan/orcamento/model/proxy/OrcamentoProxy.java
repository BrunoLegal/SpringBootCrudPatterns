package com.finan.orcamento.model.proxy;

import com.finan.orcamento.model.OrcamentoModel;

import java.math.BigDecimal;

public class OrcamentoProxy extends OrcamentoModel {
    private BigDecimal descontoOrcamento;
    private OrcamentoModel orcamentoModel;

    public OrcamentoProxy(BigDecimal descontoOrcamento, OrcamentoModel orcamentoModel){
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
}
